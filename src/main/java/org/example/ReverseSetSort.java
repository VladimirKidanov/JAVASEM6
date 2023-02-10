package org.example;

import java.util.*;

public class ReverseSetSort {
    public ArrayList<Integer> ReverseSetSort(int n, int min, int max) {
        Set<Integer> set1 = new TreeSet<>();
        Random rnd = new Random();
        int k = 0;
        for(int i=0; i<n; i++) 
        {
            do k = rnd.nextInt(min, max); while (set1.contains(k));
            set1.add(k);
        }
        ArrayList<Integer> array1 = new ArrayList<>(set1);
        Collections.sort(array1,Collections.reverseOrder());
        return array1;
    }
}
