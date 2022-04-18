package com.learn.recursion;
public class FactorialByRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n){
        //n*n-1
        if(n == 1)
            return n;
        return n * factorial(n-1);
    }
}
