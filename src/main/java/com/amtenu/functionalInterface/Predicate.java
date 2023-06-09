package com.amtenu.functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class Predicate {
    //predicate
    public static void main(String[] args) {
        List<String> players= new ArrayList<>(
                List.of("Messi","Ronaldo","Neymar","bekele"));
        players.removeIf(s->s.equalsIgnoreCase("bekele"));

        players.removeIf(s -> s.startsWith("M"));

        players.forEach(s-> System.out.println(s));//Messi is subtracted



    }
}
