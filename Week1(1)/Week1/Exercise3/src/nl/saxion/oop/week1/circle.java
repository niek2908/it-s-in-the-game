package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class circle {
    private int x;
    private int y;
    private int radius;

    public circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public double getRadius(){return radius;}
    public double area(){
        return (Math.pow(radius,2)* Math.PI);

    }
    public double perimeter(){
        return (2* Math.PI*radius);
    }

    public void draw() {
        SaxionApp.drawCircle(x,y,radius);
    }
}
