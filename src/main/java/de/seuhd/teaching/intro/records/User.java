package de.seuhd.teaching.intro.records;

import java.util.UUID;

record User(UUID id, String firstName, String lastName) {}
