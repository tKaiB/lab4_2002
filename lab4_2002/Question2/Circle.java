package lab4_2002.Question2;

public class Circle implements Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * Math.pow(this.radius,2.0);
    }

}   