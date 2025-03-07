import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // MAD LIBS GAME
    Scanner scanner = new Scanner(System.in);
    String adjective1, adjective2, adjective3;
    String noun1;
    String verb1;

    System.out.println("Enter adjective (description): ");
    adjective1 = scanner.nextLine();

    System.out.println("Enter a noun (person or animal): ");
    noun1 = scanner.nextLine();

    System.out.println("Enter adjective (description): ");
    adjective2 = scanner.nextLine();

    System.out.println("Enter a verb (ending with an -ing): ");
    verb1 = scanner.nextLine();

    System.out.println("Enter adjective (description): ");
    adjective3 = scanner.nextLine();

    System.out.println("\nToday i went to a: " + adjective1 + " zoo."); // \n writes new line
    System.out.println("In an exhibit i saw a " + noun1 + ".");
    System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
    System.out.println("I was " + adjective3 + "!");

    scanner.close();
    }
}
