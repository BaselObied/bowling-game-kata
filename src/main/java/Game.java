public class Game {
    private int totalScore = 0;
    public void roll(int pins) {
        this.totalScore += pins;
    }

    public int score() {
        return totalScore;
    }
}
