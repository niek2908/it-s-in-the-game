package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.geom.Area;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        circle circle = new circle(250,250,100);
        SaxionApp.printLine("x: " + circle.getX()+", y: " + circle.getY() + ", radius: " + circle.getRadius());
        SaxionApp.print("area: "+ circle.area());
        SaxionApp.print("perimeter: " + circle.perimeter());
        circle.draw();

        // We used the following lines of code to produce the sample_output.png file.
//        SaxionApp.printLine("x: " + c.getxCoordinate() + ", y: " + c.getyCoordinate() + ", radius: " + c.getRadius());
//        SaxionApp.printLine("area: " + c.area() + ", perimeter: " + c.perimeter());
//
//        c.draw();

    }
}