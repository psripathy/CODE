package com.learn.twopointers;

public class RemoveKeyFromArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 3, 2, 6, 3, 10, 9, 3 };
        System.out.println(removeKeyReturnLength(arr, 3));
    }

    static int removeKeyReturnLength(int [] arr, int key){
        /*
        int result = 0;
        for(int currIndex=0, nextIndex=1; currIndex < arr.length && nextIndex < arr.length; currIndex++){
            if(arr[currIndex] == key){
                while(nextIndex < arr.length && arr[nextIndex] == key){
                    nextIndex++;
                }
                arr[currIndex] = arr[nextIndex];
                arr[nextIndex] = key;
                nextIndex++;
                result++;
            }
        }
        */
        int nextElement = 0; // index of the next element which is not 'key'
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] != key) {
            arr[nextElement] = arr[i];
            nextElement++;
          }
        }

        return nextElement;
    }
}
