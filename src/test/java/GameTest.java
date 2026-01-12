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
    void TestAllOnes() {
        rollWithPins(20, 1);
        Assertions.assertEquals(20, game.score());
    }

    private void rollWithPins(int rollsTime, int pins) {
        for (int i = 0; i < rollsTime; i++) {
            game.roll(pins);
        }
    }
}
