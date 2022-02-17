package Main;

import nl.saxion.app.SaxionApp;

import java.awt.*;

import nl.saxion.app.CsvReader;

public class player {

    private int burnout = 10;
    int level;
    private int difficulty;
    private int time = 14;
    private int day = 0;
    private int money = 500;

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

    public void pay(int amount) {
        this.money = this.money - amount;

    }

    public void earn_money(int amount) {
        this.money = this.money + amount;
    }


    public void drawTemplate() {
        SaxionApp.turnBorderOn();
        SaxionApp.turnFillOff();
        SaxionApp.setBorderColor(Color.black);
        SaxionApp.drawRectangle(50, 50, 1750, 650);

        //draw burnout meter
        SaxionApp.turnFillOn();
        SaxionApp.setFill(Color.BLACK);
        SaxionApp.drawText("Progress:", 1500, 720, 20);
        SaxionApp.setFill(Color.GRAY);
        SaxionApp.drawRectangle(1600,720,200,20);
        SaxionApp.setFill(Color.GREEN);
        SaxionApp.drawRectangle(1600,720,burnout*2,20);

        //draw time and day
        SaxionApp.drawText("Time: " + time + ":00",50,720,20);
        SaxionApp.drawText("Day: " + day,50,750,20);

        //draw money
        SaxionApp.drawText("Money: €" + money,50,780,20);
    }
}

