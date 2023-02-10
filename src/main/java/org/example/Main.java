package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       ReverseSetSort rvrsSortSet = new ReverseSetSort();
       ArrayList<Integer> sortSet = new ArrayList<>();
       sortSet = rvrsSortSet.ReverseSetSort(10,0,100);
       System.out.println("Ниже представлено множество случайных чисел, отсортированное в обратном порядке");
       sortSet.forEach(b-> System.out.print(b+" , "));


    }
}