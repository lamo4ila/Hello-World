package ru.live.denir.xo;

/**
 * Created by sasha on 07.12.2016.
 */
public class ThreePlayersGame extends TwoPlayersGame {
    private final String player3Name;

    public ThreePlayersGame(final String player1Name, final String player2Name, final String player3Name) {
        super(player1Name, player2Name);
        this.player3Name = player3Name;
    }

    public void printPlayer3Name() {
        System.out.println(this.player3Name);
    }
}
