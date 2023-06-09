package com.amtenu.functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {


    public static void main(String[] args) {
        List<String> list=new ArrayList<>(List.of(
                "alpha","bravo","charlie","delta"));
        for (String s:list
             ) {
            System.out.println(s);// prints the list
        }

        System.out.println("_________");

        list.forEach((var myString)-> System.out.println(myString));// same as above
        //lamda consumer functional interface

        System.out.println("------------");

        //lamda to produce a result

        list.forEach((var myString)->{
            String prefix="Nato code";
            char first=myString.charAt(0);
            System.out.println(prefix+ " "+myString+" means " + first);
        });


    }
}
