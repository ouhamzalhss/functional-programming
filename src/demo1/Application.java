package demo1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Lhouceine OUHAMZA
 */

/**
 * print list : using for and lambda
 * count of list
 * calculate sum of list elements
 * filter a list (odd numbers) SFCF
 * filter using predicate
 */
public class Application {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(10, 45, 17, 22);
     //list.forEach(System.out::println);
      //  System.out.println(list.stream().count());
      //  System.out.println(list.stream().reduce(0,Integer::sum));
     //   Predicate<Integer> predicate = n -> n % 2 == 0;
     //   List<Integer> collect = list.stream().filter(predicate::test).collect(Collectors.toList());
      //  collect.forEach(System.out::println);
    }
}
