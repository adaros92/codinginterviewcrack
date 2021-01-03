package me.adaros.chapter1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class IsUniqueSolutionTest {

    @Test
    void testIsUnique(){
        IsUniqueSolution solution = new IsUniqueSolution();
        String[] uniqueStrings = {"a", "", "helo", "hi", "abcdefghijklmnopqrstuvwxyz"};
        for (int i = 0; i < uniqueStrings.length; i++)
            assertTrue(solution.isUnique(uniqueStrings[i]));
        String[] notUniqueStrings = {"aa", "hello", "hih", "aabbccddee", "dddddda"};
        for (int i = 0; i < notUniqueStrings.length; i++)
            assertFalse(solution.isUnique(notUniqueStrings[i]));
    }
}
