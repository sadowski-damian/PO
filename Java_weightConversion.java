import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our converter!");
        System.out.println("1. Lbs->Kg");
        System.out.println("2. Kg->Lbs");
        int choice = scanner.nextInt();
        double weight;
        if(choice == 1) {
            System.out.println("Enter Lbs");
            weight = scanner.nextDouble();
            if(weight > 0){
                double calculatedWeight = weight / 2.205;
                System.out.printf("%.2flbs is %.2fkg",weight,calculatedWeight);
            }
            else{
                System.out.println("Invalid weight");
            }
        }
        if(choice == 2) {
            System.out.println("Enter Kg");
            weight = scanner.nextDouble();
            if(weight > 0){
                double calculatedWeight = weight * 2.205;
                System.out.printf("%.2fkg is %.2flbs",weight, calculatedWeight);
            }
            else{
                System.out.println("Invalid weight");
            }
        }
        else{
            System.out.println("Wrong choice!");
        }
        scanner.close();
    }
}
