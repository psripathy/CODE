class ShortestWindowSort {

    public static int sort(int[] arr) {
          int left = 0, right = arr.length - 1;
          while (left < right && (arr[left] <= arr[left+1] || arr[right] >= arr[right-1])) {
              if (arr[left] <= arr[left+1])
                  left++;
              if (arr[right] >= arr[right-1])
                  right--;
          }
          // System.out.println("left:::"+left+" right:::"+right);
          // find min and max and then extend the subarray accordingly
          int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
          for (int i=left;i<=right;i++) {
              min = Math.min(min, arr[i]);
              max = Math.max(max, arr[i]);
          }
          while (left > 0 && arr[left-1] > min) 
              left--;
          while (right < arr.length - 1 && arr[right+1] < max)
              right++;
          return left < right ? right - left + 1 : 0;
  
    }

    public static void main(String [] args){
        System.out.println("==> " + ShortestWindowSort.sort(new int[] {1, 2, 5, 3, 7, 10, 9, 12}));
    }
  }
/*
  public static int sort(int[] arr) {
    int low = 0, high = arr.length - 1;
    // find the first number out of sorting order from the beginning
    while (low < arr.length - 1 && arr[low] <= arr[low + 1])
      low++;

    if (low == arr.length - 1) // if the array is sorted
      return 0;

    // find the first number out of sorting order from the end
    while (high > 0 && arr[high] >= arr[high - 1])
      high--;

    // find the maximum and minimum of the subarray
    int subarrayMax = Integer.MIN_VALUE, subarrayMin = Integer.MAX_VALUE;
    for (int k = low; k <= high; k++) {
      subarrayMax = Math.max(subarrayMax, arr[k]);
      subarrayMin = Math.min(subarrayMin, arr[k]);
    }

    // extend the subarray to include any number which is bigger than the minimum of the subarray 
    while (low > 0 && arr[low - 1] > subarrayMin)
      low--;
    // extend the subarray to include any number which is smaller than the maximum of the subarray
    while (high < arr.length - 1 && arr[high + 1] < subarrayMax)
      high++;

    return high - low + 1;
  }
  */