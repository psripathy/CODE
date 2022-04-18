public class NumberOfZerosInANumber {
    public static void main(String[] args) {
        int num = 1050700;
        countZeros(num);
        System.out.println(count);
        System.out.println(countZ(num));
    }

    static int count = 0;
    static void countZeros(int num){

        if(num == 0 || num%10 == 0)
            count+=1;
        if(num%10 == num)
            return;
        countZeros(num/10);
        //return count;
    }

    static int countZ(int num){
        //System.out.println(num);
        if(num%10 == num)
            return 0;
        return (num%10 == 0 ? 1 : 0) + countZ(num/10);
    }
}
