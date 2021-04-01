package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
//a-ով և b-ով սկսվողները ֆիլտրել, դարձնել մեծատառ և սորտավորել
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("sffaf");
        strings.add("aseggffaf");
        strings.add("Adrgtsff");
        strings.add("sjyfjd");
        strings.add("bsffaf");
        strings.add("aauifh");
        strings.add("bdsij");
        strings.add("Aihoikd");

        Stream<String> stream = strings.stream();

        List<String> newList = stream
                .filter((each) -> each.startsWith("a") || each.startsWith("b"))
                .map(each -> each.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(newList);

    }
}
