package me.adaros.chapter1;

import java.util.HashMap;

/**
 * Solution to Chapter 1 problem 1.2 Check Permutation
 */
public class CheckPermutationSolution {

    /**
     * Gets the frequency count of each character in a string and adds it to a map
     * @param s the string to extract the character frequency distribution from
     * @return a map containing each character as key and its count as value
     */
    private HashMap<Character, Integer> getCharCounts(String s){
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            // The character has not been seen before so its count is just 1
            if (!countMap.containsKey(character))
                countMap.put(character, 1);
            // Otherwise increment the count on record by 1
            else{
                int currentCount = countMap.get(character);
                countMap.put(character, currentCount + 1);
            }
        }
        return countMap;
    }

    /**
     * Checks to ensure the counts by character in both maps are equal assuming equal lengths
     * @param map1 the first map to compare
     * @param map2 the other map to compare
     * @return true if the counts by character match
     */
    private boolean charCountsMatch(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
        for (char character: map1.keySet()){
            // If one of the characters in map1 is not in map2 then they can't be equal
            if (!map2.containsKey(character))
                return false;
            else{
                int map1Count = map1.get(character);
                int map2Count = map2.get(character);
                if (map1Count != map2Count)
                    return false;
            }
        }
        return true;
    }

    /**
     * Checks whether one string is a permutation of the other
     * @param s1 one of the strings to compare
     * @param s2 the other string to compare
     * @return true if the strings are permutations of each other
     */
    public boolean isPermutation(String s1, String s2){
        // You can sort the two strings and compare character by character but that is O(nlogn)
        // Below is an O(n) solution using a map of character to count of appearance

        // First check some base cases
        if (s1.length() != s2.length())
            return false;
        else if (s1.length() == 0)
            return true;
        // Next create distributions of counts by character for both strings
        HashMap<Character, Integer> s1CountMap = getCharCounts(s1);
        HashMap<Character, Integer> s2CountMap = getCharCounts(s2);
        // Finally, check whether the distributions are the same
        return charCountsMatch(s1CountMap, s2CountMap);
    }

    /**
     * Corresponding isPermutation book solution
     * @param s one string to compare
     * @param t the other string to compare
     * @return true if the strings are permutations of each other
     */
    public boolean isPermutationBookSolution(String s, String t){
        if (s.length() != t.length()) return false;

        // Again with the ASCII character set stuff as in problem 1.1
        // Iterate over each character in s and add to fixed array of ASCII values
        int [] letters = new int[128];
        for (int i = 0; i < s.length(); i++){
            letters[s.charAt(i)]++;
        }
        // Iterate over the second string and subtract the counts already recorded
        for (int i = 0; i < t.length(); i++){
            letters[t.charAt(i)]--;
            // This seems wrong (what happens if t has fewer of any one character)
            // Reason why it works is that other character will have more leading to negative count
            if(letters[t.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }

}
