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
}
