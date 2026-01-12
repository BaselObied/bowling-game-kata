import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void testGutterGame() {
        rollWithPins(20, 0);
        Assertions.assertEquals(0, game.score());
    }

    @Test
    void testAllOnes() {
        rollWithPins(20, 1);
        Assertions.assertEquals(20, game.score());
    }

    @Test
    void testOneSpare() {
        rollSpare();
        game.roll(4);
        rollWithPins(17, 0);
        Assertions.assertEquals(18, game.score());
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollWithPins(int rollsTime, int pins) {
        for (int i = 0; i < rollsTime; i++) {
            game.roll(pins);
        }
    }
}
