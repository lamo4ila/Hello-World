package ru.live.denir.xo;

/**
 * Created by sasha on 07.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        final Game game = new Game();
        game.printGameName();

        final TwoPlayersGame twoPlayersGame = new TwoPlayersGame("Max", "Andy");
        twoPlayersGame.printPlayer1Name();
        twoPlayersGame.printPlayer2Name();
        twoPlayersGame.printGameName();

        final ThreePlayersGame threePlayersGame = new ThreePlayersGame("Max", "Andy", "Jorge");
        threePlayersGame.printPlayer1Name();
        threePlayersGame.printPlayer2Name();
        threePlayersGame.printPlayer3Name();
        threePlayersGame.printGameName();

    }

    private static void printGameNameAndBoard(final Game game, final Board board) {
        game.printGameName();
        board.printBoard();
    }
}


