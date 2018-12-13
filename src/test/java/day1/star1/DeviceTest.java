package day1.star1;

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
    void test_sample1_success() {
        assertEquals(1, device.change(0, +1));
    }

    @Test
    void test_sample2_success() {
        assertEquals(-1, device.change(1, -2));
    }

    @Test
    void test_sample3_success() {
        assertEquals(2, device.change(-1, +3));
    }

    @Test
    void test_sample4_success() {
        assertEquals(3, device.change(2, +1));
    }

    @Test
    void test_multiChanges_success() {
        int startFrequency = 0;
        int result = device.change(startFrequency, +1);
        assertEquals(1, result);
        int change = device.change(result, -2);
        assertEquals(-1, change);
        result = device.change(change, +3);
        assertEquals(2, result);
        change = device.change(result, +1);
        assertEquals(3, change);
    }

    @Test
    void test_listOfChanges_success() {
        assertEquals(3, device.change(1, -2, 3, 1));
    }


    @Test
    void test_full_success() {
        List<Integer> inputAsList = util.readFileAsInts("I_day1.txt");
        int result = device.change(inputAsList.toArray(new Integer[0]));
        System.out.println(result);
    }
}