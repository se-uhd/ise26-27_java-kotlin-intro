package de.seuhd.teaching.intro.records;

import java.util.UUID;

// the class that the record User replaces. Unlike the record, this class does not override equals, hashCode, and
// toString.
class UserClass {
    private final UUID id;
    private final String firstName;
    private final String lastName;

    public UserClass(UUID id, String firstName, String lastName) {
        this.id = id; this.firstName = firstName; this.lastName = lastName;
    }

    public UUID id() { return id; }

    public String firstName() { return firstName; }

    public String lastName() { return lastName; }
}
