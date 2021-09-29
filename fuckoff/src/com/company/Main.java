package com.company;

public class Main {

    public static void main(String[] args) {
        StringExercise stringExercise = new StringExercise();

        String input = "Test horse horse spores saddle test";
        String palInput = "EvaCanIStab";

        //add tags
        System.out.println(stringExercise.addTags(input));

        //count how many chars
        System.out.println(stringExercise.countChars(input));

        // add @
        System.out.println(stringExercise.addAtString(input));

        //reverse string
        System.out.println(stringExercise.reverseString(input));

        //to morse
        System.out.println(stringExercise.toMorse(input));

        //censor String
        System.out.println(stringExercise.censorString(input));

        //palindrome String
        System.out.println(stringExercise.palindromeString(palInput));

        // Alternate caps
        System.out.println(stringExercise.alternateCaps(input));

        //to leet
        System.out.println(stringExercise.to1337(input));

    }
}