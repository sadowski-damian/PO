import java.util.Scanner;

public class Main {
    String cardNumber;
    String cardHolder;
    double creditLimit;
    double currentDebt;
    int dailyTransactionLimit;
    int transactionCount;

    public Main(String cardNumber, String cardHolder, double creditLimit, double currentDebt, int dailyTransactionLimit) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.creditLimit = creditLimit;
        this.currentDebt = currentDebt;
        this.dailyTransactionLimit = dailyTransactionLimit;
        this.transactionCount = 0;
    }

    public boolean makePurchase(double amount) {
        if ((currentDebt + amount) > creditLimit || (transactionCount + 1) > dailyTransactionLimit) {
            System.out.println("Nie mozesz wziac wiecej kredytu lub przekroczono limit transakcji.");
            return false;
        } else {
            currentDebt += amount;
            transactionCount++;
            System.out.printf("Udalo sie dokonac zakupu! Twoje zadluzenie wynosi teraz: %.2f\n", currentDebt);
            return true;
        }
    }

    public void resetDailyLimit() {
        transactionCount = 0;
        System.out.println("Dzienny limit transakcji został zresetowany.");
    }

    public void makePayment(double amount) {
        if (amount >= currentDebt) {
            double reszta = amount - currentDebt;
            System.out.printf("Wplaciles %.2f, twoje zadluzenie zostalo splacone. Reszta: %.2f\n", amount, reszta);
            currentDebt = 0.00;
        } else {
            currentDebt -= amount;
            System.out.printf("Wplaciles %.2f, twoje zadluzenie wynosi teraz: %.2f\n", amount, currentDebt);
        }
    }

    public void getCardInfo() {
        System.out.printf("Podsumowanie:\nPosiadacz karty: %s\nNumer karty: %s\nMaksymalna kwota kredytu: %.2f\nAktualne zadluzenie: %.2f\nDzienny limit transakcji: %d\nLicznik transakcji: %d\n\n",
                cardHolder, cardNumber, creditLimit, currentDebt, dailyTransactionLimit, transactionCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie danych od użytkownika
        System.out.print("Podaj numer karty: ");
        String cardNumber = scanner.nextLine();

        System.out.print("Podaj imię i nazwisko posiadacza karty: ");
        String cardHolder = scanner.nextLine();

        System.out.print("Podaj maksymalny limit kredytowy: ");
        double creditLimit = scanner.nextDouble();

        System.out.print("Podaj aktualne zadłużenie: ");
        double currentDebt = scanner.nextDouble();

        System.out.print("Podaj dzienny limit transakcji: ");
        int dailyTransactionLimit = scanner.nextInt();

        Main myCard = new Main(cardNumber, cardHolder, creditLimit, currentDebt, dailyTransactionLimit);

        myCard.getCardInfo();

        scanner.close();
    }
}
