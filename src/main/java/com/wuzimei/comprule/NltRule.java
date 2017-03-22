package com.wuzimei.comprule;

public class NltRule extends Rule {

    public NltRule(int ruleValue) {
        super(ruleValue);
    }

    @Override
    public boolean compare(int input) {
        if (input >= ruleValue) {
            return true;
        }
        return false;
    }

}
