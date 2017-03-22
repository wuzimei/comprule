package com.wuzimei.comprule;

public class EqRule extends Rule {

    public EqRule(int ruleValue) {
        super(ruleValue);
    }

    @Override
    public boolean compare(int input) {
        if (input == ruleValue) {
            return true;
        }
        return false;
    }

    
}
