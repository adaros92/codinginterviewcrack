package me.adaros.chapter1;

import java.util.HashSet;

/**
 * Solution to Chapter 1 problem 1.1 Is Unique
 */
public class IsUniqueSolution {

    /**
     * Checks whether the given string contains only unique characters
     * @param s the string to check
     * @return true if the string consists of only unique characters; false otherwise
     */
    public boolean isUnique(String s){
        HashSet<Character> charactersSeen = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            if (charactersSeen.contains(character))
                return false;
            charactersSeen.add(character);
        }
        return true;
    }

    public boolean isUniqueBookSolution(String s){
        // Keep a fixed array of all possible unique ASCII values in the 128 ASCII character set
        // If a character is found, mark that index as True
        if (s.length() > 128) return false;
        // Focus here is on O(1) space complexity
        // I don't like that it relies on a constant number of characters (not extensible to unicode)
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); i++){
            int val = s.charAt(i);
            if (charSet[val]){
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
}
