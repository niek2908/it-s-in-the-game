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
        CsvReader scenarios = new CsvReader("Week1(1)/it's in the game/Game/src/Main/scenario.csv");
        scenarios.skipRow();
        scenarios.setSeparator(',');
        while (scenarios.loadRow()) {
            Scenario temp = new Scenario();
            temp.question = scenarios.getString(0);
            temp.answer1 = scenarios.getString(1);
            temp.answer2 = scenarios.getString(2);
            temp.answer3 = scenarios.getString(3);
            temp.answer4 = scenarios.getString(4);
            temp.location = scenarios.getString(5);
            temp.money = scenarios.getInt(6);
            scenariolist.add(temp);
        }

        int difficulty = init(xmiddle, ymiddle);
        player player = new player(difficulty);
        SaxionApp.clear();

        while (player.getBurnout() != 100 && player.getBurnout() != 0) {
            if (player.getBurnout() > 100) {
                player.setBurnout(100);
            } else if (player.getBurnout() < 0) {
                player.setBurnout(0);
            }
            player.drawTemplate();
            SaxionApp.readChar();

        }

        SaxionApp.drawBorderedText("congratulations, you made it out of your burnout", xmiddle, ymiddle, 20);
    }


    public int init(int xmiddle, int ymiddle) {
        SaxionApp.setBackgroundColor(Color.white);
        SaxionApp.setFill(Color.black);
        SaxionApp.turnBorderOff();
        SaxionApp.drawBorderedText("to get to the next screen press a key", xmiddle, ymiddle, 20);
        SaxionApp.readChar();
        SaxionApp.clear();
        SaxionApp.printLine("please select a difficulty setting", Color.black);
        SaxionApp.printLine("1: easy", Color.black);
        SaxionApp.printLine("2: medium", Color.black);
        SaxionApp.printLine("3: hard", Color.black);

        return SaxionApp.readInt();

    }

    public Scenario GetRandomScenario(String location, ArrayList<Scenario> Scenariolist) {
        ArrayList<Scenario> temp = new ArrayList<>();// creates a temporary arraylist to load the needed scenario's in
        for (Scenario s : Scenariolist) {// loads the needed scenarios in the arraylist
            if (s.location == location) {
                temp.add(s);
            }
        }
        if (temp.size() == 0) {// checks to see if there are any entries in the list
            return null;
        } else
            return (temp.get(SaxionApp.getRandomValueBetween(0, temp.size())));

    }
}
