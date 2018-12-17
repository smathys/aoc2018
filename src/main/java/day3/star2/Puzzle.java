package day3.star2;

import day3.Claim;

import java.util.Collections;
import java.util.List;

class Puzzle {

    static final String EMPTY_SLOT = ".";
    static final String MULTIPLE_SLOT = "X";

    private String[][] fabric;

    Puzzle(int fullWidth, int fullHeight) {

        this.fabric = initFabric(fullWidth, fullHeight);
    }

    String[][] placeClaims(List<Claim> claims) {
        for (Claim claim : claims) {
            fabric = placeClaim(fabric, claim);
        }
        return fabric;

    }

    String[][] placeClaim(String[][] fabric, Claim claim) {
        return fabric;
    }

    int countMultiSlots(String[][] fabric) {
        return 0;
    }

    void print(String[][] fabric) {
        for (String[] rows : fabric) {
            for (String col : rows) {
                System.out.print(col);
            }
            System.out.println("");
        }
    }

    String[][] initFabric(int rows, int cols) {
        return new String[cols][rows];
    }


    List<Claim> getClaims(List<String> input) {
        return Collections.emptyList();

    }

    int getClaimIdWithoutOverlapping() {
        return 0;
    }

}
