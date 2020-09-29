package com.codewithnico;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var List = new LinkedList();
        System.out.println(List.size());
        List.addLast(10);
        List.addLast(20);
        List.addLast(30);
        List.addFirst(5);
        List.removeLast();
        List.removeFirst();
        System.out.println(List.size());
        var array = List.toArray();
        System.out.println(Arrays.toString(array));


        System.out.println(List.contains(20));



}
}
