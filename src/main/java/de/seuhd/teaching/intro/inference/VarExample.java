package de.seuhd.teaching.intro.inference;

import java.util.HashMap;
import java.util.Map;

public class VarExample {
    void beforeJdk10() {
        String message = "Good bye, Java 9";
        Map<Integer, String> map = new HashMap<>();
        IO.println(message + ", " + map); // Good bye, Java 9, {}
    }

    // JDK >= 10: the compiler infers the type of a local variable from its initializer
    void sinceJdk10() {
        var message = "Hello, Java 10";
        var map = new HashMap<Integer, String>();
        IO.println(message + ", " + map); // Hello, Java 10, {}
    }

    void main() {
        beforeJdk10();
        sinceJdk10();
    }
}
