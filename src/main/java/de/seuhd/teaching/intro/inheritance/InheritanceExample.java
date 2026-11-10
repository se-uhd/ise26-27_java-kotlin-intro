package de.seuhd.teaching.intro.inheritance;

public class InheritanceExample {
    void main() {
        Animal animal = new Dog();
        animal.eat(); // Eating...
        // Java methods are virtual by default. The call runs makeSound() of Dog because animal refers to a Dog.
        animal.makeSound(); // Barking...

        Duck duck = new Duck();
        duck.makeSound(); // Making sound...
        duck.fly(); // Duck flies
        duck.swim(); // Duck swims

        // an anonymous class that implements Swimmable without overriding swim() inherits the default method
        Swimmable swimmer = new Swimmable() { };
        swimmer.swim(); // Swimming...
    }
}
