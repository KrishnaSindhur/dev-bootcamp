import javafx.util.Pair;

public class RuleEngine {
    public Pair getScore(String player1Move, String player2Move) {
        if (player1Move.equalsIgnoreCase("cooperate") && player2Move.equalsIgnoreCase("cooperate"))
            return new Pair(2, 2);
        else if (player1Move.equalsIgnoreCase("cheat") && player2Move.equalsIgnoreCase("cheat"))
            return new Pair(0, 0);
        else if (player1Move.equalsIgnoreCase("cheat") && player2Move.equalsIgnoreCase("cooperate"))
            return new Pair(3, -1);
        else if (player1Move.equalsIgnoreCase("cooperate") && player2Move.equalsIgnoreCase("cheat"))
            return new Pair(-1, 3);
        else
            return null;
    }
}
