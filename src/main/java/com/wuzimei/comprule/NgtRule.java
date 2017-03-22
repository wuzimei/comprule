package com.wuzimei.comprule;

public class NgtRule extends Rule {

    public NgtRule(int ruleValue) {
        super(ruleValue);
    }

    @Override
    public boolean compare(int input) {
        if (input <= ruleValue) {
            return true;
        }
        return false;
    }

}
