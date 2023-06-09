package com.amtenu.functionalInterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.BiConsumer;

public class ConsumerFunction {
    public static void main(String[] args) {
        var corrds= Arrays.asList(
                new double[]{47.21,-95.23},
                new double[] {23.23,-45.34},
                new double[] {34.65,-34.23}
        );

        corrds.forEach(myLocation-> System.out.println(Arrays.toString(myLocation)));

        BiConsumer<Double,Double> p1=(lat,lng)->
                System.out.printf("[lat:%.3f lng:%.3f]",lat,lng);

        var firstPoint=corrds.get(0);

        processPoint(firstPoint[0],firstPoint[1],p1);

        System.out.println("------------");
        corrds.forEach(myLocations->processPoint(myLocations[0],myLocations[1],p1));

    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
        consumer.accept(t1,t2);
    }

}
