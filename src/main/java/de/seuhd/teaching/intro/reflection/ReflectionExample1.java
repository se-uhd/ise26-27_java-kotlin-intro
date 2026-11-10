package de.seuhd.teaching.intro.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// print the public methods that a class declares
public class ReflectionExample1 {
    void main() {
        String str = "Hello, World!";
        Class<? extends String> c = str.getClass();
        for (Method m : c.getDeclaredMethods()) {
            if (Modifier.isPublic(m.getModifiers())) {
                IO.println(m.getName());
            }
        }
    }
}
