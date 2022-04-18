package com.learn.recursion;
public class CheckIfArrayIsSortedRecursion {
    public static void main(String[] args) {
        System.out.println(checkArray(new int[]{1,2,3,4,5}, 0));
    }

    static boolean checkArray(int [] arr, int currIndex){
        if(currIndex == arr.length-1)
            return true;
        return arr[currIndex] < arr[currIndex+1] && checkArray(arr, currIndex+1);
    }
}
