
public class Main {
    public static void main(String[] args) {
        String name = "Damian Dadowski";
        int length = name.length(); // Dlugosc stringa (wraz ze spacjami)
        char letter = name.charAt(0); // Jaki znak jest na miejscu o indeksie 0
        int index = name.indexOf("Dad"); // Pierwsze wystapienie slowa
        int lastIndex = name.lastIndexOf("a"); // Ostatnie wystpaienie slowa
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        name = name.toUpperCase(); // Zamienia wszystko na duze znaki
        System.out.println(name);
        name = name.toLowerCase(); // Zamienia wszystko na male znaki
        System.out.println(name);

        name = "    Damian Sadowski   ";
        System.out.println(name);
        name = name.trim(); // Usuwa spacje w konca i poczatku
        System.out.println(name);

        name = name.replace("a", "o"); // Zamienia wszystkie wystapienia a na o
        System.out.println(name);

        boolean czyPusty = name.isEmpty(); // Zwraca true jezeli napis jest pusty, flase jezeli nie jest
        System.out.println(czyPusty);

        boolean czyZawiera = name.contains("D"); // Sprawdza czy ciag znakow zawiera podana litere, tylko jedna, nie dziala na ciag znakow. Jezeli zawiera zwraca true, jezeli nie to false.
        System.out.println(czyZawiera);

        String secondName = "Damian Dadowski";
        boolean czyTakieSame = name.equals(secondName);
        System.out.println(czyTakieSame);

        secondName = "Damian Sadowski";
        name = "Damian Sadowski";
        czyTakieSame = name.equals(secondName);
        System.out.println(czyTakieSame);

        secondName = "damian Sadowski";  // Zwraca uwage na wielkosc liter, Damian i damian to dwa rozne slowa
        name = "Damian Sadowski";
        czyTakieSame = name.equals(secondName);
        System.out.println(czyTakieSame);

        secondName = "damian Sadowski";  // Aby nie zwracalo uwagi na wielkosc liter musimy uzyc .equalsIgnoreCase
        name = "Damian Sadowski";
        czyTakieSame = name.equalsIgnoreCase(secondName);
        System.out.println(czyTakieSame);

        czyTakieSame = name.equals("Damian xd");
        System.out.println(czyTakieSame);
    }
}
