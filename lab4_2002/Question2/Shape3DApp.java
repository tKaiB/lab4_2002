package lab4_2002.Question2;
import java.util.Scanner;
public class Shape3DApp {
    public static void main(String[] args) {
        int numOfShapes;
        int typeOfShape;
        double radius, tHeight, rWidth, rLength, tBase, sLength, rHeight,tLength,tRadius,rRadius;
        double totalArea = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of shapes: ");
        numOfShapes = sc.nextInt();
        Shape[] usersShape = new Shape[numOfShapes];
        for (int i = 0; i < numOfShapes; i++) {
            System.out.println("Enter type of shapes: ");
            System.out.println("1.Sphere ");
            System.out.println("2.Cylinder ");
            System.out.println("3.Cone");
            System.out.println("4.Square ");


            typeOfShape = sc.nextInt();
            switch (typeOfShape) {
                case 1:
                    System.out.print("Enter radius of Sphere: ");
                    radius = sc.nextDouble();
                    usersShape[i] = new Sphere(radius);
                    break;
                case 2:
                    System.out.print("Enter radius of Cylinder: ");
                    rRadius = sc.nextDouble();
                    System.out.print("Enter height of Cylinder: ");
                    rHeight = sc.nextDouble();
                    usersShape[i] = new Cylinder(rRadius, rHeight);
                    break;
                case 3:
                    System.out.print("Enter radius of Cone: ");
                    tRadius = sc.nextDouble();
                    System.out.print("Enter height of Cone: ");
                    tHeight = sc.nextDouble();
                    usersShape[i] = new Pyramid(tRadius, tHeight);
                    break;
                case 4:
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
            {2
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
