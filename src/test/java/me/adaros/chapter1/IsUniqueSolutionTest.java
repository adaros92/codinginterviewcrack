package me.adaros.chapter1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class IsUniqueSolutionTest {

    public String[] uniqueStrings = {"a", "", "helo", "hi", "abcdefghijklmnopqrstuvwxyz"};
    public String[] notUniqueStrings = {"aa", "hello", "hih", "aabbccddee", "dddddda"};

    @Test
    void testIsUnique(){
        IsUniqueSolution solution = new IsUniqueSolution();
        for (int i = 0; i < uniqueStrings.length; i++)
            assertTrue(solution.isUnique(uniqueStrings[i]));
        for (int i = 0; i < notUniqueStrings.length; i++)
            assertFalse(solution.isUnique(notUniqueStrings[i]));
    }

    @Test
    void testIsUniqueBookSolution(){
        IsUniqueSolution solution = new IsUniqueSolution();
        for (int i = 0; i < uniqueStrings.length; i++)
            assertTrue(solution.isUniqueBookSolution(uniqueStrings[i]));
        for (int i = 0; i < notUniqueStrings.length; i++)
            assertFalse(solution.isUniqueBookSolution(notUniqueStrings[i]));
    }
}
