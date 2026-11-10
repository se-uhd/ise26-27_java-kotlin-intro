package de.seuhd.teaching.intro.boxing;

public class BoxingExample {
    void main() {
        int num = 10;            // primitive
        Integer boxedNum = num;  // autoboxing
        // Integer boxedNum = Integer.valueOf(num);  // compiler adds this
        int otherNum = boxedNum; // unboxing
        // int otherNum = boxedNum.intValue();  // compiler adds this
        IO.println(otherNum); // 10
    }
}
