package day2.star2;

import common.ReadFileUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeviceTest {

    private static final String BOX_ID_1 = "abcde";
    private static final String BOX_ID_2 = "fghij";
    private static final String BOX_ID_3 = "klmno";
    private static final String BOX_ID_4 = "pqrst";
    private static final String BOX_ID_5 = "fguij";
    private static final String BOX_ID_6 = "axcye";
    private static final String BOX_ID_7 = "wvxyz";

    private static final String EXPECTED = "fgij";

    private Device device;
    private ReadFileUtil util;

    @BeforeEach
    void setUp() {
        device = new Device();
        util = new ReadFileUtil();
    }

    @Test
    void test_transformFoundedString_success() {
        String transformFoundedString = device.getIdWithSameCharacters(BOX_ID_2, 2);
        assertEquals(EXPECTED, transformFoundedString);
        transformFoundedString = device.getIdWithSameCharacters(BOX_ID_5, 2);
        assertEquals(EXPECTED, transformFoundedString);
    }

    @Test
    void test_findCorrectBoxes_sample1_success() {
        List<String> inputAsList = Arrays.asList(
                BOX_ID_1, BOX_ID_2, BOX_ID_3,
                BOX_ID_4, BOX_ID_5, BOX_ID_6,
                BOX_ID_7
        );
        String correctBoxes = device.findCorrectBoxes(inputAsList);
        assertEquals("fgij", correctBoxes);
    }

    @Test
    void test_full_success() {
        List<String> inputAsList = util.readFileAsStrings("I_day2.txt");
        String correctBoxes = device.findCorrectBoxes(inputAsList);
        System.out.println(correctBoxes);
    }
}