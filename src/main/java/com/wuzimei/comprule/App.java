package com.wuzimei.comprule;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws RuleIllegalException
    {
        System.out.println("1 = 1? " + CompareUtils.compare(1, "eq1"));
        System.out.println("-1 = -1? " + (CompareUtils.compare(-1, "eq-1")));
        System.out.println("0 = 0? " + CompareUtils.compare(0, "eq0"));
        System.out.println("1 = 0? " + CompareUtils.compare(1, "eq0"));
        System.out.println("1 > -1? " + CompareUtils.compare(1, "gt-1"));
        System.out.println("1 > 0? " + CompareUtils.compare(1, "gt0"));
        System.out.println("1 > 1? " + CompareUtils.compare(1, "gt1"));
        System.out.println("1 > 2? " + CompareUtils.compare(1, "gt2"));
        System.out.println("1 < 2? " + CompareUtils.compare(1, "lt2"));
        System.out.println("2 < 2? " + CompareUtils.compare(2, "lt2"));
        System.out.println("2 >= 2? " + CompareUtils.compare(2, "nlt2"));
        System.out.println("3 >= 2? " + CompareUtils.compare(3, "nlt2"));
        System.out.println("1 >= 2? " + CompareUtils.compare(1, "nlt2"));
        System.out.println("2 <= 2? " + CompareUtils.compare(2, "ngt2"));
        System.out.println("3 <= 2? " + CompareUtils.compare(3, "ngt2"));
        System.out.println("1 <= 2? " + CompareUtils.compare(1, "ngt2"));
        System.out.println("2 != 2? " + CompareUtils.compare(2, "neq2"));
        System.out.println("1 != 2? " + CompareUtils.compare(1, "neq2"));
        System.out.println("257 > 256? " + CompareUtils.compare(257, "gt256"));
        System.out.println("256 = 256? " + CompareUtils.compare(256, "eq256"));
        System.out.println("255 = 256? " + CompareUtils.compare(255, "gt256"));
        System.out.println("255 = 256? " + CompareUtils.compare(255, "gtnull"));
    }
}
