
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MovingAverage {
/*
    int [] intArr;
    int head = 0, tail=-1, count=0;
    
    public MovingAverage(int size) {
        intArr = new int[size];
    }
    
    public double next(int val) {
        enQueue(val);
        return calculateAverage(intArr, count);
    }
    
    public boolean enQueue(int val){
        
        tail++;
        tail = tail % intArr.length;
        if(count >= intArr.length){
            this.deQueue();    
        }
        count++;
        intArr[tail] = val;
        return true;
    }
    
    public void deQueue(){
        intArr[head] = 0;
        head++;
        head = head % intArr.length;
        count--;
    }
    
    public double calculateAverage(int[] arr, int size){
        double sum = 0;
        for(int i=0; i<size; i++){
            sum += arr[i];
        }
        return sum/size;
    }
    */

    public static void main (String args[]){
        MovingAverage mv = new MovingAverage(3);
        System.out.println(mv.next(1)); // return 1.0 = 1 / 1
        System.out.println(mv.next(10)); // return 5.5 = (1 + 10) / 2
        System.out.println(mv.next(3)); // return 4.66667 = (1 + 10 + 3) / 3
        System.out.println(mv.next(5)); // return 6.0 = (10 + 3 + 5) / 3
        System.out.println(mv.next(4)); // return 4.0 = (3+5+4)/3
    }

    private int[] holdingArr;
    int maxSize, currentLength;
    
    public MovingAverage(int size) {
        maxSize = size;
        holdingArr = new int[maxSize];
        //head = tail = 0;
        currentLength = 0;
    }
    
    public double next(int val) {
        double sum = 0d;
        
        if(isFull()){
            this.deQueue();
        }
        holdingArr[currentLength] = val;
        currentLength++;
        for(int i : holdingArr){
            sum += i;
        }
        
        return sum/currentLength;
        
    }
    
    public boolean isFull(){
        return currentLength == holdingArr.length;
    }
    
    public void deQueue(){
        for(int i =1; i<holdingArr.length; i++){
            holdingArr[i-1] = holdingArr[i];
        }
        currentLength--;
    }
}