package com.learn.recursion;
public class ReduceNumberToZeroRecursion {
    public static void main(String[] args) {
        int num = 41;
        reduceToZero(num);
        System.out.println(count);
        System.out.println(reduceToZ(num));
    }

    static int count =0;
    static void reduceToZero(int num){

        if(num == 0)
            return;
        if(num%2 == 1){
            reduceToZero(num-1);
            count++;
        } else {
            reduceToZero(num/2);
            count++;
        }
    }

    static int reduceToZ(int num){
        if(num == 0)
            return 0;
        return 1 + ((num%2 == 1) ? reduceToZ(num-1) : reduceToZ(num/2));
    }
}
