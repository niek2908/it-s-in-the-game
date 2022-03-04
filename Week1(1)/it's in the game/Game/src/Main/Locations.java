package Main;

import nl.saxion.app.SaxionApp;

public class Locations {
    

    public void thuis(player player) {
        if (player.location == "thuis") {
            SaxionApp.clear();
            player.drawTemplate();
            SaxionApp.drawText("1) go to the kitchen", 275, 785, 20);
            SaxionApp.drawText("2) go to the bedroom", 275, 885, 20);
            SaxionApp.drawText("3) go to the living room", 900, 785, 20);
            SaxionApp.drawText("4) go to the mall", 900, 885, 20);

            switch (SaxionApp.readChar()) {
                case 1:
                    player.location = "keuken";
                    keuken(player);

                case 2:
                    player.location = "slaapkamer";
                    slaapkamer(player);
                    break;
                case 3:
                    player.location = "woonkamer";
                    woonkamer(player);
                    break;
                case 4:
                    player.location = "badkamer";
                    badkamer(player);
                    break;

            }
        }
        else {
            throw new IllegalStateException("you aren't in the hallway");
        }

    }


    public void keuken(player player) {
        if (player.location == "keuken") {
            SaxionApp.clear();
            player.drawTemplate();
            SaxionApp.drawText("1) have a glass of water", 275, 785, 20);
            SaxionApp.drawText("2) have some food", 275, 885, 20);
            SaxionApp.drawText("3) make a shopping list ", 900, 785, 20);
            SaxionApp.drawText("4) go to the hallway", 900, 885, 20);
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
                    player.decreaseBurnout(1);
                    break;
                case 4:
                    player.location = "thuis";
                    break;
            }
        } else {
            throw new IllegalStateException("you aren't in the kitchen");
        }
    }


    public void slaapkamer(player player) {
        if (player.location == "slaapkamer") {
            SaxionApp.clear();
            player.drawTemplate();
            SaxionApp.drawText("1) take a nap", 275, 785, 20);
            SaxionApp.drawText("2) meditate", 275, 885, 20);
            SaxionApp.drawText("3) go to the bathroom ", 900, 785, 20);
            SaxionApp.drawText("4) go to the hallway", 900, 885, 20);
            switch (SaxionApp.readChar()) {
                case 1:
                    player.increaseBurnout(2);
                    player.turn(player);
                    break;
                case 2:
                    player.increaseBurnout(6);
                    player.turn(player);
                    break;
                case 3:
                    player.location = "badkamer";
                    break;
                case 4:
                    player.location = "thuis";
                    break;
            }
        } else {
            throw new IllegalStateException("you aren't in the bedroom");
        }


    }

    public void woonkamer(player player) {
        if (player.location == "woonkamer") {
            SaxionApp.clear();
            player.drawTemplate();
            SaxionApp.drawText("1) watch some tv", 275, 785, 20);
            SaxionApp.drawText("2) invite some friends over", 275, 885, 20);
            SaxionApp.drawText("3) work ", 900, 785, 20);
            SaxionApp.drawText("4) go to the hallway", 900, 885, 20);
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

    public void badkamer(player player) {
        if (player.location == "badkamer") {
            SaxionApp.clear();
            player.drawTemplate();
            SaxionApp.drawText("1) take a long shower", 275, 785, 20);
            SaxionApp.drawText("2) wash your face", 275, 885, 20);
            SaxionApp.drawText("3) clean the bathroom ", 900, 785, 20);
            SaxionApp.drawText("4) go to the bedroom", 900, 885, 20);
            switch (SaxionApp.readChar()) {
                case 1:
                    player.increaseBurnout(2);
                    player.turn(player);
                    break;
                case 2:
                    player.increaseBurnout(1);
                    player.turn(player);
                    break;
                case 3:
                    player.decreaseBurnout(2);
                    break;
                case 4:
                    player.location = "slaapkamer";
                    break;
            }

        } else {
            throw new IllegalStateException("you aren't in the bathroom");
        }
    }

    public void supermarkt(player player) {
        SaxionApp.clear();
        SaxionApp.drawBorderedText("you went to get groceries and restocked the fride",player.xmiddle, player.ymiddle, 20);
        player.decreaseBurnout(4);
        player.turn(player);
        player.turn(player);
        busstation(player);
    }

    public void cafe(player player) {
    }

    public void kledingwinkel(player player) {
    }
public void busstation(player player){
    SaxionApp.clear();
}

}