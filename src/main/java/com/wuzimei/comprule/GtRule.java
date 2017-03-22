package com.wuzimei.comprule;

public class GtRule extends Rule {

    public GtRule(int ruleValue) {
        super(ruleValue);
    }

    @Override
    public boolean compare(int input) {
        if (input > ruleValue) {
            return true;
        }
        return false;
    }

}
