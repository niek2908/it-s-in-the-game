package Main;

import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        CsvReader save = new CsvReader("save.csv");
        SaxionApp.printLine("to get to the next screen press a key");
        SaxionApp.readChar();
        int difficulty;
        SaxionApp.printLine("please select a difficulty setting");
        SaxionApp.printLine("1: easy");
        SaxionApp.printLine("2: medium");
        SaxionApp.printLine("3: hard");
        difficulty = SaxionApp.readInt();
        player player = new player(difficulty);
        SaxionApp.readChar();

    }


}