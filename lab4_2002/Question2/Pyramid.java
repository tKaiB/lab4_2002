package lab4_2002.Question2;

public class Pyramid extends Triangle{
    double base, height;

    private double slantheight;

    public Pyramid(double length, double height) {
        super(length, height);
    }

    public double area() {
        slantheight = Math.sqrt((super.base / 2) + (super.height)
        return (Math.pow(super.base, 2) + (super.base * slantheight) * 4);
    }
}