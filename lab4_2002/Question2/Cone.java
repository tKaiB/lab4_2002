package lab4_2002.Question2;

public class Cone extends Pyramid{
    private double radius;
    private double l;

    public Cone(double radius, double height){
        super(0, height);
        this.radius = radius;
    }
    public double area(){
        return Math.PI * this.radius * (this.radius + Math.sqrt((this.height*this.height + this.radius*this.radius)));

    }
}
