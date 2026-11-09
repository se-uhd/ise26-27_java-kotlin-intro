package de.seuhd.teaching.intro.interop;

import de.seuhd.teaching.intro.kotlin.ClassesKt;
import de.seuhd.teaching.intro.kotlin.Contact;
import de.seuhd.teaching.intro.kotlin.Point;

public class JavaCallsKotlin {
    void main() {
        // Kotlin properties appear as getters and setters
        Contact contact = new Contact(1, "mary@gmail.com");
        contact.setEmail("jane@gmail.com");
        IO.println(contact.getEmail());

        // a data class generates equals, hashCode, toString, and copy
        Point point = new Point(10, 20);
        IO.println(point.getX() + ", " + point.getY());
        IO.println(point.equals(new Point(10, 20)));

        // top-level and extension functions in Classes.kt are static methods of the class ClassesKt
        IO.println(ClassesKt.unaryMinus(point));

        // Kotlin checks at runtime that a non-null parameter does not receive null
        try {
            new Contact(2, null);
        } catch (NullPointerException e) {
            IO.println(e.getMessage());
        }
    }
}
