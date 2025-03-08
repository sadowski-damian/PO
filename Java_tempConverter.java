import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F) ");
        String unit = scanner.nextLine().toUpperCase();

        double newTemp = (unit.equals("F")) ? (temperature * (9.0/5.0)) + 32: (temperature - 32) * (5.0/9.0);
        System.out.printf("Temperatura: %.1f %s", newTemp, unit);

        scanner.close();
   }
}
