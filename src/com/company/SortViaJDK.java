package com.company;

import java.util.Arrays;    // import Array class first

public class SortViaJDK {
    public static void  main(String[] args){

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

       Arrays.sort(intArray);  //dual Pivot quick sort algorithm
        Arrays.parallelSort(intArray); //hybrid algorith of sort

        for ( int i = 0 ; i < intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}
