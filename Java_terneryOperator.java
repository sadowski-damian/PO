public class Main {
    public static void main(String[] args) {
        // Ternary operator ?
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfDay = (hours < 12 ) ? "AM" : "PM";
        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
   }
}
