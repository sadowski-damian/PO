import java.util.Scanner; // imporing scanner

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Enter your name: "); // print vs println, println goes to the next line, print doesnt
        String name = scanner.nextLine(); // Czyta cala linie, przeczyta poprawnie Damian Damian i wypisze to samo
        //String name = scanner.next(); // Czyta tylko do pierwszej spacji, czyli Jak wpisze Damian Damian to wypisze tylko Damian

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA? ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (ture/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your GPA is: " + gpa);
        if(isStudent) {
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }
        */

        // COMMON ISSUES
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // NAPRAWA BLEDU
        scanner.nextLine(); // clearing input buffer

        System.out.print("What is your favorite color? ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old.");
        System.out.println("You like the color " + color);
        // Problem z wypisywaniem, poniewaz po wpisaniu liczby w buforze dalej znajduje sie znak kolejnej linii \n, dlatego aby dzialalo poprawnie musimy go wyczyscic


        scanner.close(); // We should close the scanner before be finish.
    }
}
