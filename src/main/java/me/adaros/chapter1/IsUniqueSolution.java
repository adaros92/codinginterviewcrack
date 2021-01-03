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
}
