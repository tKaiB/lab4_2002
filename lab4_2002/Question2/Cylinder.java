package lab4_2002.Question2;

public class Cylinder extends Cuboid{
    double radius;
    public Cylinder(double radius, double height){
        super(0,0,height);
    }
    public double area(){
        return 2 * Math.PI * this.radius * this.height + 2 * Math.PI * this.radius * this.radius;
    }
}
