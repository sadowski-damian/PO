import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if(this.numerator == 0){
            this.denominator = 1;
        }
        if(this.denominator == 0){
            System.out.println("Mianownik nie moze byc rowny 0");
        }
        if(this.denominator < 0 && this.numerator < 0){
            this.denominator = this.denominator*(-1);
            this.numerator = this.numerator*(-1);
        }
    }

    public Fraction add(Fraction other){
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other){
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction multiply(Fraction other){
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other){
        int temp = this.numerator;
        this.numerator = other.denominator;
        other.denominator = temp;
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public boolean equals(Fraction other){
        boolean isIt;
        double left = (double)(this.numerator/this.denominator);
        double right = (double)(other.numerator/other.denominator);
        if(left == right){
            isIt = true;
        }
        else{
            isIt = false;
        }
        return isIt;
    }

    public boolean isLessThan(Fraction other){
        boolean isIt;
        double left = (double)(this.numerator/this.denominator);
        double right = (double)(other.numerator/other.denominator);
        if(left < right){
            isIt = true;
        }
        else{
            isIt = false;
        }
        return isIt;
    }

    public boolean isGreaterThan(Fraction other){
        boolean isIt;
        double left = (double)(this.numerator/this.denominator);
        double right = (double)(other.numerator/other.denominator);
        if(left > right){
            isIt = true;
        }
        else{
            isIt = false;
        }
        return isIt;
    }

    public boolean isLessThanOrEqual(Fraction other){
        boolean isIt;
        double left = (double)(this.numerator/this.denominator);
        double right = (double)(other.numerator/other.denominator);
        if(left <= right){
            isIt = true;
        }
        else{
            isIt = false;
        }
        return isIt;
    }

    public boolean isGreaterThanOrEqual(Fraction other){
        boolean isIt;
        double left = (double)(this.numerator/this.denominator);
        double right = (double)(other.numerator/other.denominator);
        if(left >= right){
            isIt = true;
        }
        else{
            isIt = false;
        }
        return isIt;
    }
    /*
    public String toString(){
        String frytka = "xd";
        return frytka;
    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pierwszy ulamek ");
        System.out.println("Podaj licznik: ");
        int licznik1 = scanner.nextInt();
        int mianownik1;
        do{
            System.out.println("Podaj Mianownik: ");
            mianownik1 = scanner.nextInt();
            if(mianownik1==0){
                System.out.println("Blad, nie mozna dzielic przez 0");
            }
        }while(mianownik1==0);

        System.out.println("Drugi ułamek ");
        System.out.println("Podaj licznik: ");
        int licznik2 = scanner.nextInt();
        int mianownik2;
        do{
            System.out.println("Podaj Mianownik: ");
            mianownik2 = scanner.nextInt();
            if(mianownik2==0){
                System.out.println("Blad, nie mozna dzielic przez 0");
            }
        }while(mianownik2==0);
        
        Fraction a = new Fraction(licznik1, mianownik1);
        Fraction b = new Fraction(licznik2, mianownik2);

        Fraction sum = a.add(b);
        System.out.println("Suma dod: " + sum.numerator + "/" + sum.denominator + "\n");

        sum = a.subtract(b);
        System.out.println("Suma odej: " + sum.numerator + "/" + sum.denominator + "\n");

        sum = a.multiply(b);
        System.out.println("Suma mnoz: " + sum.numerator + "/" + sum.denominator + "\n");

        sum = a.divide(b);
        System.out.println("Suma dziel: " + sum.numerator + "/" + sum.denominator + "\n");

        boolean isIt;
        isIt = a.equals(b);
        System.out.println(" is equ: " + isIt);

        isIt = a.isLessThan(b);
        System.out.println("is less: " + isIt);

        isIt = a.isLessThanOrEqual(b);
        System.out.println("is less or eq: " + isIt);

        isIt = a.isGreaterThan(b);
        System.out.println("is great: " + isIt);

        isIt = a.isGreaterThanOrEqual(b);
        System.out.println("is grea or eq: " + isIt);

        scanner.close();
    }
}