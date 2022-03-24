package Main;

import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
            SaxionApp.drawBorderedText("You went to sleep, and awoke on a new day",xmiddle, ymiddle, 20);
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

    public void save(){
        int saveChoice = SaxionApp.readInt();
        if (saveChoice == 8) {
            try {
                String score1 = String.valueOf(getBurnout());
                String geld1 = String.valueOf(getMoney());
                String tijd1 = String.valueOf(getTime());
                String dag1 = String.valueOf(getDay());

                File file = new File("Week1(1)/it's in the game/Game/src/Main/save1.csv");

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("score,geld,tijd,dag");
                bw.newLine();
                bw.write(score1);
                bw.write(',');
                bw.write(geld1);
                bw.write(',');
                bw.write(tijd1);
                bw.write(',');
                bw.write(dag1);
                bw.close();

                System.out.println("Done");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (saveChoice == 9) {
            try {
                String score2 = String.valueOf(getBurnout());
                String geld2 = String.valueOf(getMoney());
                String tijd2 = String.valueOf(getTime());
                String dag2 = String.valueOf(getDay());

                File file = new File("Week1(1)/it's in the game/Game/src/Main/save2.csv");

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("score,geld,tijd,dag");
                bw.newLine();
                bw.write(score2);
                bw.write(',');
                bw.write(geld2);
                bw.write(',');
                bw.write(tijd2);
                bw.write(',');
                bw.write(dag2);
                bw.close();

                System.out.println("Done");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

