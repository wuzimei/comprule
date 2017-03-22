package com.wuzimei.comprule;

public class RuleFactory {

    private static final String PREFIX_EQ = "eq";
    private static final String PREFIX_GT = "gt";
    private static final String PREFIX_NGT = "ngt";
    private static final String PREFIX_LT = "lt";
    private static final String PREFIX_NLT = "nlt";
    private static final String PREFIX_NEQ = "neq";
    
    public static Rule buildRule(String prefix, Integer suffix) throws RuleIllegalException {
        Rule rule = null;
        if (PREFIX_EQ.equalsIgnoreCase(prefix)) {
            rule = new EqRule(suffix);
        } else if (PREFIX_GT.equalsIgnoreCase(prefix)) {
            rule = new GtRule(suffix);
        } else if (PREFIX_LT.equalsIgnoreCase(prefix)) {
            rule = new LtRule(suffix);
        } else if (PREFIX_NGT.equalsIgnoreCase(prefix)) {
            rule = new NgtRule(suffix);
        } else if (PREFIX_NLT.equalsIgnoreCase(prefix)) {
            rule = new NltRule(suffix);
        } else if (PREFIX_NEQ.equalsIgnoreCase(prefix)) {
            rule = new NeqRule(suffix);
        } else {
            // nothing
            throw new RuleIllegalException(prefix + suffix);
        }
        return rule;
    }
}
