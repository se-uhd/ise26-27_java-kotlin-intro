package de.seuhd.teaching.intro.util;

public class MyObject {
    public int value;
    private final Integer VALUE = 1;

    static void main() {
        var o = new MyObject();
        IO.println(o.VALUE);
        o.doSomething();
    }

    private void doSomething() {
        Integer otherValue = VALUE;
        otherValue++;
        IO.println(VALUE);
        IO.println(otherValue);
    }
}
