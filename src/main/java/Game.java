public class Game {
    private int totalScore = 0;
    private final int [] rolls = new int[21];
    private int currentRole = 0;

    public void roll(int pins) {
        rolls[currentRole++] = pins;
    }

    public int score() {
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if(isStrike(frameIndex)) {
                totalScore += calculateStrikeBonus(frameIndex);
                frameIndex++;
            } else if(isSpare(frameIndex)) {
                totalScore += calculateSpareBonus(frameIndex);
                frameIndex+=2;
            }  else {
                totalScore += calculateBallsInFrame(frameIndex);
                frameIndex+=2;
            }
        }
        return totalScore;
    }

    private int calculateStrikeBonus(int frameIndex) {
        return 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
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
