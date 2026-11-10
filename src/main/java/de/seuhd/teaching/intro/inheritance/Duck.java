package de.seuhd.teaching.intro.inheritance;

class Duck extends Animal
           implements Flyable,
                      Swimmable {
    public void fly() {
        IO.println("Duck flies");
    }

    public void swim() { // default can be overridden
        IO.println("Duck swims");
    }
}
