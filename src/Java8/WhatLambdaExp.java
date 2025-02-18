package Java8;
@FunctionalInterface
interface A{
    int m1(int x,int y);
}
public class WhatLambdaExp {
    public static void main(String[] args) {
        // A obj=new A() {
        //   public int m1(int x,int y){
        //               return x*y;
        //             }
        // };
        A obj=(x,y)-> x*y;
        System.out.println(obj.m1(12,12 ));;
    }
}
