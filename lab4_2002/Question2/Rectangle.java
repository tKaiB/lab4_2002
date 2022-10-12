package lab4_2002.Question2;


public class Rectangle implements Shape {
    double length, width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return this.length * this.width;
    }
}