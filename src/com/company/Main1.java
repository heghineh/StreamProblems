package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
    //Արժեքը փոխարինել (արժեք * 3 +4)-ով և հաշվել միջինը
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(11);
        numbers.add(7);
        numbers.add(6);

        Stream<Integer> stream = numbers.stream();
        List<Integer> newList = (List<Integer>) stream
                .map(each -> (each * 3 + 4))
                .collect(Collectors.toList());

        OptionalDouble average = newList.stream().mapToInt(each -> each).average();
        
        System.out.println("Average = " + average);
    }
}
