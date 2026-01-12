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
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        Assertions.assertEquals(0, game.score());
    }

    @Test
    void TestAllOnes() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        Assertions.assertEquals(20, game.score());
    }
}
