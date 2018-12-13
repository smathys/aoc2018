package common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ReadFileUtilTest {

    private ReadFileUtil util;


    @BeforeEach
    void setUp() {
        util = new ReadFileUtil();
    }


    @Test
    void test_readFileAsInts_success() {
        assertTrue(util.readFileAsInts("I_day1.txt").size() > 0);
    }

    @Test
    void test_readFileAsStings_success() {
        assertTrue(util.readFileAsStrings("I_day2.txt").size() > 0);
    }
}