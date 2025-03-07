import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if statements
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student (true/false)?");
        isStudent = scanner.nextBoolean();

        // Group 1
        if(name.isEmpty()){ // isEmpty checks if variable is empty or not;
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        // Group 2
        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        }
        else if(age == 0){
            System.out.println("You have been just born!");
        }
        else{
            System.out.println("You are an child!");
        }

        //GROUP 3
        if(isStudent){
            System.out.println("You are an student!");
        }
        else{
            System.out.println("You are not an student!");
        }
    }
}
