package day1.star1;

import common.ReadFileUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PuzzleTest {

    private Puzzle puzzle;
    private ReadFileUtil util;


    @BeforeEach
    void setUp() {
        puzzle = new Puzzle();
        util = new ReadFileUtil();
    }

    @Test
    void test_sample1_success() {
        assertEquals(1, puzzle.change(0, +1));
    }

    @Test
    void test_sample2_success() {
        assertEquals(-1, puzzle.change(1, -2));
    }

    @Test
    void test_sample3_success() {
        assertEquals(2, puzzle.change(-1, +3));
    }

    @Test
    void test_sample4_success() {
        assertEquals(3, puzzle.change(2, +1));
    }

    @Test
    void test_multiChanges_success() {
        int startFrequency = 0;
        int result = puzzle.change(startFrequency, +1);
        assertEquals(1, result);
        int change = puzzle.change(result, -2);
        assertEquals(-1, change);
        result = puzzle.change(change, +3);
        assertEquals(2, result);
        change = puzzle.change(result, +1);
        assertEquals(3, change);
    }

    @Test
    void test_listOfChanges_success() {
        assertEquals(3, puzzle.change(1, -2, 3, 1));
    }


    @Test
    void test_full_success() {
        List<Integer> inputAsList = util.readFileAsInts("I_day1.txt");
        int result = puzzle.change(inputAsList.toArray(new Integer[0]));
        System.out.println(result);
    }
}