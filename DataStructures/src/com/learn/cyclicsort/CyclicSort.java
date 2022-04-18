package com.learn.cyclicsort;
import java.util.Arrays;

public class CyclicSort {
    //[3,5,2,1,4]
    // 0,1,2,3,4
    public static int[] sortArray(int arr[]){

        int i=0;
        while(arr[i] != i+1){
            swap(arr, i);
            if(arr[i] == i+1)
                i++;
        }
        return arr;
    }
    public static void swap(int [] arr, int i){
        int temp = arr[i];
        arr[i] = arr[temp-1];
        arr[temp-1] = temp;
    }
    public static void main(String [] args){
        System.out.println(Arrays.toString(sortArray(new int[]{3,5,2,1,4})));
        System.out.println(Arrays.toString(sortArray(new int[]{5,4,3,2,1})));
    }
}
