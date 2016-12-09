package ru.live.denir.xo;

/**
 * Created by sasha on 07.12.2016.
 */
public class Figure {
    private static final String GAME_NAME = "XO";
    private Figure figure11 = new Figure(" ");
    private Figure figure12 = new Figure(" ");
    private Figure figure13 = new Figure(" ");
    private Figure figure21 = new Figure(" ");
    private Figure figure22 = new Figure(" ");
    private Figure figure23 = new Figure(" ");
    private Figure figure31 = new Figure(" ");
    private Figure figure32 = new Figure(" ");
    private Figure figure33 = new Figure(" ");

    public Figure(String s) {


    }

    public void printGameName() {
        System.out.println(GAME_NAME);
    }

    public void getFigure() {

    }
}
