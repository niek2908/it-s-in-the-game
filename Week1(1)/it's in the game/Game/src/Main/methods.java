package Main;

import nl.saxion.app.SaxionApp;

public class methods {

    public void thuis(player player) {
        if (player.location == "thuis")
            player.drawTemplate();
        SaxionApp.drawText("1) ga naar de keuken", 275, 785, 10);
        SaxionApp.drawText("2) ga naar de slaapkamer", 275, 885, 10);
        SaxionApp.drawText("3) ga naar de woonkamer", 900, 785, 10);
        SaxionApp.drawText("4) ga naar de badkamer", 275, 885, 10);

        switch (SaxionApp.readInt()) {
            case 1:
                player.location = "keuken";
                break;
            case 2:
                player.location = "slaapkamer";
                break;
            case 3:
                player.location = "woonkamer";
            case 4:
                player.location = "badkamer";
                break;
        }
        SaxionApp.clear();
    }

    public void keuken(player player) {
        if (player.location == "keuken") {
            player.drawTemplate();
            SaxionApp.drawText("1) neem een glas water", 275, 785, 10);
            SaxionApp.drawText("2) pak wat te eten", 275, 885, 10);
            SaxionApp.drawText("3) maak een boodschappenlijstje ", 900, 785, 10);
            SaxionApp.drawText("4) ga naar de hal", 275, 885, 10);
            switch (SaxionApp.readInt()) {
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
            SaxionApp.clear();
        }
        else {
            throw new IllegalStateException("je bent niet in de keuken");
        }
    }


    public void slaapkamer(player player) {


    }

    public void woonkamer(player player) {
    }

    public void badkamer(player player) {

    }

    public void supermarkt(player player) {
    }

    public void cafe(player player) {
    }

    public void kledingwinkel(player player) {
    }


}
