import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNum = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNum = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^, &): ");
        char operator = scanner.next().charAt(0);
        double result = 0;
        boolean isOperationValid = true;

        switch (operator){
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                if(secondNum == 0) {
                    System.out.println("You cant divide by 0. ");
                    isOperationValid = false;
                }
                else{
                    result = firstNum / secondNum;
                }
            }
            case '^' -> result = Math.pow(firstNum, secondNum);
            case '%' -> result = firstNum % secondNum;
            default -> {
                System.out.println("Invalid operator. ");
                isOperationValid = false;
            }
        }
        if(isOperationValid){
            System.out.println(result);
        }

        scanner.close();
   }
}
