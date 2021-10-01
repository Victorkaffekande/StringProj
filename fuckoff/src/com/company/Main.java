package com.company;

public class Main {

    public static void main(String[] args) {
        StringExercise stringExercise = new StringExercise();
        NumberConversionModel nCM = new NumberConversionModel();


        String input = "hello*2 test*2";
        String palInput = "EvaCanIStab";
        String filter = "trda";

        // extend string
        System.out.println(stringExercise.expandString(input));
/*
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

        //filter string
        System.out.println(stringExercise.filterString(input, filter));

*/
    }
}