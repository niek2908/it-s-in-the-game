package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class TrainCompartment {
    private int numberOfSeats = 50;
    private int compartmentClass = 2;
    private int numberOfSeatsInUse = 0;

    public void ShowDetails() {
        SaxionApp.print("there are currently " + numberOfSeatsInUse + " seats in use out of a total of " + numberOfSeats + " with class " + compartmentClass);

    }

    public void enter() {
        if (numberOfSeatsInUse >= 50) {
            SaxionApp.printLine("the train has reached max capacity");
        } else {
            numberOfSeatsInUse++;
            SaxionApp.printLine("there are now a total of " + numberOfSeatsInUse + " passengers");
        }

    }

    public void leave() {
        if (numberOfSeatsInUse <= 0) {
            SaxionApp.printLine("there is no one to leave");
        } else {
            numberOfSeatsInUse--;
            SaxionApp.printLine("there are now a total of " + numberOfSeatsInUse + " passengers");


        }

    }
}


