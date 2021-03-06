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
                'y', 'z'};
        String[] leet = {" ", "4", "|3", "(", "|)", "3", "|=", "6", "|-|", "|", "9", "|<", "1", "|v|", "|/|",
                "0", "|*", "0,", "|2", "5", "7", "|_|", "|/", "|/|/", "><", "`/", "2"};

        //force lowercase
        String userInput = input.toLowerCase();

        // make array out of input
        char[] chars = userInput.toCharArray();

        String str = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < leet.length; j++) {
                if (chars[i] == english[j]) {
                    str = str + leet[j];
                    break;
                }
            }
        }
        return str;
    }

    public String filterString(String input, String filter) {
        char[] filterChar = filter.toCharArray();
        char[] inputChar = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            boolean added = false;
            for (int k = 0; k < filter.length(); k++) {
                if (inputChar[i] == filterChar[k]) {
                    sb.append(inputChar[i]);
                    added = true;
                }
            }
            if (!added) {
                sb.append("*");
            }
        }
        return sb.toString();
    }


    public String expandString(String input) {
        char[] chars = input.toCharArray();
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            boolean foundNum = false;
            int multiplier = 0;
            for (int n = 0; n < numbers.length; n++) {
                if (chars[i] == numbers[n]) {
                    foundNum = true;
                    multiplier = Integer.parseInt(String.valueOf(chars[i]));
                }
            }
            if (!foundNum) {
                sb.append(chars[i]);
            } else {
                String str = sb.toString();
                for (int k = multiplier; k > 1; k--) {
                    sb.append(str);
                }
            }
        }
        String output = sb.toString();
        output = output.replaceAll("\\*", "");
        return output;
    }

}

