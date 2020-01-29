package main;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public static String encode(String word){
        String original = word.toLowerCase();
        Map<Character, Integer> charMap = buildCharMap(original);
        word = "";
        for (int i=0; i<original.length(); i++) {
            char c = original.charAt(i);
            int count = charMap.get(c);
            if (count>1)
                word += ")";
            else
                word += "(";
        }
        return word;
    }

    private static Map<Character, Integer> buildCharMap(String word) {
        Map<Character, Integer> charMap = new HashMap();
        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            if (charMap.get(c)==null) {
                charMap.put(c, 1);
            }
            else {
                Integer count = charMap.get(c);
                count++;
                charMap.put(c, count);
            }
        }
        return charMap;
    }
}
