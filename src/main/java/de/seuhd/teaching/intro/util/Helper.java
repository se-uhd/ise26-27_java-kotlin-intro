package de.seuhd.teaching.intro.util;

public class Helper {
    public static final String GROUP_NAME = "SE@UHD";

    public void doSomething() {
        System.out.println("Doing something...");
    }

    public static void doSomethingElse() {
        System.out.println("Doing something else...");
    }

    public void changeObject(MyObject obj, int newValue) {
        obj.value = newValue;
    }
}


