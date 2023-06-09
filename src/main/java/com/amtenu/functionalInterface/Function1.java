package com.amtenu.functionalInterface;


import java.util.function.Function;

public class Function1 {


    public static void main(String[] args) {
        Integer j=increment(10);
        System.out.println(j);

        int d=incrementByOne.apply(1);
        System.out.println(d);

       Function<Integer,Integer> addOneAndThenMultiplyBy10=
               incrementByOne.andThen(multiply);

        System.out.println( addOneAndThenMultiplyBy10.apply(10));

        int resultSum=calculator((a,b)->a+b,5,10);
        int resultSubtraction=calculator((a,b)->a-b,15,3);




    }


    //The usual declaration of a method

    public static int increment(int i){
        return i+1;
    }


    //function peredicate

   static  Function<Integer, Integer> incrementByOne= number->number+1;
    static Function<Integer ,Integer> multiply=number->number*10;


    public static <T> T calculator(Operation<T> function ,T value1,T value2){
       T result =function.operate(value1,value2);
        System.out.println("Result of operation " + result);
        return result;
    }
}
