package nl.rug.lambdas;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Testje {

    int foo(byte b) {
        return 3;
    }

    String foo(short s) {
        return "noot";
    }
}

public class App {

    public static void main(String[] args) {

        // oude manier
        List<Integer> numbers = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        {

            // pak alleen de even numbers, en maak een Lijst en print die.

            List<Integer> even = new ArrayList<>();
            for (int element : numbers) {
                if (element % 2 == 0) {
                    even.add(element);
                }
            }

            System.out.println(even);
        }

        System.out.println("En nu met lambda ... ");

        int a = 15;

        // lambda
       numbers = numbers.stream()
                .distinct()
                .filter(n -> n % 2 != 0)
                .filter(n -> n <= 8)
               .filter(new NumberPredicateLarger())
               .filter(n -> n != 15)
                .map(n -> n * n)
               .map(n -> {
                   if(n >= 13) {
//                       a++; // vout, want a is hierboven (impliciet) final
                       System.out.println(a); // ok, a is gewoon (als final impliciet) hier in scope.
                   }
                   return n;
               })
                .collect(Collectors.toList());

        System.out.println(numbers);

        numbers.stream().filter(n -> n >5).forEach(System.out::println);

    }
}

class NumberPredicateLarger implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer > 3;
    }
}
