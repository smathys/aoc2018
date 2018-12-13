package day1.star2;

import common.ReadFileUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DeviceTest {

    private Device device;
    private ReadFileUtil util;


    @BeforeEach
    void setUp() {
        device = new Device();
        util = new ReadFileUtil();
    }


    @Test
    void test_find_sample2_success() {
        int reachedTwice = device.findFirstFrequencyReachedTwice(+3, +3, +4, -2, -4);
        assertEquals(10, reachedTwice);
    }

    @Test
    void test_find_sample3_success() {
        int reachedTwice = device.findFirstFrequencyReachedTwice(-6, +3, +8, +5, -6);
        System.out.println(reachedTwice);
    }

    @Test
    void test_find_sample4_success() {
        int reachedTwice = device.findFirstFrequencyReachedTwice(+7, +7, -2, -7, -4);
        assertEquals(14, reachedTwice);
    }

    @Test
    void test_find_sample1_success() {
        int reachedTwice = device.findFirstFrequencyReachedTwice(+1, -1);
        assertEquals(0, reachedTwice);
    }

    @Test
    void test_full_success() {
        List<Integer> inputAsList = util.readFileAsInts("I_day1.txt");
        int result = device.findFirstFrequencyReachedTwice(inputAsList.toArray(new Integer[0]));
        System.out.println(result);
    }
}