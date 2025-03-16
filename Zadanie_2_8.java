import java.util.Scanner;

public class Zadanie_2_8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kontynuuj = true;

        while(kontynuuj){
            System.out.println("Dostępne bilety:");
            System.out.println("1. Bilet normalny - 3.50 PLN");
            System.out.println("2. Bilet ulgowy - 2.00 PLN");
            System.out.println("3. Bilet miesięczny - 50.00 PLN");
            System.out.print("Wybierz rodzaj biletu (1/2/3): ");

            int wybor = scanner.nextInt();
            double choice = 0.0;

            switch (wybor) {
                case 1:
                    choice = 3.50;
                    System.out.println("Wybrałeś bilet normalny. Cena: " + choice + " PLN");
                    break;
                case 2:
                    choice = 2.00;
                    System.out.println("Wybrałeś bilet ulgowy. Cena: " + choice + " PLN");
                    break;
                case 3:
                    choice = 50.00;
                    System.out.println("Wybrałeś bilet miesięczny. Cena: " + choice + " PLN");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Program zakończy się.");
                    scanner.close();
                    return;
            }
            System.out.println("Czy chcesz kupić jeszcze jeden bilet?");
            String answer = scanner.next().toLowerCase();
            if(answer.equals("nie")){
                kontynuuj = false;
            }
        }

        System.out.println("Dziękujemy za zakupy!");
        scanner.close();
    }
}
