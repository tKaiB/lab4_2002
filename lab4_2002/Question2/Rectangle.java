import org.w3c.dom.css.Rect;

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
