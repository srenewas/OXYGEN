package com.streammap;

import java.util.List;

public class FindOddEvenNumber {
    public static void main(String[] args) {
        List<Integer> all = List.of(12,93,17,73,77,33,22,6,0);
        System.out.println("****************Only_Odd_Numbers****************");
        all.stream().filter(s->s%2!=0).forEach(System.out::println); // This will print only Odd Numbers


        System.out.println("****************Only_Even_Numbers****************");
        all.stream().filter(s->s%2==0).forEach(System.out::println); // This will print only Even Numbers
    }
}
