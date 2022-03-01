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
            SaxionApp.drawText("2) ", 275, 885, 10);
            SaxionApp.drawText("3) ", 900, 785, 10);
            SaxionApp.drawText("4) ga naar de hal", 275, 885, 10);
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
