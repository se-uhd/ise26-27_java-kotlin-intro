package de.seuhd.teaching.intro.boxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    void main() {
        List<Integer> list = new ArrayList<>();
        // autoboxing: int -> Integer
        list.add(5);
        list.add(10);
        list.add(15);
        int sum = 0;
        for (Integer value : list) {
            // unboxing: Integer -> int
            sum += value;
        }
        // automatic conversion of sum to String
        IO.println("Sum = " + sum); // Sum = 30

        // If you want to work with primitives only, you can use arrays:
        int[] arr = {5, 10, 15};
        IO.println(Arrays.toString(arr)); // [5, 10, 15]
    }
}
