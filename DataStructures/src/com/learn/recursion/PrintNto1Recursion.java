package com.learn.recursion;
public class PrintNto1Recursion {
    public static void main(String[] args) {
        nto1(5);
        one2n(5);
    }

    static void nto1(int n){

        if(n == 0)
            return;
        System.out.println(n);
        nto1(n-1);
    }

    static void one2n(int n){

        if(n == 0)
            return;
        one2n(n-1);
        System.out.println(n);
    }
}
