import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Math.PI); //pi
        System.out.println(Math.E); // eulers

        double result;

        result = Math.pow(2, 16); // 2 to the power of 16
        System.out.println(result);

        result = Math.abs(-5);
        System.out.println(result);

        result = Math.sqrt(9);
        System.out.println(result);

        result = Math.round(3.14); // nearest whole int
        System.out.println(result);

        result = Math.ceil(3.14);
        System.out.println(result); // do gory

        result = Math.floor(3.14);
        System.out.println(result); // do dolu

        result = Math.max(10, 20);
        System.out.println(result); // Finds maximum number

        result = Math.min(10, 20);
        System.out.println(result); // Finds minimum number

        // PITAGORAS
        double a, b;
        System.out.print("\n\nWhat is A: ");
        a = scanner.nextDouble();
        System.out.print("What is B: ");
        b = scanner.nextDouble();
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        System.out.println("C is: " + c);

        scanner.close();
    }
}
