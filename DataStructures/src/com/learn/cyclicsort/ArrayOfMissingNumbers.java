package com.learn.cyclicsort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//[4, 3, 2, 7, 8, 2, 3, 1]: len = N = 8
//[5,6]
public class ArrayOfMissingNumbers {
    
    public static List<Integer> missingNumArr(int arr[]){

        List<Integer> missingNums = new ArrayList<>();
        int currIndex=0;
        while(currIndex < arr.length){
            int valueAtCurrIndex = arr[currIndex];
            int correctIndexforCurrentValue = valueAtCurrIndex-1;
            if(valueAtCurrIndex != arr[correctIndexforCurrentValue]){
                swap(arr, currIndex, correctIndexforCurrentValue);
            } else {
                currIndex++;
            }
            System.out.println("currIndex at " + currIndex + " on " + Arrays.toString(arr));
        }
        /*
        while(arr[currIndex] != currIndex+1){
            System.out.println("Starting at index " + currIndex);
            int expectedIndexValue = currIndex+1;
            if(expectedIndexValue != arr[currIndex]){
                swap(arr, currIndex);
            }else {
                currIndex++;
            }
            System.out.println("currIndex at " + currIndex + " on " + Arrays.toString(arr));
        }*/
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                missingNums.add(i+1);
            }
        }
        return missingNums;
    }

    public static void swap(int [] arr, int currIndex, int correctIndex){
        int temp = arr[currIndex];
        arr[currIndex] = arr[correctIndex];
        arr[correctIndex] = temp;        
    }
    public static void main(String [] args){
        System.out.println(missingNumArr(new int[]{4,3,2,7,8,2,3,1}));
    }
}
