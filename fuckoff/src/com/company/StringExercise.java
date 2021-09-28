package com.company;

public class StringExercise {
    public String addTags(String input) {
        return "<" + input + ">";
    }

    public String countChars(String input) {
        int nrOfChars = input.length();
        return nrOfChars + "";
    }

    public String addAtString(String input) {
        String output = input.replace("", "@");
        return output.substring(1, output.length() - 1);
    }

    public String reverseString(String input) {
        return new StringBuffer(input).reverse().toString();

    }

    public String toMorse(String input) {
        char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?',' '};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..", "/"};

        //String userInput = keyboard.nextLine().toLowerCase();
        String userInput = input.toLowerCase();

        char[] chars = userInput.toCharArray();

        String str = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < english.length; j++) {

                if (english[j] == chars[i]) {
                    str = str + morse[j] + " ";
                }
            }
        }
        return str;
    }

}
