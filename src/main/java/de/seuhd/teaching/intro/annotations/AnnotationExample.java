package de.seuhd.teaching.intro.annotations;

import java.lang.reflect.Method;

public class AnnotationExample {
    @Todo(description = "Need to implement this")
    public void doSomething() { }

    void main() throws NoSuchMethodException {
        // Java reflection (see the reflection examples)
        Method method = AnnotationExample.class.getMethod("doSomething");
        Todo todo = method.getAnnotation(
            Todo.class
        );
        if (todo != null) {
            IO.println("Todo: "
                + todo.description()); // Todo: Need to implement this
        }
    }
}
