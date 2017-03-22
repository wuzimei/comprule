package com.wuzimei.comprule;

public abstract class Rule {

    protected int ruleValue;
    
    public Rule(int ruleValue) {
        this.ruleValue = ruleValue;
    }
    
    abstract public boolean compare(int input);
}
