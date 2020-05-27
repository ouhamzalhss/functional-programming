package demo5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Lhouceine OUHAMZA
 */

/**
 * create Arrays of Arrays
 * Convert Stream<List<String>> to a simpler Stream<String>
 */
public class MapAndFlatMAp {
    public static void main(String[] args){

        List<List<String>> list = Arrays.asList(
                Arrays.asList("js", "java"),
                Arrays.asList("php", "C++")
        );

        List<String> collect = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());



    }
}

