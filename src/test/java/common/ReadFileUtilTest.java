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
    void test_readFile_success() {

        assertTrue(util.readFile("I_day1.txt").size() > 0);
    }
}