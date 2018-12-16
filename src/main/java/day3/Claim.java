package day3;

public class Claim {
    int claimId;
    int leftPos;
    int topPos;
    int width;
    int height;

    public Claim(int claimId, int leftPos, int topPos, int width, int height) {
        this.claimId = claimId;
        this.leftPos = leftPos;
        this.topPos = topPos;
        this.width = width;
        this.height = height;
    }

    public int getClaimId() {
        return claimId;
    }

    public int getLeftPos() {
        return leftPos;
    }

    public int getTopPos() {
        return topPos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
