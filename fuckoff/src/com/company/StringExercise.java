package com.company;

public class StringExercise {
    public String addTags(String input) {
        return "<" + input + ">";
    }

    public int countChars(String input) {
        int nrOfChars = input.length();
        return nrOfChars;
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
                ',', '.', '?', ' '};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..", "/"};
        //force lowercase
        String userInput = input.toLowerCase();

        // make array out of input
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

    public String censorString(String input) {
        String[] censorList = {"horse", "spores", "saddle"};
        StringBuilder sb = new StringBuilder(input);

        for (String word : censorList) {
            int index = input.indexOf(word);
            while (index >= 0) {
                sb.replace(index, index + word.length(), "*".repeat(word.length()));
                index = sb.indexOf(word);
            }
        }
        return sb.toString();
    }

    public String palindromeString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb = sb.reverse();
        String output = input + "-" + sb;

        return output;
    }

    public String alternateCaps(String input) {
        StringBuilder sb = new StringBuilder();
        input = input.toLowerCase();
        char[] chars = input.toCharArray();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (count % 2 == 0) {
                String str = chars[i] + "";
                str = str.toUpperCase();
                sb = sb.append(str);
                if (str.isBlank()) {
                    count++;
                }
            } else {
                sb = sb.append(chars[i]);
            }
            count++;
        }
        return sb.toString();
    }

    public String to1337(String input) {
        char[] english = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?'};
        String[] leet = {" ", "4", "|3", "(", "|)", "3", "|=", "6", "|-|", "|", "9", "|<", "1", "|v|", "|/|",
                "0", "|*", "0,", "|2", "5", "7", "|_|", "|/", "|/|/", "><", "`/", "2"};

        //force lowercase
        String userInput = input.toLowerCase();

        // make array out of input
        char[] chars = userInput.toCharArray();

        String str = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < leet.length; j++) {

                if (english[j] == chars[i]) {
                    str = str + leet[j];
                }
            }
        }
        return str;
    }

}

