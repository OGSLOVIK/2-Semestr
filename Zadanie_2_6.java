import java.util.Arrays;
import java.util.Random;

public class Zadanie_2_6 {

    public static void obliczStatystyki(double... liczby) {

        double suma = 0;
        for (double liczba : liczby) {
            suma += liczba;
        }

        double srednia = suma / liczby.length;

        Arrays.sort(liczby);

        double mediana;
        int length = liczby.length;
        if (length % 2 == 0) {
            mediana = (liczby[length / 2 - 1] + liczby[length / 2]) / 2.0;
        } else {
            mediana = liczby[length / 2];
        }

        System.out.println("Wygenerowane liczby:");
        for (double liczba : liczby) {
            System.out.print(liczba + " ");
        }
        System.out.println("\nSuma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Mediana: " + mediana);
    }

    public static void obliczStatystyki(int... liczby) {
        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }

        double srednia = (double) suma / liczby.length;

        Arrays.sort(liczby);

        double mediana;
        int length = liczby.length;
        if (length % 2 == 0) {
            mediana = (liczby[length / 2 - 1] + liczby[length / 2]) / 2.0;
        } else {
            mediana = liczby[length / 2];
        }

        System.out.println("Wygenerowane liczby:");
        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }
        System.out.println("\nSuma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Mediana: " + mediana);
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt(10) + 5;  // Losowanie liczby od 5 do 15
        System.out.println("Dla " + n + " losowych liczb zmiennoprzecinkowych:");

        double[] liczbyZmienne = new double[n];
        for (int i = 0; i < n; i++) {
            liczbyZmienne[i] = rand.nextDouble() * 100;
        }
        obliczStatystyki(liczbyZmienne);

        System.out.println("\nDla " + n + " losowych liczb całkowitych:");

        int[] liczbyCalkowite = new int[n];
        for (int i = 0; i < n; i++) {
            liczbyCalkowite[i] = rand.nextInt(100);  // Liczby całkowite z zakresu [0, 100)
        }
        obliczStatystyki(liczbyCalkowite);
    }
}