package com.wuzimei.comprule;

public class RuleIllegalException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public RuleIllegalException(String rule) {
        super("rule(\"" + rule + "\") is illegal.");
    }
}
