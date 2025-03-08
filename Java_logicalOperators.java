import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        boolean isBetween;
        boolean noSpacesUnderscores;

        if(4 <= username.length() && username.length() <= 12) {
            System.out.println("Welcome " + username + " !");
            isBetween = true;
        }
        else if(username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain apces or underscores.");
            noSpacesUnderscores = false;

        }
        else{
            System.out.println("Username must be between 4 and 12 characters!");
            isBetween = false;
        }


        scanner.close();
   }
}
