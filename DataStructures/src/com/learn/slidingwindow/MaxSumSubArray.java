package com.learn.slidingwindow;

public class MaxSumSubArray {
    public static void main(String[] args) {
        System.out.println(maxSumofSizeK(new int[] {1,5,7,2,8,4,2}, 3));
    }

    static int maxSumofSizeK(int [] arr, int K){
        int start = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int end=0;end<arr.length;end++){
            currentSum += arr[end];        
            if(end >= K-1){
                maxSum = Math.max(maxSum, currentSum);
                currentSum = currentSum - arr[start];
                start++;
            }
        }
        return maxSum;
    }
}

