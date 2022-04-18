package com.learn.recursion;
import java.util.Arrays;

public class SelectionSortRecursion {
    
    public static void main(String[] args) {
        int [] arr = new int[]{6,1,8,5,3};
        selectionSort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int [] arr, int n){
        //In: {6,1,8,5,3}
        //Out: {8,6,5,3,1}
        if(n==0)
            return;
        for(int i=0; i<n; i++){
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        selectionSort(arr, --n);
    }
}
