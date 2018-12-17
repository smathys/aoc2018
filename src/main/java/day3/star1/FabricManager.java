package day3.star1;

import day3.Claim;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FabricManager {


    private static final String SEPARATOR_1 = "@";
    private static final String SEPARATOR_2 = ":";
    private static final String SEPARATOR_3 = ",";
    private static final String SEPARATOR_4 = "x";

    static final String EMPTY_SLOT = ".";
    static final String MULTIPLE_SLOT = "X";

    private int notOverlappingId;


    private String[][] fabric;

    FabricManager(int fullWidth, int fullHeight) {
        this.fabric = initFabric(fullWidth, fullHeight);
    }

    String[][] placeClaims(List<Claim> claims) {
        for (Claim claim : claims) {
            fabric = placeClaim(fabric, claim);
        }
        return fabric;

    }

    String[][] placeClaim(String[][] fabric, Claim claim) {
        boolean hasOverlaps = false;

        String[][] result = new String[fabric.length][fabric.length];
        for (int x = 0; x < fabric.length; x++) {
            for (int y = 0; y < fabric[x].length; y++) {
                if (x >= (claim.topPos) && x <= (claim.topPos + claim.height - 1)) {
                    if (y >= (claim.leftPos) && y <= (claim.leftPos + claim.width - 1)) {
                        if (!fabric[x][y].equals(EMPTY_SLOT)) {
                            result[x][y] = MULTIPLE_SLOT;
                            hasOverlaps = true;

                        } else {
                            result[x][y] = "" + claim.claimId;
                        }
                    } else {
                        result[x][y] = fabric[x][y];
                    }
                } else {
                    result[x][y] = fabric[x][y];
                }
            }
        }

        if (!hasOverlaps) {
            notOverlappingId = claim.claimId;
            System.out.println(claim.claimId);
        }

        return result;
    }

    int countMultiSlots(String[][] fabric) {
        int count = 0;
        for (String[] rows : fabric) {
            for (String col : rows) {
                if (col.equals(MULTIPLE_SLOT)) {
                    count++;
                }
            }

        }
        return count;
    }

    int getNotOverlappingId() {
        return notOverlappingId;
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
        String[][] result = new String[cols][rows];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                result[x][y] = EMPTY_SLOT;
            }
        }
        return result;
    }


    static List<Claim> getClaims(List<String> input) {
        Stream<Claim> claims = input.stream().map(s -> {
                    int claimId = extractClaimId(s);

                    Positions positions = extractPositions(s);
                    Dimensions dimensions = extractDimensions(s);

                    return new Claim(claimId, positions.left, positions.top, dimensions.width, dimensions.height);
                }
        );
        return claims.collect(Collectors.toList());

    }

    private static Dimensions extractDimensions(String s) {
        String s3 = s.substring(s.indexOf(":") + 1);
        String[] dimensions = s3.split(SEPARATOR_4);
        int width = Integer.valueOf(dimensions[0].trim());
        int height = Integer.valueOf(dimensions[1].trim());
        return new Dimensions(width, height);
    }

    private static int extractClaimId(String s) {
        String s1 = s.substring(0, s.indexOf("@"));
        String id = s1.replaceFirst("#", "").trim();
        return Integer.valueOf(id);
    }

    private static Positions extractPositions(String s) {
        String s2 = s.substring(s.indexOf(SEPARATOR_1) + 1, s.indexOf(SEPARATOR_2));
        String[] positions = s2.split(SEPARATOR_3);
        int leftPos = Integer.valueOf(positions[0].trim());
        int topPos = Integer.valueOf(positions[1].trim());
        return new Positions(leftPos, topPos);
    }

    static class Positions {
        int left;
        int top;

        Positions(int left, int top) {
            this.left = left;
            this.top = top;
        }
    }

    static class Dimensions {
        int width;
        int height;

        Dimensions(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }


}
