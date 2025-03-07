import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email adress: ");
        String email = scanner.nextLine();
        if(email.contains("@")){
            int index = email.indexOf("@");
            String username = email.substring(0, index); // Od ktorego do ktorego, od 0 do 4 (nie wliczajac 4, czyli tak naprawde od 0 do 3)
            String domain = email.substring(index+1);
            System.out.println("Your username is: " + username);
            System.out.println("Domain: " + domain);
        }
        else{
            System.out.println("Your email adress is invalid!");
        }

        scanner.close();
    }
}
