public class Game {
    private int totalScore = 0;
    private int [] rolls = new int[21];
    private int currentRole = 0;

    public void roll(int pins) {
        rolls[currentRole++] = pins;
    }

    public int score() {
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if(isSpare(frameIndex)) {
                totalScore += calculateSpareBonus(frameIndex);
            }  else {
                totalScore += calculateBallsInFrame(frameIndex);
            }
            frameIndex+=2;
        }
        return totalScore;
    }

    private int calculateBallsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private int calculateSpareBonus(int frameIndex) {
        return 10 + rolls[frameIndex + 2];
    }

    private boolean isSpare(int roleIndex) {
        return calculateBallsInFrame(roleIndex) == 10;
    }
}
