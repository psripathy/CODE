package com.learn.cyclicsort;

import java.util.Arrays;

public class DuplicateAndMissingNumber {
    //[1,2,2,4]
    //[2,3]
    public static int[] findMissingAndDuplicate(int [] arr){
        int [] result = new int[2];
/*
        int currIndex = 0;
        while(currIndex < arr.length){
            int valueAtCurrIndex = arr[currIndex];
            int correctIndexforCurrentValue = arr[currIndex]-1;
            if(valueAtCurrIndex != arr[correctIndexforCurrentValue]){
                result[0] = valueAtCurrIndex;
                result[1] = valueAtCurrIndex+1;
            }else {
                currIndex++;
            }
        }
        */
         
        for(int i=0;i<arr.length;i++){
            if(arr[i] != i+1){
                result[0] = arr[i-1];
                result[1] = i+1;
            }            
        }
        return result;
    }
    public static void swap(int [] arr, int currIndex, int correctIndex){
        int temp = arr[currIndex];
        arr[currIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

    public static void main(String args[]){
        System.out.println(Arrays.toString(findMissingAndDuplicate(new int[]{1,2,2,4})));
        System.out.println(Arrays.toString(findMissingAndDuplicate(new int[]{1,1})));
    }
}
