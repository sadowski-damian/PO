import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Shopping cart
        Scanner scanner = new Scanner(System.in);
        char dolar = '$';

        System.out.print("Co chcialbys kupic? ");
        String item = scanner.nextLine();

        System.out.print("Ile kosztuje jeden? ");
        double price = scanner.nextDouble();

        System.out.print("Ile chcialbys kupic? ");
        int quanity = scanner.nextInt();

        double totalPrice = price * quanity;
        System.out.println("You have bought " + quanity + " " + item +"'s");
        System.out.println("Your total is " + dolar + totalPrice);

        scanner.close();
    }
}
