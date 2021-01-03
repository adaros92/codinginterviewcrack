package me.adaros.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CheckPermutationSolutionTest {

    public String[] strings1 = {"a", "elloh", "elloh", "oh", "", "hithere", "ho"};
    public String[] strings2 = {"aa", "hello", "hllo", "ho", "", "hithere", "hi"};
    public boolean[] expectedResults = {false, true, false, true, true, true, false};

    @Test
    void testPermutation(){
        CheckPermutationSolution solution = new CheckPermutationSolution();
        for (int i = 0; i < strings1.length; i++){
            String string1 = strings1[i];
            String string2 = strings2[i];
            boolean expectedResult = expectedResults[i];
            boolean result = solution.isPermutation(string1, string2);
            assertEquals(expectedResult, result);
        }
    }

    @Test
    void testPermutationBookSolution(){
        CheckPermutationSolution solution = new CheckPermutationSolution();
        for (int i = 0; i < strings1.length; i++){
            String string1 = strings1[i];
            String string2 = strings2[i];
            boolean expectedResult = expectedResults[i];
            boolean result = solution.isPermutationBookSolution(string1, string2);
            assertEquals(expectedResult, result);
        }
    }

}
