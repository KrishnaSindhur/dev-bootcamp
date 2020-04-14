import javafx.util.Pair;

public class RuleEngine {
    public Pair<Integer, Integer> getScore(PlayerMove player1Move, PlayerMove player2Move) {
        if (player1Move == PlayerMove.Cooperate && player2Move == PlayerMove.Cooperate)
            return new Pair<>(2, 2);
        else if (player1Move == PlayerMove.Cheat && player2Move == PlayerMove.Cheat)
            return new Pair<>(0, 0);
        else if (player1Move == PlayerMove.Cheat && player2Move == PlayerMove.Cooperate)
            return new Pair<>(3, -1);
        else if (player1Move == PlayerMove.Cooperate && player2Move == PlayerMove.Cheat)
            return new Pair<>(-1, 3);
        else
            return null;
    }
}
