package com.company;

public class Main {

    public static void main(String[] args) {
        StringExercise stringExercise = new StringExercise();

        String input = "Test horse horse spores saddle test";

        //add tags
        System.out.println(stringExercise.addTags(input));

        //count how many chars
        System.out.println(stringExercise.countChars(input));

        // add @
        System.out.println(stringExercise.addAtString(input));

        //reverse string
        System.out.println(stringExercise.reverseString(input));

        //to morse
        String string = stringExercise.toMorse(input);
        System.out.println(string);

        //censor String
        System.out.println(StringExercise.censorString(input));
    }
}