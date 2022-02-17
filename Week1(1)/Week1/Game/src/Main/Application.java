package Main;

import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1900, 1000);
    }

    public void run() {
        int width = 1900;
        int height = 1000;
        int xmiddle = width / 2;
        int ymiddle = height / 2;
        SaxionApp.resize(width, height);
        ArrayList<Scenario> scenariolist = new ArrayList<>();
        CsvReader scenarios = new CsvReader("Week1(1)/Week1/Game/src/Main/Scenario.java");
        while (scenarios.loadRow()) {
            Scenario temp = new Scenario();

            scenariolist.add(temp);
        }

        int difficulty = init(xmiddle, ymiddle);
        player player = new player(difficulty);
        SaxionApp.clear();
<<<<<<< HEAD
        while (player.getBurnout() != 0) {
            Scenario scenario = new Scenario();
            player.drawTemplate(scenario);
=======
        while (player.getBurnout() != 100 && player.getBurnout() != 0) {

>>>>>>> main
        }

        SaxionApp.drawBorderedText("congratulations, you made it out of your burnout", xmiddle, ymiddle, 20);
    }


    public int init(int xmiddle, int ymiddle) {

        SaxionApp.setFill(Color.white);
        SaxionApp.turnBorderOff();
        SaxionApp.drawBorderedText("to get to the next screen press a key", xmiddle, ymiddle, 20);
        SaxionApp.readChar();
        SaxionApp.clear();
        SaxionApp.printLine("please select a difficulty setting");
        SaxionApp.printLine("1: easy");
        SaxionApp.printLine("2: medium");
        SaxionApp.printLine("3: hard");
        return SaxionApp.readInt();

    }
}