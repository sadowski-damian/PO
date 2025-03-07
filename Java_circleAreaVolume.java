import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference is: %.1fcm\n", circumference);
        System.out.printf("Area is: %.1fcm^2\n", area);
        System.out.printf("Volume is: %.1fcm^3\n", volume);
        scanner.close();
    }
}
