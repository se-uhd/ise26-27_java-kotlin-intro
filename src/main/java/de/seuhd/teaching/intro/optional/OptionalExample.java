package de.seuhd.teaching.intro.optional;

import java.util.Optional;

public class OptionalExample {
    void main() {
        String oldWay = null;
        Optional<String> newWay = Optional.empty();

        Optional<String> opt1 = Optional.of("String");
        Optional<String> opt2 = Optional.ofNullable(oldWay);

        String str1 = opt1.orElse("default");
        IO.println(str1); // String
        IO.println(newWay.isPresent()); // false
        try {
            String str2 = opt2.orElseThrow(() -> new IllegalArgumentException("oldWay is null"));
            IO.println(str2);
        } catch (IllegalArgumentException e) {
            IO.println(e.getMessage()); // oldWay is null
        }
    }
}
