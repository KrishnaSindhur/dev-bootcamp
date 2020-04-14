import javafx.util.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuleEngineTest {
   //private Object Pair;

    @Test
    public void shouldReturnScoreWhenBothPlayerCooperate() {
        Pair score = new RuleEngine().getScore(PlayerMove.Cooperate, PlayerMove.Cooperate);
        assertEquals(new Pair<>(2,2), score);
    }
    @Test
    public void shouldReturnScoreWhenBothPlayerCheat() {
        Pair score = new RuleEngine().getScore(PlayerMove.Cheat, PlayerMove.Cheat);
        assertEquals(new Pair<>(0, 0), score);
    }

    @Test
    public void shouldReturnScoreWhenPlayer1CheatAndPlayer2Cooperate() {
        Pair score = new RuleEngine().getScore(PlayerMove.Cheat, PlayerMove.Cooperate);
        assertEquals(new Pair<>(3, -1), score);
    }

    @Test
    public void shouldReturnScoreWhenPlayer1CooperateAndPlayer2Cheat() {
        Pair score = new RuleEngine().getScore(PlayerMove.Cooperate, PlayerMove.Cheat);
        assertEquals(new Pair<>(-1, 3), score);
    }
}