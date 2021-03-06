package Main;

import nl.saxion.app.SaxionApp;

import java.beans.beancontext.BeanContext;


public class Locations {
    String[] pastActions = {"string0", "String1", "string2", "string3", "string4"};

    public void thuis(player player) {
        if (player.location == "thuis") {
            if (check(player)) {
                SaxionApp.clear();
                player.drawTemplate();
                SaxionApp.drawText("1) go to the kitchen", 275, 785, 20);
                SaxionApp.drawText("2) go to the bedroom", 275, 885, 20);
                SaxionApp.drawText("3) go to the living room", 900, 785, 20);
                SaxionApp.drawText("4) go to the mall", 900, 885, 20);
                SaxionApp.drawImage("Week1(1)/it's in the game/Game/src/Main/art/hall-pixilart (1).png", 50, 50, 1750, 650);
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
                SaxionApp.drawImage("Week1(1)/it's in the game/Game/src/Main/art/pixilart-drawing.png", 50, 50, 1750, 650);
                character();
                switch (SaxionApp.readChar()) {
                    case '1':
                        if (addToActions("drink", pastActions)) {
                            player.increaseBurnout(2);
                            player.turn(player);
                        }
                        keuken(player);
                        break;
                    case '2':
                        if (addToActions("eat", pastActions)) {
                            player.increaseBurnout(5);
                            player.turn(player);
                            player.turn(player);
                        }

                        keuken(player);
                        break;
                    case '3':
                        if (addToActions("makeList", pastActions)) {
                            player.decreaseBurnout(1);
                        }

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
                SaxionApp.drawImage("Week1(1)/it's in the game/Game/src/Main/art/slaapkamer-pixilart (1).png", 50, 50, 1750, 650);
                character();
                switch (SaxionApp.readChar()) {
                    case '1':
                        if (addToActions("nap", pastActions)) {
                            player.increaseBurnout(2);
                            player.turn(player);
                        }

                        slaapkamer(player);
                        break;
                    case '2':
                        if (addToActions("meditate", pastActions)) {
                            player.increaseBurnout(6);
                            player.turn(player);
                        }

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
        if (player.location == "busstop") {
            SaxionApp.clear();
            player.drawTemplate();
            SaxionApp.drawText("1) go the clothes store", 275, 785, 20);
            SaxionApp.drawText("2) go to the cafe", 275, 885, 20);
            SaxionApp.drawText("3) go to the supermarket ", 900, 785, 20);
            SaxionApp.drawText("4) go home", 900, 885, 20);
            SaxionApp.drawImage("Week1(1)/it's in the game/Game/src/Main/art/bushalte-pixilart.png", 50, 50, 1750, 650);
            character();
            switch (SaxionApp.readChar()){
                case '1':
                    park(player);
                    break;

                case '2':
                    cafe(player);
                    break;

                case '3':
                    supermarkt(player);
                    break;

                case '4':
                    player.location = "thuis";
                    thuis(player);
                    break;

            }



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
                        if (addToActions("watchTV", pastActions)) {
                            player.increaseBurnout(2);
                            player.turn(player);
                        }

                        woonkamer(player);
                        break;
                    case '2':
                        if (addToActions("inviteFriends", pastActions)) {
                            player.increaseBurnout(5);
                            player.turn(player);
                            player.turn(player);
                        }

                        woonkamer(player);
                        break;
                    case '3':
                        if (addToActions("work", pastActions)) {
                            player.work(player);
                        }

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
                SaxionApp.drawImage("Week1(1)/it's in the game/Game/src/Main/art/bathroom-pixilart (1).png", 50, 50, 1750, 650);
                character();
                switch (SaxionApp.readChar()) {
                    case '1':
                        if (addToActions("shower", pastActions)) {
                            player.increaseBurnout(2);
                            player.turn(player);
                        }

                        badkamer(player);
                        break;
                    case '2':
                        if (addToActions("washFace", pastActions)) {
                            player.increaseBurnout(1);
                            player.turn(player);
                        }

                        badkamer(player);
                        break;
                    case '3':
                        if (addToActions("cleanBathroom", pastActions)) {
                            player.decreaseBurnout(2);
                        }

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
        if (addToActions("getGroceries", pastActions)) {
            SaxionApp.clear();
            SaxionApp.drawBorderedText("you went to get groceries and restocked the fridge", player.xmiddle, player.ymiddle, 20);
            player.decreaseBurnout(4);
            player.turn(player);
            player.turn(player);
            player.location = "thuis";
            thuis(player);
        } else {
            busstation(player);
        }
    }

    public void cafe(player player) {
        SaxionApp.drawImage("Week1(1)/it's in the game/Game/src/Main/art/bar-background-pixilart (3).png", 50, 50, 1750, 650);
        character();

    }

    public void park(player player) {
    }


    public boolean addToActions(String newAction, String[] array) {
        boolean canAdd = true;
        for (int i = 0; i < array.length; i++) {
            String action = array[i];
            int numberOfRemainingTurns = array.length - i;
            if (action == newAction) {
                SaxionApp.drawText("you can't do this for" + numberOfRemainingTurns + "turns", 0, 0, 0);
                canAdd = false;
                if (canAdd = false) {
                    break;
                }
            }
        }
        if (canAdd) {
            array[4] = array[3];
            array[3] = array[2];
            array[2] = array[1];
            array[1] = array[0];
            array[0] = newAction;
        }

        return canAdd;
    }


    private boolean check(player player) {
        return player.getBurnout() <= 99 && player.getBurnout() >= 1;

    }

}
