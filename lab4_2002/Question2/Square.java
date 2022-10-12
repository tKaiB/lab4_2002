package lab4_2002.Question2;

public class Square implements Shape {
    double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return length * length;
    }
}