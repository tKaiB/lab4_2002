package lab4_2002.Question2;

public class Cuboid extends Rectangle {
    double surArea;
    double height;
    public Cuboid(double length, double width, double height){
        super(length, width);
        this.height = height;
    }

    public double area(){
        surArea = (2 * length * width) + (2 * length * height) + (2 * height * width);
        return surArea;
    }
}