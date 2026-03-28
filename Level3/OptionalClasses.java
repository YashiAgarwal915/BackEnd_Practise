package src.main.java.Level3;

import java.util.Optional;

public class OptionalClasses {
    public static void main(String[] args){

        // Task 1
        Optional<String> op = Optional.of("Yashi");
        op.ifPresent(n -> System.out.println(n));
        System.out.println(op.orElse("Default"));

        // Task 2
        Optional<String> op1 = Optional.ofNullable(null);
        System.out.println(op1.orElse("Default"));

        // Task 3
        Optional<String> op3 = Optional.of("Yashi");
        String name = op3.orElseThrow(() -> new RuntimeException("No value"));
        System.out.println(name);

        // Challenge
        String email = null;
        Optional<String> op4 = Optional.ofNullable(email);

        op4.ifPresent(n -> System.out.println(n));
        System.out.println(op4.orElse("Email not found"));
    }
}
