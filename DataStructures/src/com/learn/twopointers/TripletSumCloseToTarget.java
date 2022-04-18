package com.learn.twopointers;
//Two pointer

//Given Input: [-2, 0, 1, 2] & K=2, find sum of triplet closest to K. If more than one triplet return sum of smallest triplet
//Output: 1
//Explanation: of the 2 triplets [-2,1,2] = 1 & [0,1,2] = 3 & The triplet [-2, 1, 2] has the smallest closest sum to the target.

import java.util.*;
public class TripletSumCloseToTarget {

    public static int getSmallestTripletSum(int [] arr, int K){
        Arrays.sort(arr);
        int smallestTripletSum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-2; i++){
            int curr = i+1, end = arr.length -1;
            while(curr < end){
                int diff = K - arr[i] - arr[curr] - arr[end];
                if(diff == 0){
                    return K;
                }
                smallestTripletSum = Math.min(Math.abs(diff), Math.abs(smallestTripletSum));
                curr++;
            }
        }
        return smallestTripletSum;
    }

    public static void main(String [] a){
        System.out.println("===> " + TripletSumCloseToTarget.getSmallestTripletSum(new int[] {-2, 0, 1, 2}, 2));
    }
}