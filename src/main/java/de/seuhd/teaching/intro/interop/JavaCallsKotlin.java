package de.seuhd.teaching.intro.interop;

import de.seuhd.teaching.intro.kotlin.ClassesKt;
import de.seuhd.teaching.intro.kotlin.Contact;
import de.seuhd.teaching.intro.kotlin.Point;
import de.seuhd.teaching.intro.kotlin.User;

public class JavaCallsKotlin {
    void main() {
        // Java accesses Kotlin properties through getters and setters
        Contact contact = new Contact(1, "mary@gmail.com");
        contact.setEmail("jane@gmail.com");
        IO.println(contact.getEmail());

        // for a data class, the compiler generates equals, hashCode, toString, and copy
        Point point = new Point(10, 20);
        IO.println(point.getX() + ", " + point.getY());
        IO.println(point.equals(new Point(10, 20)));

        // top-level and extension functions in Classes.kt compile to static methods of the class ClassesKt
        IO.println(ClassesKt.unaryMinus(point));

        // functions of a companion object are called through its static field Companion,
        // and a const val becomes a static final field
        User guest = User.Companion.guest();
        IO.println(guest.getLoginName() + ", " + User.MAX_LOGIN_NAME_LENGTH);

        // Kotlin checks non-null parameters at runtime. Passing null for email throws a NullPointerException.
        try {
            new Contact(2, null);
        } catch (NullPointerException e) {
            IO.println(e.getMessage());
        }
    }
}
