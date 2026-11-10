package de.seuhd.teaching.intro.inheritance;

interface Swimmable {
    // default behavior independent of object state
    default void swim() {
        IO.println("Swimming...");
    }
}
