package com.learn.recursion;
public class PrintPatternRecursion {
    public static void main(String[] args) {
        printPattern(4);
        printPattern(4, 1);
    }

    static void printPattern(int n){
        if(n == 0)
            return;
        for(int i=1; i<=n; i++){
            System.out.print("*");
            if(i==n)
                System.out.println();
        }
        printPattern(--n);
    }

    static void printPattern(int n, int x){
        if(x > n)
            return;
        for(int i=1; i<=x; i++){
            System.out.print("#");
            if(i==x)
                System.out.println();
        }
        printPattern(n, ++x);
    }    
}
