package com.wuzimei.comprule;

public class LtRule extends Rule {

    public LtRule(int ruleValue) {
        super(ruleValue);
    }

    @Override
    public boolean compare(int input) {
        if (input < ruleValue) {
            return true;
        }
        return false;
    }

}
