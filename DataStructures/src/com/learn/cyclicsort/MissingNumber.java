public class MissingNumber {
    public static int findMissing(int arr[], int rangeMax){
        int currIndex=0, missingNum = arr.length;
        int currIndexValue = arr[currIndex];
        while(currIndexValue != currIndex){
            if(currIndexValue >= arr.length){
                currIndex++;
            }else {
                if(currIndexValue != currIndex){
                    swap(arr, currIndex);
                    if(arr[currIndex] != currIndex)
                        currIndex++;
                }
            }
            currIndexValue = arr[currIndex];
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j)
                missingNum = j;
        }
        return missingNum;
    }

    public static void swap(int arr[], int currIndex){
        int temp = arr[currIndex];
        arr[currIndex] = arr[temp];
        arr[temp] = temp;
    }
    public static void main(String args[]){
        System.out.println(">> " + findMissing(new int[]{4,0,2,1}, 4));
        System.out.println(">> " + findMissing(new int[]{3,0,2,1}, 4));
        System.out.println(">> " + findMissing(new int[]{9,4,5,1,7,0,3,6,9}, 9));
    }
}
