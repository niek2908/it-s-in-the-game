package Main;

import nl.saxion.app.SaxionApp;

import java.awt.*;

import nl.saxion.app.CsvReader;

public class player  {

    private int burnout = 10;
    String location = "thuis";
    private int difficulty;
    private int time = 14;
    private int day = 0;
    private int money = 500;
    int xmiddle;
    int ymiddle;
    int timesworked = 0;

    public int getDifficulty() {
        return difficulty;
    }

    public void setBurnout(int burnout) {
        this.burnout = burnout;
    }

    public player(int difficulty , int xmiddle, int ymiddle) {

        this.difficulty = difficulty;
    }

    public int getMoney(){
        return money;
    }

    public int getDay(){
        return day;
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

    public String getLevel() {
        return location;
    }

    public void increaseBurnout(int amount) {
        burnout = this.burnout + amount * difficulty;
    }
    public void decreaseBurnout(int amount){burnout = this.burnout - amount;}

    public void lowerBurnout(int amount) {
        burnout = this.burnout - amount * difficulty;
    }

    public void setLevel(String level) {
        this.location = level;
    }

    public void pay(int amount) {
        this.money = this.money - amount;

    }
        public void turn(player player){
        if (time == 22){
            time = 10;
            day++;
            SaxionApp.drawBorderedText("you went to sleep, and awoke on a new day",xmiddle, ymiddle, 20);
            if (day % 5 == 0){
                money = this.money + (10*timesworked);
            }
        }
        time = this.time + 1;
        }
    public void work(player player){
        if (player.location  == "woonkamer"){
            player.turn(player);
            player.turn(player);
            timesworked++;
            player.decreaseBurnout(5);
        }
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

        //outline textboxes
        SaxionApp.turnFillOff();
        SaxionApp.drawRectangle(270,780,575,50);
        SaxionApp.drawRectangle(270,880,575,50);
        SaxionApp.drawRectangle(895,780,575,50);
        SaxionApp.drawRectangle(895,880,575,50);
    }
}

