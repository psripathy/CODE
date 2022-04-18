package com.learn.twopointers;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{2, 3, 3, 3, 6, 9, 9}));
    }

    static int removeDuplicates(int [] arr){

        int nextUniqueIndex = 1;
        for(int next=1; next<arr.length; next++){
            if(arr[nextUniqueIndex-1] != arr[next]){
                arr[nextUniqueIndex] = arr[next];
                nextUniqueIndex++;
            }
        }
        return nextUniqueIndex;
    }
}
