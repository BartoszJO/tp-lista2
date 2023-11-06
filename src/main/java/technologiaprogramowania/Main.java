package technologiaprogramowania;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sklep sprzedawca = new Sklep("Bartosz Olszewski", "ul. Sprzedawcow 15", "987123654");
        Sklep kupujacy = new Sklep("Kupujacy", "Adres kupujacego", "NIP kupujacego");

        Faktura faktura = new Faktura(new Date(), sprzedawca, kupujacy);

        wyswietlMenu();

        int odpowiedz;

        do {
            odpowiedz = scanner.nextInt();

            switch (odpowiedz) {
                case 1:
                    System.out.println("Koszyk: ");
                    for (Produkty produkt : faktura.podajProdukty()) {
                        System.out.println(produkt.toString());
                    }
                    System.out.println("------------------------------------");
                    break;
                case 2:
                    wyswietlAuta();
                    break;
                case 3:
                    System.out.println("Dodawanie nowego samochodu: ");
                    System.out.print("Nazwa: ");
                    scanner.nextLine();
                    String nazwa = scanner.nextLine();
                    System.out.print("Ilość: ");
                    int ilosc = scanner.nextInt();
                    System.out.print("Cena: ");
                    double cena = scanner.nextDouble();
                    Produkty nowyProdukt = new Produkty(nazwa, ilosc, cena);
                    faktura.dodajProdukt(nowyProdukt);
                    System.out.println("Samochód dodany do faktury");
                    break;
                case 4:
                    System.out.println("FAKTURA: ");
                    System.out.println("-------------------");
                    System.out.println("Data: " + faktura.podajDate());
                    System.out.println("--------------------");
                    System.out.println("Dane sprzedawcy: ");
                    System.out.println("-------------------");
                    System.out.println("Imię i nazwisko sprzedawcy: " + sprzedawca.podajDane());
                    System.out.println("Adres sprzedawcy: " + sprzedawca.podajAdres());
                    System.out.println("NIP sprzedawcy: " + sprzedawca.podajNIP());
                    System.out.println("--------------------");
                    System.out.println("Dane kupującego: ");
                    System.out.println("--------------------");
                    System.out.println("Imię i nazwisko kupującego: " + kupujacy.podajDane());
                    System.out.println("Adres kupującego: " + kupujacy.podajAdres());
                    System.out.println("NIP kupującego: " + kupujacy.podajNIP());
                    System.out.println("-------------------");
                    for (Produkty produkt : faktura.podajProdukty()) {
                        System.out.println(produkt.toString());
                    }
                    System.out.println("--------------------");
                    System.out.println("Cena netto: " + faktura.cenaNetto());
                    System.out.println("VAT: " + faktura.wartoscVAT());
                    System.out.println("Cena brutto: " + faktura.CenaKoncowa());
                    System.out.println("--------------------");
                    break;
                case 5:
                    System.out.println("Dodawanie danych kupującego: ");
                    scanner.nextLine();
                    System.out.println("--------------------");
                    System.out.print("Imię i nazwisko kupującego: ");
                    String imieNazwiskoKupujacego = scanner.nextLine();
                    System.out.print("Adres kupującego: ");
                    String adresKupujacego = scanner.nextLine();
                    System.out.print("NIP kupującego: ");
                    String nipKupujacego = scanner.nextLine();
                    kupujacy = new Sklep(imieNazwiskoKupujacego, adresKupujacego, nipKupujacego);
                    System.out.println("Dane kupującego zaktualizowane.");
                    break;
                case 0:
                    System.out.println("Zakończono działanie programu");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie");
            }
        } while (odpowiedz != 0);

        scanner.close();
    }

    public static void wyswietlMenu() {
        System.out.println("------------------------------------");
        System.out.println("Program do wystawiania faktur");
        System.out.println("Copyright Bartosz Olszewski 2023");
        System.out.println("------------------------------------");
        System.out.println("Oto menu: ");
        System.out.println("1 - Pokaż koszyk");
        System.out.println("2 - Dostępne samochody");
        System.out.println("3 - Dodaj samochody");
        System.out.println("4 - Wystaw fakturę");
        System.out.println("5 - Dodaj dane kupującego");
        System.out.println("0 - Wyjście");
    }

    public static void wyswietlAuta() {
        System.out.println("Dostępne auta:");
        System.out.println("------------------------------------");
        System.out.println("BMW:");
        System.out.println("Seria 1, Seria 3, Seria 5, Seria 7");
        System.out.println("X1, X3, X5, X7");
        System.out.println("M3, M4, M5, Z4");
        System.out.println("------------------------------------");
        System.out.println("Audi:");
        System.out.println("A1, A3, A4, A6, A7");
        System.out.println("Q3, Q5, Q7");
        System.out.println("------------------------------------");
        System.out.println("Mercedes:");
        System.out.println("Klasa A, Klasa C, Klasa E, Klasa S");
        System.out.println("GLA, GLB, GLC, GLE, GLS");
        System.out.println("------------------------------------");
    }

}
