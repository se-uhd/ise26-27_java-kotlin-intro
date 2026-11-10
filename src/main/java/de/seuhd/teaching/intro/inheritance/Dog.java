package de.seuhd.teaching.intro.inheritance;

public class Dog extends Animal {
    public void sniff() {
        IO.println("Sniffing...");
    }

    @Override // optional
    public void makeSound() {
        IO.println("Barking...");
    }
}
