package Main;

import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1900, 1000);
    }

    public void run() {
        CsvReader save = new CsvReader("Week1(1)/Week1/Game/src/Main/save.csv");
        SaxionApp.printLine("to get to the next screen press a key");
        SaxionApp.readChar();
        SaxionApp.clear();
        int difficulty;
        drawTemplate("option1","option2","option3","option4");
        SaxionApp.readChar();
        SaxionApp.printLine("please select a difficulty setting");
        SaxionApp.printLine("1: easy");
        SaxionApp.printLine("2: medium");
        SaxionApp.printLine("3: hard");
        difficulty = SaxionApp.readInt();
        player player = new player(difficulty);
        SaxionApp.readChar();

    }

public void drawTemplate(String option1,String option2,String option3,String option4){
        SaxionApp.turnFillOff();
        SaxionApp.setBorderColor(Color.black);
        SaxionApp.drawRectangle(50,50,1750,650);

        

}
}