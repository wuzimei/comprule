package com.wuzimei.comprule;

public class NeqRule extends Rule {

    public NeqRule(int ruleValue) {
        super(ruleValue);
    }

    @Override
    public boolean compare(int input) {
        if (input != ruleValue) {
            return true;
        }
        return false;
    }

}
