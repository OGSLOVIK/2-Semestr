public class Zadanie_2_9 {
    public static void main(String[] args) {
        int num = 5;

        // Wypisanie początkowej wartości zmiennej num
        System.out.println("Wartość zmiennej: " + num);

        // Wywołanie funkcji, która zmienia wartość zmiennej num (prymitywnej)
        changeValue(num);

        // Po wywołaniu funkcji zmienna num w main() nie zmieniła się
        System.out.println("Wartość zmiennej po funkcji: " + num);

        IntegerWrapper number = new IntegerWrapper(5);

        // Wypisanie początkowej wartości obiektu IntegerWrapper (number)
        System.out.println("Wartość przed funkcją: " + number.getValue());

        // Wywołanie funkcji, która zmienia wartość wewnętrzną obiektu
        changeValue(number);

        // Wartość obiektu zmieniła się po wywołaniu funkcji changeValue(), ponieważ zmieniana była właściwość obiektu
        System.out.println("Wartość po funkcji: " + number.getValue());

        // Wywołanie funkcji, która tworzy nowy obiekt i przypisuje go do lokalnej zmiennej
        change(number);

        // Po wywołaniu funkcji change(), obiekt number w main() nie zmienia się, ponieważ zmieniana była tylko lokalna referencja
        System.out.println("Wartość po funkcji: " + number.getValue());
    }

    // Funkcja zmieniająca wartość zmiennej prymitywnej (int)
    public static void changeValue(int num) {
        num = 10;  // Zmieniamy tylko kopię zmiennej
        System.out.println("Wartość zmiennej wewnątrz funkcji: " + num); // Wartość zmiennej num wewnątrz funkcji jest zmieniona, ale to nie wpłynie na oryginalną zmienną w main()
    }

    // Funkcja zmieniająca wartość wewnętrzną obiektu IntegerWrapper
    public static void changeValue(IntegerWrapper num) {
        num.setValue(10);  // Zmieniamy właściwość obiektu, ponieważ przekazujemy referencję do obiektu
    }

    // Funkcja, która przypisuje nowy obiekt do zmiennej num (referencja)
    public static void change(IntegerWrapper num) {
        num = new IntegerWrapper(26);  // Tworzymy nowy obiekt, ale to zmienia tylko lokalną referencję w funkcji
    }
}

// Klasa opakowująca int w obiekcie
class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}