public class Game {
    private int totalScore = 0;
    private int [] rolls = new int[21];
    private int currentRole = 0;

    public void roll(int pins) {
        rolls[currentRole++] = pins;
    }

    public int score() {
        int roleIndex = 0;
        for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
            if(rolls[roleIndex] + rolls[roleIndex+1] == 10) { // spare
                totalScore += 10 + rolls[roleIndex+2];
                roleIndex+=2;
            }  else {
                totalScore += rolls[roleIndex] + rolls[roleIndex + 1];
                roleIndex+=2;
            }
        }
        return totalScore;
    }
}
