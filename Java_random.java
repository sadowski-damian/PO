import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number1, number2, number3;
        number1 = random.nextInt(1, 6); //Number between 1 and 6, including one, excluding 6 (so its 1-5)
        number2 = random.nextInt(1, 6);
        number3 = random.nextInt(1, 6);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        double double1 = random.nextDouble();
        double double2 = random.nextDouble();
        double double3 = random.nextDouble();

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}
