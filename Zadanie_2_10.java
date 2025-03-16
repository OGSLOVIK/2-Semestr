import java.util.Random;
import java.util.Scanner;

public class Zadanie_2_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Wybór poziomu trudności
        System.out.println("Wybierz poziom trudności:");
        System.out.println("1. Łatwy (1-50)");
        System.out.println("2. Średni (1-100)");
        System.out.println("3. Trudny (1-200)");
        System.out.print("Wybierz (1/2/3): ");

        int difficulty = scanner.nextInt();
        int maxLiczba = 0;
        int maxProb = 0;

        // Ustawianie zakresu liczb i liczby prób w zależności od poziomu trudności
        switch (difficulty) {
            case 1:
                maxLiczba = 50;
                maxProb = 10; // Łatwy poziom: 10 prób
                break;
            case 2:
                maxLiczba = 100;
                maxProb = 7; // Średni poziom: 7 prób
                break;
            case 3:
                maxLiczba = 200;
                maxProb = 5; // Trudny poziom: 5 prób
                break;
            default:
                System.out.println("Nieprawidłowy wybór! Używam poziomu średniego.");
                maxLiczba = 100;
                maxProb = 7;
        }

        // Losowanie liczby do zgadnięcia
        int liczbaToGuess = random.nextInt(maxLiczba) + 1;
        int pozostaleProby = maxProb;
        boolean guessedCorrectly = false;

        System.out.println("Mam liczbę w zakresie od 1 do " + maxLiczba + ". Masz " + maxProb + " prób, aby ją zgadnąć.");

        while (pozostaleProby > 0 && !guessedCorrectly) {
            System.out.println("\nPozostało prób: " + pozostaleProby);
            System.out.print("Podaj swoją liczbę: ");
            int playerGuess = scanner.nextInt();
            pozostaleProby--;

            if (playerGuess == liczbaToGuess) {
                guessedCorrectly = true;
                System.out.println("Gratulacje! Zgadłeś liczbę.");
            } else if (playerGuess < liczbaToGuess) {
                String difference = getDifferenceMessage(liczbaToGuess - playerGuess);
                System.out.println("Za mało! " + difference);
            } else {
                String difference = getDifferenceMessage(playerGuess - liczbaToGuess);
                System.out.println("Za dużo! " + difference);
            }
        }

        if (!guessedCorrectly) {
            System.out.println("\nNiestety, nie udało się zgadnąć liczby. Poprawna liczba to " + liczbaToGuess);
        }

        scanner.close();
    }

    // Funkcja, która zwraca informację o różnicy
    public static String getDifferenceMessage(int roznica) {
        if (roznica > 50) {
            return "Dużo za " + (roznica > 0 ? "dużo" : "mało");
        } else if (roznica > 20) {
            return "Trochę za " + (roznica > 0 ? "dużo" : "mało");
        } else {
            return "Bardzo blisko!";
        }
    }
}
