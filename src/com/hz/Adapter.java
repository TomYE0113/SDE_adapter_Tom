package com.hz;

public class Adapter {

    public static String checker(String input) {

        String[] word = new String[11];

        word[0] = "true";
        word[1] = "yes";
        word[2] = "oh yeah";
        word[3] = "great";
        word[4] = "sure";
        word[5] = "love to";
        word[6] = "of course";
        word[7] = "love to";
        word[8] = "always";
        word[9] = "never done otherwise";
        word[10] = "yep";

        for(int i = 0; i < word.length; i++) {
            if (input.equals(word[i])) {
                return "Yep";
            }
        }
        return "No";
    }

}
