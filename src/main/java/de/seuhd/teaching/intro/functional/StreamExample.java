package de.seuhd.teaching.intro.functional;

import java.util.List;

public class StreamExample {
    void main() {
        List<String> oldList = List.of("ab", "ace", "abcd");
        List<String> newList = oldList.stream()
            .filter(element -> element.length() > 2)
            .map(element -> element.substring(0, 2))
            .toList();
        IO.println(newList); // [ac, ab]
        // the stream pipeline does not modify its source
        IO.println(oldList); // [ab, ace, abcd]
    }
}
