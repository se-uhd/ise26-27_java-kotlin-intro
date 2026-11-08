// create package with name de.seuhd.teaching.intro,
// needs to be located in directory de/seuhd/teaching/intro
package de.seuhd.teaching.intro;

import de.seuhd.teaching.intro.util.Helper;

import java.util.List;  // imports interface List from package java.util

import static de.seuhd.teaching.intro.util.Helper.GROUP_NAME;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // List.of is a static method for creating unmodifiable lists
        List<String> items = List.of("Apple", "Banana", "Cherry");
        System.out.println(items);
        var h = new Helper();
        h.doSomething();
        Helper.doSomethingElse();
        System.out.printf("Hello, %s!\n", GROUP_NAME);
    }
}
