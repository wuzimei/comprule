# comprule
compare number by rule expression like 'eq0', 'gt2', 'lt3', 'neq9', 'ngt8', 'nlt5'

# how to use
You can run it like following:
```
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
```

# how to build
git clone this project and run 'mvn package', then you can get the jar file in target/ folder.
