package Main;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1900, 1000);
    }

    public void run() {
        int difficulty = init();
        player player = new player(difficulty);
        SaxionApp.clear();
        SaxionApp.printLine(player.getDifficulty());
    }


    public int init() {
        SaxionApp.setFill(Color.white);
        SaxionApp.turnBorderOff();
        SaxionApp.drawBorderedText("to get to the next screen press a key",850,500,20);
        SaxionApp.readChar();
        SaxionApp.clear();
        SaxionApp.printLine("please select a difficulty setting");
        SaxionApp.printLine("1: easy");
        SaxionApp.printLine("2: medium");
        SaxionApp.printLine("3: hard");
        int difficulty = SaxionApp.readInt();
        return difficulty;

    }
}