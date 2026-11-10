package de.seuhd.teaching.intro.functional;

public class LambdaExample {
    void main() {
        Greeting greetingAnonymousClass = new Greeting() {
            @Override
            public String greet(String name) {
                return "Hello, " + name;
            }
        };

        Greeting greetingLambda = name -> "Hello, " + name;

        IO.println(greetingAnonymousClass.greet("Students")); // Hello, Students
        IO.println(greetingLambda.greet("Students")); // Hello, Students
    }
}
