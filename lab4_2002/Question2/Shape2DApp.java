import java.io.InputStream;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        int numOfShapes;
        String typeOfShape;
        double radius, tHeight, rWidth, rLength, tBase, sLength;
        double totalArea = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of shapes: ");
        numOfShapes = sc.nextInt();
        Shape[] usersShape = new Shape[numOfShapes];
        for (int i = 0; i < numOfShapes; i++) {
            System.out.println("Enter TYPE of shapes: ");
            typeOfShape = sc.next();
            switch (typeOfShape) {
                case "Circle":
                    System.out.print("Enter radius of Circle: ");
                    radius = sc.nextDouble();
                    usersShape[i] = new Circle(radius);
                    break;
                case "Rectangle":
                    System.out.print("Enter length of Rectangle: ");
                    rLength = sc.nextDouble();
                    System.out.print("Enter width of Rectangle: ");
                    rWidth = sc.nextDouble();
                    usersShape[i] = new Rectangle(rLength, rWidth);
                    break;
                case "Triangle":
                    System.out.print("Enter base of Triangle: ");
                    tBase = sc.nextDouble();
                    System.out.print("Enter height of Triangle: ");
                    tHeight = sc.nextDouble();
                    usersShape[i] = new Triangle(tBase, tHeight);
                    break;
                case "Square":
                    System.out.print("Enter length of Square: ");
                    sLength = sc.nextDouble();
                    usersShape[i] = new Square(sLength);
                    break;
                default:
                    break;
            }
        }
        //calculating area
        while(true){
            int calOrQuit;
            System.out.print("Enter 1 to calculate total area or 2 to Quit :");
            calOrQuit = sc.nextInt();
            if(calOrQuit == 1)
            {
                for(int j = 0; j < usersShape.length; j++){
                    totalArea += usersShape[j].area();
                }
                System.out.println("The total area is " + totalArea + ".");
            }
            else
            {
                System.exit(0);;
            }
        }
    }
}
