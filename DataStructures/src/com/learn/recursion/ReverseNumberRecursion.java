package com.learn.recursion;
public class ReverseNumberRecursion {
    public static void main(String[] args) {
        System.out.println(reverseNum(2547698));
    }

    static int reverseNum(int num){

        if(num%10 == num)
            return num;
        int len = ((int)(Math.log10(num)))+1;
        int lastDigit = (num%10)* (int)Math.pow(10, len-1);
        return lastDigit+reverseNum(num/10);
    }
}
