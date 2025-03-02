import java.util.Scanner;
public class Zadanie_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe: ");
        int first = scanner.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int second = scanner.nextInt();

        int suma = first+second;

        System.out.println( "Suma twoich liczb to: " + suma);


    }
}