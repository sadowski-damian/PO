
public class Main {
    public static void main(String[] args) {
        double myDouble1 = 990.23;
        double myDouble2 = 934738283.24;
        double myDouble3 = -25.62;

        System.out.printf("my Double with + flag is: %+.2f\n", myDouble1);
        System.out.printf("my Double with + flag is: %+.2f\n", myDouble2);
        System.out.printf("my Double with + flag is: %+.2f\n", myDouble3); // Dodaje + przed dodatnimi wartosciami

        System.out.printf("my Double with , flag is: %,.2f\n", myDouble1);
        System.out.printf("my Double with , flag is: %,.2f\n", myDouble2);
        System.out.printf("my Double with , flag is: %,.2f\n", myDouble3); // , sprawia ze tysieczne miesca beda pokazane np 1000000.23 to bedzie 1 000 000.23

        System.out.printf("my Double with ( flag is: %(.2f\n", myDouble1);
        System.out.printf("my Double with ( flag is: %(.2f\n", myDouble2);
        System.out.printf("my Double with ( flag is: %(.2f\n", myDouble3); // Wszystkie ujemne wartosci sa w nawiasach

        System.out.printf("my Double with [space] flag is: % .2f\n", myDouble1);
        System.out.printf("my Double with [space] flag is: % .2f\n", myDouble2);
        System.out.printf("my Double with [space] flag is: % .2f\n", myDouble3); // Ujemne maja minus, dodatnie spacje

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 5670;
        System.out.printf("\nBez niczego %d\n", id1); // Normalnie
        System.out.printf("Bez niczego %d\n", id2);
        System.out.printf("Bez niczego %d\n", id3);
        System.out.printf("Bez niczego %d\n", id4);

        System.out.printf("Z 04 miedzy %04d\n", id1); // 04 dodaje ilosc zer przed, 0 to zero, a liczba obok oznacza do ilu zer ma zostac dopelnione, czyli np dla 3 04 to 0003
        System.out.printf("Z 04 miedzy %04d\n", id2);
        System.out.printf("Z 04 miedzy %04d\n", id3);
        System.out.printf("Z 04 miedzy %04d\n", id4);

        System.out.printf("\nZ liczba %4d\n", id1);
        System.out.printf("Z liczba %4d\n", id2);
        System.out.printf("Z liczba %4d\n", id3);
        System.out.printf("Z liczba %4d\n", id4); // ostatnia wartosc zostanie ustawiona na 4 miejscu czyli np jedna wartosc to 4 - 1, 3 spacje
        // Gdy wpiszemy -4 to sprawi ze bedzie na odwrot czyli po prostu na koncu zostana wstawione spacje -4 to 4 - 1 czyli 4 spacje po liczbie
    }
}
