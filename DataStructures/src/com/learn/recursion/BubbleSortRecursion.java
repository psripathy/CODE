package com.learn.recursion;
import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int [] arr = new int[] {6,1,8,5,3};
        bubbleSort(arr, arr.length-1);
        //bubbleSort2(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr, int numOfIterations){

        if(numOfIterations==1)
            return;
        for(int i=0;i<numOfIterations;i++){
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, --numOfIterations);
    }

    static void bubbleSort2(int arr[], int n)
    {
        // Base case
        if (n == 1)
            return;
      
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        
        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n-1);
        
    }

    static void swap(int [] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
