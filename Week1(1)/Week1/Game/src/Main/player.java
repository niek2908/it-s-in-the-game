package Main;

import nl.saxion.app.SaxionApp;

import java.awt.*;

import nl.saxion.app.CsvReader;

public class player {
    private int burnout;
    private int level;
    private int difficulty;
    private int time;

    public int getDifficulty() {
        return difficulty;
    }
    public  player(int difficulty){

        this.difficulty = difficulty;
    }
    public int getTime(){
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getBurnout() {
        return burnout;
    }

    public int getLevel() {
        return level;
    }

    public void increaseBurnout(int amount) {
        burnout = this.burnout + amount*difficulty;
    }
    public void lowerBurnout(int amount) {
        burnout = this.burnout - amount*difficulty;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    public void drawTemplate(Scenario scenario) {
        SaxionApp.turnFillOff();
        SaxionApp.turnBorderOff();
        SaxionApp.setBorderColor(Color.black);
        SaxionApp.drawRectangle(50, 50, 1750, 650);
    }
}

