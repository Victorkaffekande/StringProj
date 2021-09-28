package com.company;

public class StringExercise {
    public String addTags(String input)
    {
        return "<" + input + ">";
    }

    public String countChars(String input)
    {
        int nrOfChars = input.length();
        return nrOfChars + "";
    }

    public String addAtString(String input)
    {
        String output = input.replace("" , "@");
        return output.substring(1,output.length()-1);
    }

    public String reverseString(String input)
    {
        return new StringBuffer(input).reverse().toString();

    }

    public String convertToMorse(String input)
    {
        String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?" };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };
        String userInput;
        int index;
        index = 0;
        String output = "";

        userInput = input;
        userInput = userInput.toLowerCase();


        for (index = 0; index < userInput.length(); index++)
        {
            char [] chars = userInput.toCharArray();
            output = " Translated : " + morse[index];
            if (userInput.equals(english[index])) {

            }
        }

        return output;
    }



}
