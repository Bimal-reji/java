import java.util.Scanner;

public class calcarea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1- Triangle \n2- Rectangle \n3- Circle");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the base and height of the triangle:");
                double base = in.nextDouble();
                double height = in.nextDouble();
                System.out.println("The area of the triangle is: " + calculateTriangleArea(base, height));
                break;

            case 2:
                System.out.println("Enter the length and width of the rectangle:");
                double length = in.nextDouble();
                double width = in.nextDouble();
                System.out.println("The area of the rectangle is: " + calculateRectangleArea(length, width));
                break;

            case 3:
                System.out.println("Enter the radius of the circle:");
                double radius = in.nextDouble();
                System.out.println("The area of the circle is: " + calculateCircleArea(radius));
                break;

            default:
                System.out.println("Choice out of scope");
        }
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

