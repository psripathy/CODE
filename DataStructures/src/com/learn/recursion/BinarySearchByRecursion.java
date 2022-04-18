package com.learn.recursion;

public class BinarySearchByRecursion {
    public static void main(String[] args) {
        int [] arr = {1,4,6,9,15,17,22,25,26,99,101};
        System.out.println(bSearch(arr, 26, 0, arr.length-1));

    }
    static int bSearch(int[] arr, int target, int startIndex, int endIndex){

        int mid = startIndex + (endIndex - startIndex)/2;
        if(arr[mid] == target){
            return mid;
        } else if(arr[mid] > target) {
            return bSearch(arr, target, startIndex, mid-1);
        }
        return bSearch(arr, target, mid+1, endIndex);
    }
}
