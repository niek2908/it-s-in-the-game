package Main;

import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1900, 1000);
    }

    public void run() {

        CsvReader save = new CsvReader("Week1(1)/Week1/Game/src/Main/save.csv");

        SaxionApp.clear();
        int difficulty;
        SaxionApp.readChar();
        SaxionApp.printLine("please select a difficulty setting");
        SaxionApp.printLine("1: easy");
        SaxionApp.printLine("2: medium");
        SaxionApp.printLine("3: hard");
        difficulty = SaxionApp.readInt();
        player player = new player(difficulty);
        SaxionApp.readChar();
    }

    public void drawTemplate(Scenario scenario) {
        SaxionApp.turnFillOff();
        SaxionApp.setBorderColor(Color.black);
        SaxionApp.drawRectangle(50, 50, 1750, 650);
    }

    public void init() {
        SaxionApp.setBackgroundColor(Color.white);
        SaxionApp.drawBorderedText("to get to the next screen press a key",950,500,20);
        SaxionApp.readChar();

    }
}