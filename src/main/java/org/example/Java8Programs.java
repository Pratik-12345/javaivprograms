package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Java8Programs {
    public static void main(String[] args) {
        int[] arr = {12,55,17,21,7};

        fetchSecondSmallest(arr);
    }

    public static void fetchSecondSmallest(int[] arr){
       int secondSmallest =  Arrays.stream(arr).sorted().skip(1).findAny().orElseThrow(()-> new IllegalArgumentException("Array does not have a second smallest element."));
        System.out.println(secondSmallest);
    }
}
