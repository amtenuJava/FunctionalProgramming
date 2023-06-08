package com.amtenu.functionalInterface;


import java.util.function.Function;

public class Function1 {


    public static void main(String[] args) {
        Integer j=increment(10);
        System.out.println(j);

        int d=incrementByOne.apply(1);
        System.out.println(d);


    }


    //The usual declaration of a method

    public static int increment(int i){
        return i+1;
    }


    //function peredicate

   static  Function<Integer, Integer> incrementByOne= number->number+1;


}
