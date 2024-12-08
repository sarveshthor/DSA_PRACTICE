package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Operations {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,4,22,444,22,1,4,5,3,2,34,23);

        //square all the given numbers
        List<Integer> squaredNumbers = ls.stream().map(n -> n*n).toList();
        System.out.println("Squared Numbers -> " + squaredNumbers);

        //max element
        Optional<Integer> maxElement = ls.stream().max((a,b) -> (a-b));
        maxElement.ifPresent(value -> System.out.println("max value is : " + value));

        //second highest number in the list
        Optional<Integer> secondmax = ls.stream().distinct().sorted((a,b) -> (b-a)).skip(1).findFirst();
        secondmax.ifPresentOrElse(value -> System.out.println("second max number : " + value),
                () -> System.out.println("Not enough distinct elements"));


        //filter out all the even numbers
        List<Integer> evenNumbers = ls.stream().filter(n -> n%2 == 0).toList();
        System.out.println("Even Numbers -> " + evenNumbers);

        //divide the even number list with 2
        List<Integer> evenBy2 = evenNumbers.stream().map(n -> n/2).toList();
        System.out.println("Even by 2 -> " + evenBy2);

        //remove all the duplicate elements in above list
        List<Integer> distinctElements = evenBy2.stream().distinct().toList();
        System.out.println("Distinct elements -> " + distinctElements);

        //now sort the Even Numbers list
        List<Integer> sortedList = evenNumbers.stream().sorted().toList();
        System.out.println("Sorted List -> " + sortedList );

        //sort the above list in descending order
        List<Integer> desc = sortedList.stream().sorted((a,b) -> (b-a)).toList();
        System.out.println("Descending -> " + desc);

        //peek, min, max, count
    }
}
