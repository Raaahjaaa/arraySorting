package com.company;

public class bubbleSort {
    public static void main (String[] arg){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastunSortedIndex = intArray.length - 1;lastunSortedIndex > 0; lastunSortedIndex--)
        {
            for (int i = 0;i <lastunSortedIndex;i++){
                if (intArray[i] > intArray[i+1]){
                swap(intArray,i,i+1);
                }
            }
            for (int i =1; i<= lastunSortedIndex;i++){
                System.out.println(intArray[i]);
            }
        }

    }

    public static void swap(int intArray[],int i, int j) {
        if (i == j){
            return;
        }
        int temp = intArray[i];
            intArray[i] = intArray[j];
            intArray [j] = temp;
    }
}
