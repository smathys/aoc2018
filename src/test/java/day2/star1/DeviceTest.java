package day2.star1;

import common.ReadFileUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    private Device device;
    private ReadFileUtil util;

    @BeforeEach
    void setUp() {
        device = new Device();
        util = new ReadFileUtil();
    }

    @Test
    void test_sample1_success() {
        Tuple tuple = device.countFor("abcdef");
        assertFalse(tuple.twoOfAnyLetter);
        assertFalse(tuple.treeOfAnyLetter);
    }

    @Test
    void test_sample2_success() {
        Tuple tuple = device.countFor("bababc");

        assertTrue(tuple.twoOfAnyLetter);
        assertTrue(tuple.treeOfAnyLetter);
    }

    @Test
    void test_sample3_success() {
        Tuple tuple = device.countFor("abbcde");
        assertTrue(tuple.twoOfAnyLetter);
        assertFalse(tuple.treeOfAnyLetter);
    }

    @Test
    void test_sample4_success() {
        Tuple tuple = device.countFor("abcccd");
        assertFalse(tuple.twoOfAnyLetter);
        assertTrue(tuple.treeOfAnyLetter);
    }

    @Test
    void test_sample5_success() {
        Tuple tuple = device.countFor("aabcdd");
        assertTrue(tuple.twoOfAnyLetter);
        assertFalse(tuple.treeOfAnyLetter);
    }

    @Test
    void test_sample6_success() {
        Tuple tuple = device.countFor("abcdee");
        assertTrue(tuple.twoOfAnyLetter);
        assertFalse(tuple.treeOfAnyLetter);
    }

    @Test
    void test_sample7_success() {
        Tuple tuple = device.countFor("ababab");
        assertFalse(tuple.twoOfAnyLetter);
        assertTrue(tuple.treeOfAnyLetter);
    }


    @Test
    void test_scanIds_success() {
        List<String> inputAsList = Arrays.asList(
                "abcdef", "bababc", "abbcde", "abcccd",
                "aabcdd", "abcdee", "ababab"
        );
        long checksum = device.scanIds(inputAsList);
        assertEquals(12, checksum);
        System.out.println(checksum);
    }

    @Test
    void test_full_success() {
        List<String> inputAsList = util.readFileAsStrings("I_day2.txt");
        long checksum = device.scanIds(inputAsList);
        System.out.println(checksum);
    }
}