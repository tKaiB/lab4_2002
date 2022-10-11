public class Sphere extends Circle{
    public Sphere(double radius){
        super(radius);
    }
    public double area(){
        return 4 * super.area();
    }
}