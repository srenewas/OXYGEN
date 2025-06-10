package com.streammap;

import java.util.List;
import java.util.stream.Collectors;

public class Reverse_String {
    public static void main(String[] args) {
        String s = "buddu";
        //List<Character> ss = new StringBuilder(s).reverse().chars().mapToObj(c->(char)c).collect(Collectors.toList());
        String ss = new StringBuilder(s).reverse().toString();
        //System.out.println(ss);
        ss.chars().mapToObj(c->(char) c).forEach(System.out::println);
    }
}
