import java.util.Scanner;
    public class Zadanie_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj swoje imie: ");
            String imie = scanner.nextLine();

            System.out.println("Podaj swój wiek: ");
            int wiek = scanner.nextInt();

            System.out.println("Cześć " +imie +"! Masz " +wiek + " lat.");


        }
    }
