package de.seuhd.teaching.intro.records;

import java.util.UUID;

public class RecordExample {
    void main() {
        UUID id = UUID.randomUUID();
        User user = new User(id, "Ada", "Lovelace");
        IO.println(user.firstName()); // Ada
        IO.println(user); // User[id=..., firstName=Ada, lastName=Lovelace]
        IO.println(user.equals(new User(id, "Ada", "Lovelace"))); // true

        UserClass userClass = new UserClass(id, "Ada", "Lovelace");
        IO.println(userClass.firstName()); // Ada
        IO.println(userClass.equals(new UserClass(id, "Ada", "Lovelace"))); // false
    }
}
