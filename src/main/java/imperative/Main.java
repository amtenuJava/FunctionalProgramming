package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people= List.of(
                new Person("Aman", Gender.MALE),
                new Person("Solo",Gender.MALE),
                new Person("Dani",Gender.MALE),
                new Person("Danu", FEMALE),
                new Person("Mary", FEMALE)
        );

      //Imperative approach to select only female

       List<Person> female=new ArrayList<>();

       for(Person person:people){
           if(FEMALE.equals(person.gender)){
               female.add(person);
           }

       }

        for (Person person:female
             ) {
            System.out.println(person);
        }




    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender { MALE,FEMALE,OTHER};
}
