import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // Wczytywanie poprawnych odpowiedzi z pliku tekstowego do tablicy Poprawne
        String[] Poprawne = new String[30];
        Scanner scanner = new Scanner(new File("klucz.txt"));
        int i = 0;
        while (scanner.hasNext()) {
            Poprawne[i] = scanner.next();
            i++;
        }
        scanner.close();

        BufferedReader reader = new BufferedReader(new FileReader("odpowiedzi.txt"));
        String linia;
        // Przechodzenie przez kazda linię
        while ((linia = reader.readLine()) != null) {
            String[] Linia = linia.split(" ");
            int PoprawneOdpowiedzi = 0;
            int WszystkieOdpowiedzi = 20;
            int j = 2;
            for(i = 0; i < 20; i++){
                if(Linia[j].equals(Poprawne[i])){
                    PoprawneOdpowiedzi++;
                }
                j++;
            }
            Float Procenty = (float) PoprawneOdpowiedzi / WszystkieOdpowiedzi;
            System.out.printf("%s %s %.0f%%\n",Linia[0], Linia[1], Procenty*100);
        }
        reader.close();
    }
}
