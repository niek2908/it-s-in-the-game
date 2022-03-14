package Main;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;


public class Locations {
    String[] actions = {null, null, null, null};

    public void thuis(player player) {
        if (player.location == "thuis") {
            if (check(player)) {
                SaxionApp.clear();
                player.drawTemplate();
                SaxionApp.drawText("1) go to the kitchen", 275, 785, 20);
                SaxionApp.drawText("2) go to the bedroom", 275, 885, 20);
                SaxionApp.drawText("3) go to the living room", 900, 785, 20);
                SaxionApp.drawText("4) go to the mall", 900, 885, 20);
                character();
                switch (SaxionApp.readChar()) {
                    case '1':
                        player.location = "keuken";
                        keuken(player);
                        break;

                    case '2':
                        player.location = "slaapkamer";
                        slaapkamer(player);
                        break;
                    case '3':
                        player.location = "woonkamer";
                        woonkamer(player);
                        break;
                    case '4':
                        player.location = "busstop";
                        busstation(player);
                        break;

                }
            }
        } else {
            throw new IllegalStateException("you aren't in the hallway");
        }

    }

    public void character() {
        //Draw character
        SaxionApp.drawImage("Week1(1)/it's in the game/Game/src/Main/art/character-1-pixilart (1).png", 1300, 300, 400, 400);
    }


    public void keuken(player player) {
        if (player.location == "keuken") {
            if (check(player)) {
                SaxionApp.clear();
                player.drawTemplate();
                SaxionApp.drawText("1) have a glass of water", 275, 785, 20);
                SaxionApp.drawText("2) have some food", 275, 885, 20);
                SaxionApp.drawText("3) make a shopping list ", 900, 785, 20);
                SaxionApp.drawText("4) go to the hallway", 900, 885, 20);
                character();
                switch (SaxionApp.readChar()) {
                    case '1':
                        player.increaseBurnout(2);
                        player.turn(player);
                        keuken(player);
                        break;
                    case '2':
                        player.increaseBurnout(5);
                        player.turn(player);
                        player.turn(player);
                        keuken(player);
                        break;
                    case '3':
                        player.decreaseBurnout(1);
                        keuken(player);
                        break;
                    case '4':
                        player.location = "thuis";
                        thuis(player);
                        break;
                }
            }
        } else {
            throw new IllegalStateException("you aren't in the kitchen");
        }
    }


    public void slaapkamer(player player) {
        if (player.location == "slaapkamer") {
            if (check(player)) {
                SaxionApp.clear();
                player.drawTemplate();
                SaxionApp.drawText("1) take a nap", 275, 785, 20);
                SaxionApp.drawText("2) meditate", 275, 885, 20);
                SaxionApp.drawText("3) go to the bathroom ", 900, 785, 20);
                SaxionApp.drawText("4) go to the hallway", 900, 885, 20);
                character();
                switch (SaxionApp.readChar()) {
                    case '1':
                        player.increaseBurnout(2);
                        player.turn(player);
                        slaapkamer(player);
                        break;
                    case '2':
                        player.increaseBurnout(6);
                        player.turn(player);
                        slaapkamer(player);
                        break;
                    case '3':
                        player.location = "badkamer";
                        badkamer(player);
                        break;
                    case '4':
                        player.location = "thuis";
                        thuis(player);
                        break;
                }
            }
        } else {
            throw new IllegalStateException("you aren't in the bedroom");
        }


    }

    public void busstation(player player) {
        if (player.location == "woonkamer") {
            SaxionApp.clear();
            player.drawTemplate();
            SaxionApp.drawText("1) go the clothes store", 275, 785, 20);
            SaxionApp.drawText("2) go to the cafe", 275, 885, 20);
            SaxionApp.drawText("3) go to the supermarket ", 900, 785, 20);
            SaxionApp.drawText("4) go home", 900, 885, 20);
            character();
            switch (SaxionApp.readChar()) {
                case 1:
                    player.increaseBurnout(2);
                    player.turn(player);
                    break;
                case 2:
                    player.increaseBurnout(5);
                    player.turn(player);
                    player.turn(player);
                    break;
                case 3:
                    player.work(player);
                    break;
                case 4:
                    player.location = "thuis";
                    break;
            }
        } else {
            throw new IllegalStateException("you aren't in the living room");
        }

    }

    public void woonkamer(player player) {
        if (player.location == "woonkamer") {
            if (check(player)) {
                SaxionApp.clear();
                player.drawTemplate();
                SaxionApp.drawText("1) Watch some tv", 275, 785, 20);
                SaxionApp.drawText("2) Invite some friends over", 275, 885, 20);
                SaxionApp.drawText("3) Work ", 900, 785, 20);
                SaxionApp.drawText("4) Go to the hallway", 900, 885, 20);
                SaxionApp.drawImage("Week1(1)/it's in the game/Game/src/Main/art/woonkamer-pixilart (2).png", 50, 50, 1750, 650);

                character();
                switch (SaxionApp.readChar()) {
                    case '1':
                        player.increaseBurnout(2);
                        player.turn(player);
                        woonkamer(player);
                        break;
                    case '2':
                        player.increaseBurnout(5);
                        player.turn(player);
                        player.turn(player);
                        woonkamer(player);
                        break;
                    case '3':
                        player.work(player);
                        woonkamer(player);
                        break;
                    case '4':
                        player.location = "thuis";
                        thuis(player);
                        break;
                }
            }
        } else {
            throw new IllegalStateException("you aren't in the living room");
        }
    }

    public void badkamer(player player) {
        if (player.location == "badkamer") {
            if (check(player)) {
                SaxionApp.clear();
                player.drawTemplate();
                SaxionApp.drawText("1) take a long shower", 275, 785, 20);
                SaxionApp.drawText("2) wash your face", 275, 885, 20);
                SaxionApp.drawText("3) clean the bathroom ", 900, 785, 20);
                SaxionApp.drawText("4) go to the bedroom", 900, 885, 20);
                character();
                switch (SaxionApp.readChar()) {
                    case '1':
                        player.increaseBurnout(2);
                        player.turn(player);
                        badkamer(player);
                        break;
                    case '2':
                        player.increaseBurnout(1);
                        player.turn(player);
                        badkamer(player);
                        break;
                    case '3':
                        player.decreaseBurnout(2);
                        badkamer(player);
                        break;
                    case '4':
                        player.location = "slaapkamer";
                        slaapkamer(player);
                        break;
                }
            }

        } else {
            throw new IllegalStateException("you aren't in the bathroom");
        }
    }

    public void supermarkt(player player) {
        SaxionApp.clear();
        SaxionApp.drawBorderedText("you went to get groceries and restocked the fridge", player.xmiddle, player.ymiddle, 20);
        player.decreaseBurnout(4);
        player.turn(player);
        player.turn(player);
        player.location = "thuis";
        thuis(player);
    }

    public void cafe(player player) {
        SaxionApp.drawImage("Week1(1)/it's in the game/Game/src/Main/art/bar-background-pixilart (3).png", 50, 50, 1750, 650);
        character();
    }

    public void kledingwinkel(player player) {
    }

    



    private boolean check(player player) {
        return player.getBurnout() <= 99 && player.getBurnout() >= 0;

    }

}
