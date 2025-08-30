package LLD1.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicate {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(8));
        System.out.println(isEven.test(10));

        List<Integer> list = Arrays.asList(5,12,25,7,30,45,50);
        Predicate<Integer> isGreaterThan20 = n -> n > 20;

        List<Integer> ans = list.stream()
                .filter(isEven.and(isGreaterThan20))
                .collect(Collectors.toList());

    }
}
