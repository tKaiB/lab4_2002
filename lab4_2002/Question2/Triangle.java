package lab4_2002.Question2;

public class Triangle implements Shape{
    double base, height;
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        return 0.5 * base * height;
    }
}