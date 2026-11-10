package de.seuhd.teaching.intro.passing;

public class PassByValue {
    void foo(Dog d) {
        // create a "Fifi" dog
        d = new Dog("Fifi");
    }

    void main() {
        // create a "Max" dog
        Dog aDog = new Dog("Max");

        // aDog points to the "Max" dog
        foo(aDog);
        // and now?

        IO.println(aDog.getName()); // Max
    }
}
