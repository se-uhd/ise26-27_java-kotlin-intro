package de.seuhd.teaching.intro.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // can be accessed at runtime
@Target(ElementType.METHOD) // applicable to methods only
public @interface Todo {
    String description()
        default "Missing description";
}
