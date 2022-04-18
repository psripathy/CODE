package com.learn.twopointers;
public class SortedArraySquares {

  //Given sorted [-2, -1, 0, 2, 3] return 
  //Output: [0, 1, 4, 4, 9] where elements are square of elements of input array and result is sorted
  public static int[] makeSquares(int[] arr) {

    int [] result = new int[arr.length];
    int start = 0, end=arr.length-1;
    int sqStart =0, sqEnd=0, index=arr.length-1;
    while(start < end){
      System.out.println("arr[" + start + "]=" + arr[start]+ ", arr[" + end + "]=" + arr[end]);
      sqStart = arr[start] * arr[start];
      sqEnd = arr[end] * arr[end];
      if(sqStart < sqEnd){
        result[index] = sqEnd;
        end--;
      } else {
        result[index] = sqStart;
        start++;
      }
      index--;
    }
    return result;
  }

  public static void main(String [] args){
      System.out.println(SortedArraySquares.makeSquares(new int[] {-2, -1, 0, 2, 3}));
  }

}
