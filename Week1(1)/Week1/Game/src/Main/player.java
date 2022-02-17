package Main;

import nl.saxion.app.SaxionApp;

import java.awt.*;

import nl.saxion.app.CsvReader;

public class player {
    private int burnout = 10;
    int level;
    private int difficulty;
    private int time;
    private int money;

    public int getDifficulty() {
        return difficulty;
    }

    public player(int difficulty) {

        this.difficulty = difficulty;
    }

    public int getTime() {
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
        burnout = this.burnout + amount * difficulty;
    }

    public void lowerBurnout(int amount) {
        burnout = this.burnout - amount * difficulty;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void pay(int amount){
        this.money = this.money - amount;

    }
    public void earn_money(int amount){
        this.money = this.money + amount;
    }

    
    public void drawTemplate(Scenario scenario) {
        SaxionApp.turnFillOff();
        SaxionApp.turnBorderOff();
        SaxionApp.setBorderColor(Color.black);
        SaxionApp.drawRectangle(50, 50, 1750, 650);

        //draw burnout meter

        SaxionApp.drawText("Progress", 1600, 1000,30);

        //draw time and date

        //draw money
    }
}

