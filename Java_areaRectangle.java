import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculate area of a rectangle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets calculate area of an rectange!");
        System.out.println("A: ");
        double a = scanner.nextDouble();
        System.out.println("B: ");
        double b = scanner.nextDouble();
        double area = a*b;
        System.out.println("The area of the rectange is: " + area + "cm²");
    }
}
