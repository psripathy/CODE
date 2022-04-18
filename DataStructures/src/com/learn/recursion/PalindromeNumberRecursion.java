package com.learn.recursion;
public class PalindromeNumberRecursion {
    public static void main(String[] args) {
        int num = 7123217;
        System.out.println(num == reverse(num));
    }

    static int reverse(int num){
        if(num%10 == num)
            return num;
        int len = (int)Math.log10(num)+1;
        int last = num%10;
        return last*(int)Math.pow(10, len-1) + reverse(num/10);
    }
}
