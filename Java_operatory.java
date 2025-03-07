public class Main {
    public static void main(String[] args) {
        // Arithmetic operators
        int x = 10;
        int y = 3;
        int z;

        z = x + y;
        System.out.println(z); // dodawanie

        z = x - y;
        System.out.println(z); // odejmowanie

        z = x * y;
        System.out.println(z); // mnozenie

        z = x / y;
        System.out.println(z); // dzielenie calkowite

        z = x % y;
        System.out.println(z); // modulo

        // Augmented Assignment Operators
        // x += y;
        // x -= y;
        // x *= y;
        // x /= y;
        x %= y;
        System.out.println(x);

        // Increment and Decrement Operators
        x = 1;
        // x += 1 <==> x++
        // x -= 1 <==> x--
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        // ORDER OF OPERATIONS (P-E-M-D-A-S) Nawiasy, mnozenie, dzielenie, dodawanie, odejmowanie
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}
