package de.seuhd.teaching.intro.inheritance;

public class InheritanceExample {
    void main() {
        Animal animal = new Dog();
        animal.eat(); // Eating...
        // Java methods are virtual by default: the actual type Dog decides which method runs
        animal.makeSound(); // Barking...

        Duck duck = new Duck();
        duck.makeSound(); // Making sound...
        duck.fly(); // Duck flies
        duck.swim(); // Duck swims

        // a class that implements Swimmable without overriding swim() gets the default method
        Swimmable swimmer = new Swimmable() { };
        swimmer.swim(); // Swimming...
    }
}
