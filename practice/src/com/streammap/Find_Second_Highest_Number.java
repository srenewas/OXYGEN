package com.streammap;

import java.util.*;
import java.util.stream.Collectors;

public class Find_Second_Highest_Number {
    public static void main(String[] args) {
        /*List<Integer> li = List.of(3,6,7,1,9,30);
        Optional<Integer> op = li.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();*/

        int[] a = {4,1,5,7,9,10,11};
        Optional<Integer> li = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(li.orElse(null));

        String s = "buddu";
        String ss = new StringBuilder(s).reverse().toString();
        //System.out.println(ss);
        ss.chars().mapToObj(c->(char) c).forEach(System.out::println);

    }
}



