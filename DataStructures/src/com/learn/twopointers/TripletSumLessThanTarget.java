package com.learn.twopointers;
import java.util.*;
public class TripletSumLessThanTarget {
    public static int searchTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        int count = 0;
        // TODO: Write your code here
        for(int i=0; i<arr.length-2; i++){
            //count += TripletWithSmallerSum.searchPair(arr, target-arr[i], i);
            count+= findPair(arr, i, target);
        }
        return count;
    }
    public static int findPair(int[] arr, int curr, int target){
        int left = curr+1, right=arr.length-1, count=0;
        while(left < right){
            int tempSum = arr[curr] + arr[left] + arr[right];
            if(tempSum < target){
            System.out.println(arr[curr] + ", " + arr[left] + "," + arr[right]);
            count += right - left;
            left++;
            } else{
            right--;
            }
        }
        return count;
    }
    /*
        public static int searchPair(int [] arr, int runningTarget, int i){
          int count =0;
          int start = i+1, end = arr.length-1;
          while(start < end){
            int sum = arr[start] + arr[end];
            if(sum < runningTarget){
              count+= end-start;
              start++;
            }else {
              end--;
            }
          }
          return count;
        }  
        
    }*/

    public static void main(String [] args){
        System.out.println("==> " + TripletSumLessThanTarget.searchTriplets(new int[] {-1, 0, 2, 3}, 3));
    }
}
