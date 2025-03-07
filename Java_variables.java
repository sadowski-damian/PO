public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World"); // You can use sout [tab] to print this
        // Single line comment
        /*
        Multiline
        comment
         */


        // Rodzaje zmiennych
        /*
        Primitive = simple value stored directly in memory (stack) (int, double, char, boolean)
        Reference = memory adress (stack) that points to the (heap) (string, array, object)
        */

        // int age; // declaration
        // System.out.println(age); // ERR: java: variable age might not have been initialized


        // PRIMITIVE DATA TYPES

        int age = 21;
        System.out.println("Age is: " + age);

        double price = 19.99;
        double GPA = 3;
        double temperature = -12.5;
        System.out.println("Temperature is: " + temperature + "*");
        System.out.println("GPA is: " + GPA);

        char grade = 'A'; // We have to use single quotes to characters
        char currency = '$';
        System.out.println("Currency is: " + currency);

        boolean isStudent = false; // When naming variables we can name them using CamelCase (first word is lowercase next is uppercase)
        boolean forSale = false;
        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }

        // REFERENCE DATA TYPES
        String name = "Marcin Kiszczak";
        System.out.println("Hello " + name); // String concatenation
        String food = "pizza";
        System.out.println("Your favorite food is " + food);
        String email = "Fryta123@gmail.com";
        System.out.println("Your email is " + email + " :)");

        System.out.println("Your age is " + age + " " + name + " " + email);

        if(forSale){
            System.out.println("There is a " + name + " for sale");
        }
        else{
            System.out.println(name + " is not for sale");
        }
    }
}
