package day3;

public class Claim {
    public int claimId;
    public int leftPos;
    public int topPos;
    public int width;
    public int height;

    public Claim(int claimId, int leftPos, int topPos, int width, int height) {
        this.claimId = claimId;
        this.leftPos = leftPos;
        this.topPos = topPos;
        this.width = width;
        this.height = height;
    }

}
