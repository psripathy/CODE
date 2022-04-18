public class MyCircularQueue {
    int f=0,r=-1,size=0;
    int[] ar;
    // 'r' should point to last element, but last element does not exist now, so -1
    
    public static void main(String args[]){
        MyCircularQueue mq = new MyCircularQueue(5);
        System.out.println(mq.enQueue(10));
        System.out.println(mq.enQueue(20));
        System.out.println(mq.deQueue());
        System.out.println(mq.enQueue(30));
        System.out.println(mq.enQueue(40));
        System.out.println(mq.enQueue(50));
        System.out.println(mq.deQueue());
        System.out.println(mq.deQueue());
        System.out.println(mq.deQueue());
        System.out.println(mq.enQueue(60));
        System.out.println(mq.enQueue(70));
        System.out.println(mq.enQueue(80));
        System.out.println(mq.enQueue(90));
        System.out.println(mq.enQueue(100));
    }

    public MyCircularQueue(int k) {
        
        ar = new int[k];
        System.out.println("ar >> " + ar);
    }
    
    public boolean enQueue(int value) {
        
        if(isFull())
            return false;
        
        r++;
        r=r % ar.length;
        ar[r]=value;
        size++;
        
        return true;
        
    }
    
    public boolean deQueue() {
        
        if(isEmpty())
            return false;
        ar[f] = 0;
        f++;
        f= f % ar.length;
        size--;
        
        return true;
        
    }
    
    public int Front() {
        
        if(isEmpty())
            return -1;
        
        return ar[f];
        
    }
    
    public int Rear() {
        
        if(isEmpty())
            return -1;
        
        return ar[r];
        
    }
    
    public boolean isEmpty() {
        
        return size==0;
    }
    
    public boolean isFull() {
        
        return size == ar.length;
        
    }
}
