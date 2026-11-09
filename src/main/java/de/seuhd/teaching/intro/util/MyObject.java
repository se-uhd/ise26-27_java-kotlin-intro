package de.seuhd.teaching.intro.util;

public class MyObject {
    public int value;
    private final Integer VALUE = 1;

    void main() {
        IO.println(VALUE);
        doSomething();
    }

    private void doSomething() {
        Integer otherValue = VALUE;
        otherValue++;
        IO.println(VALUE);
        IO.println(otherValue);
    }
}
