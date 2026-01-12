public class Game {
    private int totalScore = 0;
    public void roll(int i) {
        this.totalScore += i;
    }

    public int score() {
        return totalScore;
    }
}
