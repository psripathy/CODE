package com.learn.recursion;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RotatedArrBinarySearchRecursion {
    public static void main(String[] args) {
        int [] arr = new int[]{4,5,6,7,8,1,2,3};
        int [] arr2 = new int[]{8,1,2,3,4,5,6,7};
        int [] arr3 = new int[]{5,6,1,2,3,4};
        int target = 2;
        int start = 0, end = arr.length-1;
        System.out.println(rotatedSearch(arr, target, start, end));
        System.out.println(rotatedSearch(arr2, target, start, end));
        System.out.println(rotatedSearch(arr3, target, start, end));        
    }

    static int rotatedSearch(int [] arr, int target, int start, int end){

        int mid = start + (end-start)/2;
        //System.out.println("mid = " + mid);
        if(arr[mid] == target)
            return mid;
        //1. left half is sorted
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target < arr[mid]){
                return rotatedSearch(arr, target, start, mid-1);
            }else {
                return rotatedSearch(arr, target, mid+1, end);
            }
        }else {//right half is sorted
            if(target >= arr[mid+1] && target <= arr[end]){
                return rotatedSearch(arr, target, mid+1, end);
            }else {
                return rotatedSearch(arr, target, start, mid-1);
            }
        }
    }
}
