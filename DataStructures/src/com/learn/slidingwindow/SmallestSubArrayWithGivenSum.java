package com.learn.slidingwindow;

public class SmallestSubArrayWithGivenSum {
    public static void main(String[] args) {
        //findSmallestSubArrayWithSum >= 8
        System.out.println(getSubArray(new int[] {4,2,2,7,8,1,2,8,1,0}, 8));
    }

    static int getSubArray(int [] arr, int minSum){

        int minSubArraySize = Integer.MAX_VALUE;
        int start = 0, currentSum = 0;
        boolean minSizeReached = false;
        for(int end=0; end<arr.length;end++){
            System.out.println("num > " + end);
            currentSum += arr[end];
            while(currentSum >= minSum && !minSizeReached){
                minSubArraySize = Math.min(minSubArraySize, end-start+1);
                currentSum = currentSum -arr[start];
                start++;
            }
            if(minSubArraySize==1)
                break;
        }
        return minSubArraySize;
    }
}
