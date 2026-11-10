// create package with name de.seuhd.teaching.intro,
// must be located in directory de/seuhd/teaching/intro
package de.seuhd.teaching.intro;

import de.seuhd.teaching.intro.util.Helper;
// imports interface List from package java.util
import java.util.List;
// imports static constant
import static de.seuhd.teaching.intro.util.Helper.GROUP_NAME;

public class Main {
    void main() {
        IO.println("Hello, World!");
        // List.of is a static method for creating unmodifiable lists
        List<String> items = List.of("Apple", "Banana", "Cherry");
        IO.println(items);

        var h = new Helper();
        h.doSomething();  // member function
        Helper.doSomethingElse();   // static (class) function
        IO.println("Hello, " + GROUP_NAME + "!");
    }
}
