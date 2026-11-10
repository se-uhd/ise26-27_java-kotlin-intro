package de.seuhd.teaching.intro.records;

import java.util.UUID;

// the class that the record User replaces, without the equals, hashCode, and toString that the record also generates
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
