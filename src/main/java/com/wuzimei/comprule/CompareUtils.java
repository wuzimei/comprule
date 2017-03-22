package com.wuzimei.comprule;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompareUtils {

    /**
     * rule supports 'eq', 'gt', 'lt', 'neq', 'ngt', 'nlt', example: compare(5, "eq5");
     * @param number
     * @param rule
     * @return
     * @throws RuleIllegalException 
     */
    public static boolean compare(int number, String rule) throws RuleIllegalException {
        String[] prefixAndSuffix = parse(rule);
        if (prefixAndSuffix == null) {
            throw new RuleIllegalException(rule);
        }
        String prefix = prefixAndSuffix[0];
        String suffix = prefixAndSuffix[1];
        Rule r = RuleFactory.buildRule(prefix, Integer.valueOf(suffix));
        return r.compare(number);
    }

    private static String[] parse(String rule) {
        String regEx = "-?[0-9]+$";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(rule);
        if (matcher.find()) {
            String suffix = matcher.group();
            try {
                Integer.valueOf(suffix);
            } catch (Exception e) {
                return null;
            }
            String prefix = rule.replaceAll(suffix, "");
            return new String[]{prefix, suffix};
        } else {
            return null;
        }
        
        
    }
    
    
}
