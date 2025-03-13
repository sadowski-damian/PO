import java.io.IOException;
import java.util.Scanner;

public class Main {
    String FirstName; // obowiazkowe
    String LastName; // obowiazkowe
    String JobTitle; // opcjonalne
    String Company; // opcjonalne
    String Email; // opcjonalne
    String PhoneNumber; // opcjonalne

    public Main(){
        FirstName = "";
        LastName = "";
        JobTitle = "";
        Company = "";
        Email = "";
        PhoneNumber = "";
    }

    static void DisplayShortInfo(String FirstName, String LastName, String JobTitle, String Company){ // Pierwsza metoda
        if(Company.isBlank() && !(JobTitle.isBlank())){ // Jezeli Company jest puste oraz Stanowisko nie jest puste.
            System.out.printf("%s %s (%s)",FirstName, LastName, JobTitle);
        }
        else{
            if(!(JobTitle.isBlank())){ // jezeli stanowisko nie jest puste.
                System.out.printf("%s %s (%s at %s)",FirstName, LastName, JobTitle, Company);
            }
            else{
            }
                System.out.printf("%s %s",FirstName, LastName);
            }

        }
        


    static void FullInfo(String FirstName, String LastName, String JobTitle, String Company, String Email, String PhoneNumber){ // Druga metoda
        System.out.println("==========================");
        System.out.println(FirstName + " " + LastName);
        if(!(JobTitle.isBlank()) || !(Company.isBlank())){
            System.out.println("--------------------------");
        }
        if(!(JobTitle.isBlank())){
            System.out.println(JobTitle);
        }
        if(!(Company.isBlank())){
            System.out.println(Company);
        }
        if(!(Email.isBlank()) || !(PhoneNumber.isBlank())){
            System.out.println("--------------------------");
        }
        if(!(Email.isBlank()) && Email.contains("@")){
            System.out.println("Email: " + Email);
        }
        if(!(PhoneNumber.isBlank())){
            System.out.println("Phone: " + PhoneNumber);
        }
        System.out.println("==========================");
    }
    public static void main(String[] args) throws IOException {
        Main myObj = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Imie (obowiązkowe): ");
        myObj.FirstName = scanner.nextLine();
        while(myObj.FirstName.isBlank()){
            System.out.print("Imie (obowiązkowe): ");
            myObj.FirstName = scanner.nextLine();
        }

        System.out.print("Nazwisko (obowiązkowe): ");
        myObj.LastName = scanner.nextLine();
        while(myObj.LastName.isBlank()){
            System.out.print("Nazwisko (obowiązkowe): ");
            myObj.LastName = scanner.nextLine();
        }

        System.out.print("Stanowisko (opcjonalne): ");
        myObj.JobTitle = scanner.nextLine();

        System.out.print("Firma (opcjonalne): ");
        myObj.Company = scanner.nextLine();
 
        System.out.print("E-mail (opcjonalne): ");
        myObj.Email = scanner.nextLine();

        System.out.print("Telefon (opcjonalne): ");
        myObj.PhoneNumber = scanner.nextLine();

        System.out.println("\n");
        DisplayShortInfo(myObj.FirstName, myObj.LastName, myObj.JobTitle, myObj.Company);
        System.out.println("\n \n");
        
        FullInfo(myObj.FirstName, myObj.LastName, myObj.JobTitle, myObj.Company, myObj.Email, myObj.PhoneNumber);
        scanner.close();
    }
}
