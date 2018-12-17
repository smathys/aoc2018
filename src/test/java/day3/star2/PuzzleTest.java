package day3.star2;

import common.ReadFileUtil;
import day3.Claim;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static day3.star2.Puzzle.EMPTY_SLOT;
import static day3.star2.Puzzle.MULTIPLE_SLOT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PuzzleTest {

    private Puzzle puzzle;
    private ReadFileUtil util;
    private static String[][] expectedEmpty = new String[8][8];
    private static String[][] expectedSample1 = new String[8][8];
    private static String[][] expectedSample2 = new String[8][8];
    private static String[][] expectedSample3 = new String[8][8];
    private static String[][] expectedMulti = new String[8][8];
    private static final List<String> SAMPLE_INPUT = Arrays.asList(
            "#1 @ 1,3: 4x4",
            "#2 @ 3,1: 4x4",
            "#3 @ 5,5: 2x2"
    );

    @BeforeAll
    static void setUpBefore() {
        initEmpty();
        initSample();
        initSample2();
        initSample3();
        initMulti();
    }

    private static void initEmpty() {
        expectedEmpty[0][0] = EMPTY_SLOT;
        expectedEmpty[0][1] = EMPTY_SLOT;
        expectedEmpty[0][2] = EMPTY_SLOT;
        expectedEmpty[0][3] = EMPTY_SLOT;
        expectedEmpty[0][4] = EMPTY_SLOT;
        expectedEmpty[0][5] = EMPTY_SLOT;
        expectedEmpty[0][6] = EMPTY_SLOT;
        expectedEmpty[0][7] = EMPTY_SLOT;

        expectedEmpty[1][0] = EMPTY_SLOT;
        expectedEmpty[1][1] = EMPTY_SLOT;
        expectedEmpty[1][2] = EMPTY_SLOT;
        expectedEmpty[1][3] = EMPTY_SLOT;
        expectedEmpty[1][4] = EMPTY_SLOT;
        expectedEmpty[1][5] = EMPTY_SLOT;
        expectedEmpty[1][6] = EMPTY_SLOT;
        expectedEmpty[1][7] = EMPTY_SLOT;

        expectedEmpty[2][0] = EMPTY_SLOT;
        expectedEmpty[2][1] = EMPTY_SLOT;
        expectedEmpty[2][2] = EMPTY_SLOT;
        expectedEmpty[2][3] = EMPTY_SLOT;
        expectedEmpty[2][4] = EMPTY_SLOT;
        expectedEmpty[2][5] = EMPTY_SLOT;
        expectedEmpty[2][6] = EMPTY_SLOT;
        expectedEmpty[2][7] = EMPTY_SLOT;

        expectedEmpty[3][0] = EMPTY_SLOT;
        expectedEmpty[3][1] = EMPTY_SLOT;
        expectedEmpty[3][2] = EMPTY_SLOT;
        expectedEmpty[3][3] = EMPTY_SLOT;
        expectedEmpty[3][4] = EMPTY_SLOT;
        expectedEmpty[3][5] = EMPTY_SLOT;
        expectedEmpty[3][6] = EMPTY_SLOT;
        expectedEmpty[3][7] = EMPTY_SLOT;

        expectedEmpty[4][0] = EMPTY_SLOT;
        expectedEmpty[4][1] = EMPTY_SLOT;
        expectedEmpty[4][2] = EMPTY_SLOT;
        expectedEmpty[4][3] = EMPTY_SLOT;
        expectedEmpty[4][4] = EMPTY_SLOT;
        expectedEmpty[4][5] = EMPTY_SLOT;
        expectedEmpty[4][6] = EMPTY_SLOT;
        expectedEmpty[4][7] = EMPTY_SLOT;

        expectedEmpty[5][0] = EMPTY_SLOT;
        expectedEmpty[5][1] = EMPTY_SLOT;
        expectedEmpty[5][2] = EMPTY_SLOT;
        expectedEmpty[5][3] = EMPTY_SLOT;
        expectedEmpty[5][4] = EMPTY_SLOT;
        expectedEmpty[5][5] = EMPTY_SLOT;
        expectedEmpty[5][6] = EMPTY_SLOT;
        expectedEmpty[5][7] = EMPTY_SLOT;

        expectedEmpty[6][0] = EMPTY_SLOT;
        expectedEmpty[6][1] = EMPTY_SLOT;
        expectedEmpty[6][2] = EMPTY_SLOT;
        expectedEmpty[6][3] = EMPTY_SLOT;
        expectedEmpty[6][4] = EMPTY_SLOT;
        expectedEmpty[6][5] = EMPTY_SLOT;
        expectedEmpty[6][6] = EMPTY_SLOT;
        expectedEmpty[6][7] = EMPTY_SLOT;

        expectedEmpty[7][0] = EMPTY_SLOT;
        expectedEmpty[7][1] = EMPTY_SLOT;
        expectedEmpty[7][2] = EMPTY_SLOT;
        expectedEmpty[7][3] = EMPTY_SLOT;
        expectedEmpty[7][4] = EMPTY_SLOT;
        expectedEmpty[7][5] = EMPTY_SLOT;
        expectedEmpty[7][6] = EMPTY_SLOT;
        expectedEmpty[7][7] = EMPTY_SLOT;
    }

    private static void initSample() {
        expectedSample1[0][0] = EMPTY_SLOT;
        expectedSample1[0][1] = EMPTY_SLOT;
        expectedSample1[0][2] = EMPTY_SLOT;
        expectedSample1[0][3] = EMPTY_SLOT;
        expectedSample1[0][4] = EMPTY_SLOT;
        expectedSample1[0][5] = EMPTY_SLOT;
        expectedSample1[0][6] = EMPTY_SLOT;
        expectedSample1[0][7] = EMPTY_SLOT;

        expectedSample1[1][0] = EMPTY_SLOT;
        expectedSample1[1][1] = EMPTY_SLOT;
        expectedSample1[1][2] = EMPTY_SLOT;
        expectedSample1[1][3] = EMPTY_SLOT;
        expectedSample1[1][4] = EMPTY_SLOT;
        expectedSample1[1][5] = EMPTY_SLOT;
        expectedSample1[1][6] = EMPTY_SLOT;
        expectedSample1[1][7] = EMPTY_SLOT;

        expectedSample1[2][0] = EMPTY_SLOT;
        expectedSample1[2][1] = EMPTY_SLOT;
        expectedSample1[2][2] = EMPTY_SLOT;
        expectedSample1[2][3] = EMPTY_SLOT;
        expectedSample1[2][4] = EMPTY_SLOT;
        expectedSample1[2][5] = EMPTY_SLOT;
        expectedSample1[2][6] = EMPTY_SLOT;
        expectedSample1[2][7] = EMPTY_SLOT;

        expectedSample1[3][0] = EMPTY_SLOT;
        expectedSample1[3][1] = "1";
        expectedSample1[3][2] = "1";
        expectedSample1[3][3] = "1";
        expectedSample1[3][4] = "1";
        expectedSample1[3][5] = EMPTY_SLOT;
        expectedSample1[3][6] = EMPTY_SLOT;
        expectedSample1[3][7] = EMPTY_SLOT;

        expectedSample1[4][0] = EMPTY_SLOT;
        expectedSample1[4][1] = "1";
        expectedSample1[4][2] = "1";
        expectedSample1[4][3] = "1";
        expectedSample1[4][4] = "1";
        expectedSample1[4][5] = EMPTY_SLOT;
        expectedSample1[4][6] = EMPTY_SLOT;
        expectedSample1[4][7] = EMPTY_SLOT;

        expectedSample1[5][0] = EMPTY_SLOT;
        expectedSample1[5][1] = "1";
        expectedSample1[5][2] = "1";
        expectedSample1[5][3] = "1";
        expectedSample1[5][4] = "1";
        expectedSample1[5][5] = EMPTY_SLOT;
        expectedSample1[5][6] = EMPTY_SLOT;
        expectedSample1[5][7] = EMPTY_SLOT;

        expectedSample1[6][0] = EMPTY_SLOT;
        expectedSample1[6][1] = "1";
        expectedSample1[6][2] = "1";
        expectedSample1[6][3] = "1";
        expectedSample1[6][4] = "1";
        expectedSample1[6][5] = EMPTY_SLOT;
        expectedSample1[6][6] = EMPTY_SLOT;
        expectedSample1[6][7] = EMPTY_SLOT;

        expectedSample1[7][0] = EMPTY_SLOT;
        expectedSample1[7][1] = EMPTY_SLOT;
        expectedSample1[7][2] = EMPTY_SLOT;
        expectedSample1[7][3] = EMPTY_SLOT;
        expectedSample1[7][4] = EMPTY_SLOT;
        expectedSample1[7][5] = EMPTY_SLOT;
        expectedSample1[7][6] = EMPTY_SLOT;
        expectedSample1[7][7] = EMPTY_SLOT;
    }

    private static void initSample2() {
        expectedSample2[0][0] = EMPTY_SLOT;
        expectedSample2[0][1] = EMPTY_SLOT;
        expectedSample2[0][2] = EMPTY_SLOT;
        expectedSample2[0][3] = EMPTY_SLOT;
        expectedSample2[0][4] = EMPTY_SLOT;
        expectedSample2[0][5] = EMPTY_SLOT;
        expectedSample2[0][6] = EMPTY_SLOT;
        expectedSample2[0][7] = EMPTY_SLOT;

        expectedSample2[1][0] = EMPTY_SLOT;
        expectedSample2[1][1] = EMPTY_SLOT;
        expectedSample2[1][2] = EMPTY_SLOT;
        expectedSample2[1][3] = "2";
        expectedSample2[1][4] = "2";
        expectedSample2[1][5] = "2";
        expectedSample2[1][6] = "2";
        expectedSample2[1][7] = EMPTY_SLOT;

        expectedSample2[2][0] = EMPTY_SLOT;
        expectedSample2[2][1] = EMPTY_SLOT;
        expectedSample2[2][2] = EMPTY_SLOT;
        expectedSample2[2][3] = "2";
        expectedSample2[2][4] = "2";
        expectedSample2[2][5] = "2";
        expectedSample2[2][6] = "2";
        expectedSample2[2][7] = EMPTY_SLOT;

        expectedSample2[3][0] = EMPTY_SLOT;
        expectedSample2[3][1] = EMPTY_SLOT;
        expectedSample2[3][2] = EMPTY_SLOT;
        expectedSample2[3][3] = "2";
        expectedSample2[3][4] = "2";
        expectedSample2[3][5] = "2";
        expectedSample2[3][6] = "2";
        expectedSample2[3][7] = EMPTY_SLOT;

        expectedSample2[4][0] = EMPTY_SLOT;
        expectedSample2[4][1] = EMPTY_SLOT;
        expectedSample2[4][2] = EMPTY_SLOT;
        expectedSample2[4][3] = "2";
        expectedSample2[4][4] = "2";
        expectedSample2[4][5] = "2";
        expectedSample2[4][6] = "2";
        expectedSample2[4][7] = EMPTY_SLOT;

        expectedSample2[5][0] = EMPTY_SLOT;
        expectedSample2[5][1] = EMPTY_SLOT;
        expectedSample2[5][2] = EMPTY_SLOT;
        expectedSample2[5][3] = EMPTY_SLOT;
        expectedSample2[5][4] = EMPTY_SLOT;
        expectedSample2[5][5] = EMPTY_SLOT;
        expectedSample2[5][6] = EMPTY_SLOT;
        expectedSample2[5][7] = EMPTY_SLOT;

        expectedSample2[6][0] = EMPTY_SLOT;
        expectedSample2[6][1] = EMPTY_SLOT;
        expectedSample2[6][2] = EMPTY_SLOT;
        expectedSample2[6][3] = EMPTY_SLOT;
        expectedSample2[6][4] = EMPTY_SLOT;
        expectedSample2[6][5] = EMPTY_SLOT;
        expectedSample2[6][6] = EMPTY_SLOT;
        expectedSample2[6][7] = EMPTY_SLOT;

        expectedSample2[7][0] = EMPTY_SLOT;
        expectedSample2[7][1] = EMPTY_SLOT;
        expectedSample2[7][2] = EMPTY_SLOT;
        expectedSample2[7][3] = EMPTY_SLOT;
        expectedSample2[7][4] = EMPTY_SLOT;
        expectedSample2[7][5] = EMPTY_SLOT;
        expectedSample2[7][6] = EMPTY_SLOT;
        expectedSample2[7][7] = EMPTY_SLOT;
    }

    private static void initSample3() {
        expectedSample3[0][0] = EMPTY_SLOT;
        expectedSample3[0][1] = EMPTY_SLOT;
        expectedSample3[0][2] = EMPTY_SLOT;
        expectedSample3[0][3] = EMPTY_SLOT;
        expectedSample3[0][4] = EMPTY_SLOT;
        expectedSample3[0][5] = EMPTY_SLOT;
        expectedSample3[0][6] = EMPTY_SLOT;
        expectedSample3[0][7] = EMPTY_SLOT;

        expectedSample3[1][0] = EMPTY_SLOT;
        expectedSample3[1][1] = EMPTY_SLOT;
        expectedSample3[1][2] = EMPTY_SLOT;
        expectedSample3[1][3] = EMPTY_SLOT;
        expectedSample3[1][4] = EMPTY_SLOT;
        expectedSample3[1][5] = EMPTY_SLOT;
        expectedSample3[1][6] = EMPTY_SLOT;
        expectedSample3[1][7] = EMPTY_SLOT;

        expectedSample3[2][0] = EMPTY_SLOT;
        expectedSample3[2][1] = EMPTY_SLOT;
        expectedSample3[2][2] = EMPTY_SLOT;
        expectedSample3[2][3] = EMPTY_SLOT;
        expectedSample3[2][4] = EMPTY_SLOT;
        expectedSample3[2][5] = EMPTY_SLOT;
        expectedSample3[2][6] = EMPTY_SLOT;
        expectedSample3[2][7] = EMPTY_SLOT;

        expectedSample3[3][0] = EMPTY_SLOT;
        expectedSample3[3][1] = EMPTY_SLOT;
        expectedSample3[3][2] = EMPTY_SLOT;
        expectedSample3[3][3] = EMPTY_SLOT;
        expectedSample3[3][4] = EMPTY_SLOT;
        expectedSample3[3][5] = EMPTY_SLOT;
        expectedSample3[3][6] = EMPTY_SLOT;
        expectedSample3[3][7] = EMPTY_SLOT;

        expectedSample3[4][0] = EMPTY_SLOT;
        expectedSample3[4][1] = EMPTY_SLOT;
        expectedSample3[4][2] = EMPTY_SLOT;
        expectedSample3[4][3] = EMPTY_SLOT;
        expectedSample3[4][4] = EMPTY_SLOT;
        expectedSample3[4][5] = EMPTY_SLOT;
        expectedSample3[4][6] = EMPTY_SLOT;
        expectedSample3[4][7] = EMPTY_SLOT;

        expectedSample3[5][0] = EMPTY_SLOT;
        expectedSample3[5][1] = EMPTY_SLOT;
        expectedSample3[5][2] = EMPTY_SLOT;
        expectedSample3[5][3] = EMPTY_SLOT;
        expectedSample3[5][4] = EMPTY_SLOT;
        expectedSample3[5][5] = "3";
        expectedSample3[5][6] = "3";
        expectedSample3[5][7] = EMPTY_SLOT;

        expectedSample3[6][0] = EMPTY_SLOT;
        expectedSample3[6][1] = EMPTY_SLOT;
        expectedSample3[6][2] = EMPTY_SLOT;
        expectedSample3[6][3] = EMPTY_SLOT;
        expectedSample3[6][4] = EMPTY_SLOT;
        expectedSample3[6][5] = "3";
        expectedSample3[6][6] = "3";
        expectedSample3[6][7] = EMPTY_SLOT;

        expectedSample3[7][0] = EMPTY_SLOT;
        expectedSample3[7][1] = EMPTY_SLOT;
        expectedSample3[7][2] = EMPTY_SLOT;
        expectedSample3[7][3] = EMPTY_SLOT;
        expectedSample3[7][4] = EMPTY_SLOT;
        expectedSample3[7][5] = EMPTY_SLOT;
        expectedSample3[7][6] = EMPTY_SLOT;
        expectedSample3[7][7] = EMPTY_SLOT;
    }

    private static void initMulti() {
        expectedMulti[0][0] = EMPTY_SLOT;
        expectedMulti[0][1] = EMPTY_SLOT;
        expectedMulti[0][2] = EMPTY_SLOT;
        expectedMulti[0][3] = EMPTY_SLOT;
        expectedMulti[0][4] = EMPTY_SLOT;
        expectedMulti[0][5] = EMPTY_SLOT;
        expectedMulti[0][6] = EMPTY_SLOT;
        expectedMulti[0][7] = EMPTY_SLOT;

        expectedMulti[1][0] = EMPTY_SLOT;
        expectedMulti[1][1] = EMPTY_SLOT;
        expectedMulti[1][2] = EMPTY_SLOT;
        expectedMulti[1][3] = "2";
        expectedMulti[1][4] = "2";
        expectedMulti[1][5] = "2";
        expectedMulti[1][6] = "2";
        expectedMulti[1][7] = EMPTY_SLOT;

        expectedMulti[2][0] = EMPTY_SLOT;
        expectedMulti[2][1] = EMPTY_SLOT;
        expectedMulti[2][2] = EMPTY_SLOT;
        expectedMulti[2][3] = "2";
        expectedMulti[2][4] = "2";
        expectedMulti[2][5] = "2";
        expectedMulti[2][6] = "2";
        expectedMulti[2][7] = EMPTY_SLOT;

        expectedMulti[3][0] = EMPTY_SLOT;
        expectedMulti[3][1] = "1";
        expectedMulti[3][2] = "1";
        expectedMulti[3][3] = MULTIPLE_SLOT;
        expectedMulti[3][4] = MULTIPLE_SLOT;
        expectedMulti[3][5] = "2";
        expectedMulti[3][6] = "2";
        expectedMulti[3][7] = EMPTY_SLOT;

        expectedMulti[4][0] = EMPTY_SLOT;
        expectedMulti[4][1] = "1";
        expectedMulti[4][2] = "1";
        expectedMulti[4][3] = MULTIPLE_SLOT;
        expectedMulti[4][4] = MULTIPLE_SLOT;
        expectedMulti[4][5] = "2";
        expectedMulti[4][6] = "2";
        expectedMulti[4][7] = EMPTY_SLOT;

        expectedMulti[5][0] = EMPTY_SLOT;
        expectedMulti[5][1] = "1";
        expectedMulti[5][2] = "1";
        expectedMulti[5][3] = "1";
        expectedMulti[5][4] = "1";
        expectedMulti[5][5] = "3";
        expectedMulti[5][6] = "3";
        expectedMulti[5][7] = EMPTY_SLOT;

        expectedMulti[6][0] = EMPTY_SLOT;
        expectedMulti[6][1] = "1";
        expectedMulti[6][2] = "1";
        expectedMulti[6][3] = "1";
        expectedMulti[6][4] = "1";
        expectedMulti[6][5] = "3";
        expectedMulti[6][6] = "3";
        expectedMulti[6][7] = EMPTY_SLOT;

        expectedMulti[7][0] = EMPTY_SLOT;
        expectedMulti[7][1] = EMPTY_SLOT;
        expectedMulti[7][2] = EMPTY_SLOT;
        expectedMulti[7][3] = EMPTY_SLOT;
        expectedMulti[7][4] = EMPTY_SLOT;
        expectedMulti[7][5] = EMPTY_SLOT;
        expectedMulti[7][6] = EMPTY_SLOT;
        expectedMulti[7][7] = EMPTY_SLOT;
    }


    @BeforeEach
    void setUp() {
        util = new ReadFileUtil();
        puzzle = new Puzzle(8, 8);
    }

    @Test
    void test_getClamis_sample1_success() {
        List<Claim> claims = puzzle.getClaims(SAMPLE_INPUT);
        assertEquals(3, claims.size());

        assertEquals(1, claims.get(0).claimId);
        assertEquals(1, claims.get(0).leftPos);
        assertEquals(3, claims.get(0).topPos);
        assertEquals(4, claims.get(0).width);
        assertEquals(4, claims.get(0).height);

        assertEquals(2, claims.get(1).claimId);
        assertEquals(3, claims.get(1).leftPos);
        assertEquals(1, claims.get(1).topPos);
        assertEquals(4, claims.get(1).width);
        assertEquals(4, claims.get(1).height);

        assertEquals(3, claims.get(2).claimId);
        assertEquals(5, claims.get(2).leftPos);
        assertEquals(5, claims.get(2).topPos);
        assertEquals(2, claims.get(2).width);
        assertEquals(2, claims.get(2).height);

    }

    @Test
    void test_initFabric_success() {
        String[][] fabric = puzzle.initFabric(8, 8);
        puzzle.print(fabric);
        assertTrue(Arrays.deepEquals(expectedEmpty, fabric));
    }

    @Test
    void test_placeClaim_sample1_success() {
        String[][] fabric = puzzle.initFabric(8, 8);
        fabric = puzzle.placeClaim(fabric, new Claim(1, 1, 3, 4, 4));

        puzzle.print(fabric);
        assertTrue(Arrays.deepEquals(expectedSample1, fabric));

    }

    @Test
    void test_placeClaim_sample2_success() {
        String[][] fabric = puzzle.initFabric(8, 8);
        fabric = puzzle.placeClaim(fabric, new Claim(2, 3, 1, 4, 4));

        puzzle.print(fabric);
        assertTrue(Arrays.deepEquals(expectedSample2, fabric));

    }

    @Test
    void test_placeClaims_sample3_success() {
        String[][] fabric = puzzle.initFabric(8, 8);
        fabric = puzzle.placeClaim(fabric, new Claim(3, 5, 5, 2, 2));

        puzzle.print(fabric);
        assertTrue(Arrays.deepEquals(expectedSample3, fabric));

    }

    @Test
    void test_placeClaim_success() {
        List<Claim> claims = puzzle.getClaims(SAMPLE_INPUT);
        String[][] fabric = puzzle.placeClaims(claims);

        puzzle.print(fabric);
        assertTrue(Arrays.deepEquals(expectedMulti, fabric));
        assertEquals(3, puzzle.getClaimIdWithoutOverlapping());
    }

    @Test
    void test_full_success() {
        puzzle = new Puzzle(1000, 1000);
        List<String> strings = util.readFileAsStrings("I_day3.txt");
        List<Claim> claims = puzzle.getClaims(strings);
        String[][] fabric = puzzle.placeClaims(claims);

        int count = puzzle.countMultiSlots(fabric);
        System.out.println(count);
        System.out.println(puzzle.getClaimIdWithoutOverlapping());

    }
}