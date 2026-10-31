package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Person {
    String name;
    int age;
    // Constructor, getters, and setters

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class StreamIntermediate {
    public static void main(String[] args) {
        int number = 12345;
        int num = 5;
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<String> words = List.of("apple", "banana", "kiwi");

        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25)
        );

        /*===================================*/
        //21. Find the Sum of Digits of a Number
        /*System.out.println(String.valueOf(number).chars().map(Character::getNumericValue).sum());*/

        //22. Find the Factorial of a Number
       /* System.out.println(IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b));*/

        //23. Find the Second-Largest Element in a List
        /*System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());*/

        //24. Find the Second-Smallest Element in a List
       /* System.out.println(numbers.stream().sorted().skip(1).findFirst());
        numbers.stream().sorted().skip(1).findFirst().ifPresent(System.out::println);*/

        //25. Find the Longest String in a List
        /*words.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);*/

        //27. Group a List of Strings by Their Length
        /*words.stream().collect(Collectors.groupingBy(String::length))
                .entrySet().stream()
                .forEach(x-> System.out.println(x.getKey()+":"+x.getValue()));*/

        //28. Group a List of Objects by a Specific Attribute
        /*people.stream().collect(Collectors.groupingBy(Person::getAge)).entrySet().stream()
                .forEach(x-> System.out.println(x.getKey()+":"+x.getValue()));

        people.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())))
                .forEach((age,name) -> System.out.println(age+":"+name));*/

        //29. Partition a List of Integers into Even and Odd Numbers
        numbers.stream().collect(Collectors.partitioningBy(n-> n%2==0)).forEach((x,y)-> System.out.println(x+""+y));
    }
}
