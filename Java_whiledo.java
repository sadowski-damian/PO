import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Press Q to exit: ");
            response = scanner.nextLine().toUpperCase();
        }

        System.out.println("You have quit the game");

        int age = 0;
        System.out.println("Enter you age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age cant be negative ");
            System.out.println("Enter you age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");

        int number;
        do{
            System.out.println("Enter a number between 1 and 10");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number + " number");

        scanner.close();
   }
}
