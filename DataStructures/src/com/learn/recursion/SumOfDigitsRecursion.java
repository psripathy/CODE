package com.learn.recursion;
public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }

    static int sumOfDigits(int num){

        if(num < 10){
            return num;
        }
        int digit = num%10;
        int numberFromRemainingDigits = num/10;
        return digit + sumOfDigits(numberFromRemainingDigits);
    }
}
