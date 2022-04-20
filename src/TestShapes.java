import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

public class TestShapes{
    public static void main(String[] args) {

        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object

        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4


         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area

         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12

         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0

         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0

         Circle has the largest area as 50.24
         */

        Scanner input = new Scanner(System.in);
        //Take in user input for width, height, side length, and radius.
        System.out.println("Please enter the width");
        double width = input.nextDouble();
        System.out.println("Please enter the height");
        double height = input.nextDouble();
        System.out.println("Please enter the side length");
        double side = input.nextDouble();
        System.out.println("Please enter the radius");
        double radius = input.nextDouble();

        //instantiate your Objects
        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(width, height);
        Square square = new Square(side);

        //Add your shapes to an ArrayList for easier access
        List <Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);

        //This will be used to find the largest area
        double max = Integer.MIN_VALUE;
        Shape greatestArea = null;


        //Shape output
        for (Shape shape : shapes) {
            System.out.println("\n" + shape);
            System.out.println("Area of the " + shape.getClass().getSimpleName() + " is = " + shape.area());
            System.out.println("Perimeter of the " + shape.getClass().getSimpleName() + " is = " + shape.perimeter());
            if (shape.area() > max) greatestArea = shape;
        }
        System.out.println("\n" + greatestArea.getClass().getSimpleName() + " has the largest area as " + greatestArea.area());
        }
    }

