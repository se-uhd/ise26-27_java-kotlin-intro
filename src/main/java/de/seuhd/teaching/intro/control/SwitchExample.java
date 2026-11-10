package de.seuhd.teaching.intro.control;

public class SwitchExample {
    String classify(String day) {
        // JDK >= 14: switch as an expression, multiple case labels, no fall through, so no break
        String result = switch (day) {
            case "MON", "TUE", "WED", "THU", "FRI" -> "Weekday";
            case "SAT", "SUN" -> "Weekend";
            default -> "Invalid";
        };
        return result;
    }

    void main() {
        IO.println(classify("TUE")); // Weekday
        IO.println(classify("SUN")); // Weekend
        IO.println(classify("XYZ")); // Invalid
    }
}
