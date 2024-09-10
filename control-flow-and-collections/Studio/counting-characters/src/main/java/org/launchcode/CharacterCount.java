package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {

        String quote = "I do not like Java.";

        char[] charArray = quote.toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();

        for (char letter : charArray) {
            if (counts.containsKey(letter)) {
                counts.put(letter, counts.get(letter) + 1);
            } else {
                counts.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }

}
