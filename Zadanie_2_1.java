import java.util.Scanner;
public class Zadanie_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");

        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Liczba: " +liczba+ "jest parzysta");
        }else{
            System.out.println("Liczba: " +liczba+ "jest nieparzysta");
        }
        scanner.close();
    }
}