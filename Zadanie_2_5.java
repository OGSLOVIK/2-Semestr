import java.util.Scanner;

public class Zadanie_2_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();


        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();


        System.out.print("Podaj operację (+, -, *, /): ");
        char operacja = scanner.next().charAt(0);

        double wynik = 0;
        boolean poprawnaOperacja = true;


        switch (operacja) {
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
                wynik = liczba1 - liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            case '/':
                if (liczba2 != 0) {
                    wynik = liczba1 / liczba2;
                } else {
                    System.out.println("Błąd: dzielenie przez zero!");
                    poprawnaOperacja = false;
                }
                break;
            default:
                System.out.println("Błąd: nieznana operacja!");
                poprawnaOperacja = false;
        }


        if (poprawnaOperacja) {
            System.out.println("Wynik: " + wynik);
        }

        scanner.close();
    }
}
