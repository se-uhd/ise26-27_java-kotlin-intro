package de.seuhd.teaching.intro.reflection;

import java.lang.reflect.Method;

// call a private method
public class ReflectionExample2 {
    void main() {
        try {
            Example example = new Example();
            Method method = Example.class.getDeclaredMethod("privateMethod", String.class);
            method.setAccessible(true);
            method.invoke(example, "Hello, Reflection!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
