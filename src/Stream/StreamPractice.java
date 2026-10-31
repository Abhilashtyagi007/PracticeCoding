package Stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> duplicateContains = List.of(1,1, 2,2, 3,5, 4, 5);
        List<String> words = List.of("hello", "world");


        /*--------------------------------------------*/
        //1. Find the Sum of All Elements in a List
        /*System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println(numbers.stream().collect(Collectors.summingInt(Integer::intValue)));*/

        //2. Find the Product of All Elements in a List
//        System.out.println(numbers.stream().reduce(1, (a, b) -> a * b));

        //3. Find the Average of All Elements in a List
        /*System.out.println(numbers.stream().mapToInt(Integer::intValue).average());*/

        //7. Check if a List Contains a Specific Element
       /* System.out.println(numbers.stream().anyMatch(n -> n == 3));*/

        //8. Filter Out Even Numbers from a List
        //System.out.println(numbers.stream().filter(n -> n % 2 == 0).toList());

        //10. Convert a List of Strings to Uppercase
        //System.out.println(words.stream().map(String::toUpperCase).toList());

        //11. Convert a List of Integers to Their Squares
        /*numbers.stream().mapToInt(n -> n*n).forEach(System.out::println);*/

        //13. Find the Last Element in a List
        /*System.out.println(numbers.stream().reduce((a, b) -> b).orElse(0));*/

        //16. Remove Duplicate Elements from a List --Not solved
        /* Set<Integer> seen = new HashSet<>();
        numbers.stream().map( x -> if(!seen.contains(x)){
            seen.add(x);
        })*/

    }
}
