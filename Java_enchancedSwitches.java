import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        String day = scanner.nextLine();
        switch(day){
            case "Monday" -> System.out.println("Weekday");
            case "Tuesday" -> System.out.println("Weekday");
            case "Wednesday" -> System.out.println("Weekday");
            case "Thursday" -> System.out.println("Weekday");
            case "Friday" -> System.out.println("Weekday");
            case "Saturday" -> System.out.println("Weekend");
            case "Sunday" -> System.out.println("Weekend");
            default -> System.out.println(day + " is not a day");
        }

        // Lepsza opcja
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
   }
}
