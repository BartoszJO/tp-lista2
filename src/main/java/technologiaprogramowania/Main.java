package technologiaprogramowania;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sklep sprzedawca = new Sklep("Bartosz Olszewski", "ul. Sprzedawcy", "NIP sprzedawcy");
        Sklep kupujacy = new Sklep("Kupujacy", "Adres kupujacego", "NIP kupujacego");

        Faktura faktura = new Faktura(new Date(), sprzedawca, kupujacy);

        System.out.println("Program do wystawiania faktur");
        System.out.println("Copyright Bartosz Olszewski 2023");

        Scanner scanner = new Scanner(System.in);
        int odpowiedz;

        do {
            System.out.println("Oto menu: ");
            System.out.println("1 - Pokaż koszyk");
            System.out.println("2 - Dodaj samochody");
            System.out.println("3 - Wystaw fakture");
            System.out.println("4 - Dostepne samochody");
            System.out.println("0 - Wyjscie");

            odpowiedz = scanner.nextInt();

            switch (odpowiedz) {
                case 1:
                    System.out.println("Koszyk: ");
                    for (Produkty produkt : faktura.podajProdukty()) {
                        System.out.println(produkt.toString());
                    }
                    System.out.println("------------------------------------");
                    break;
                case 4:
                    System.out.println("Dostepne auta:");
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
                    break;
                case 2:
                    System.out.println("Dodawanie nowego samochodu: ");
                    System.out.print("Nazwa: ");
                    String nazwa = scanner.next();
                    System.out.print("Ilosc: ");
                    int ilosc = scanner.nextInt();
                    System.out.print("Cena: ");
                    double cena = scanner.nextDouble();
                    Produkty nowyProdukt = new Produkty(nazwa, ilosc, cena);
                    faktura.dodajProdukt(nowyProdukt);
                    System.out.println("Samochod dodany do faktury");
                    break;
                case 3:
                    System.out.println("FAKTURA: ");
                    System.out.println("-------------------");
                    System.out.println("Data: " + faktura.podajDate());
                    System.out.println("Dane sprzedawcy: ");
                    System.out.println("-------------------");
                    System.out.println("Imie i nazwisko: " + sprzedawca.podajDane());
                    System.out.println("Adres: " + sprzedawca.podajAdres());
                    System.out.println("NIP sprzedawcy: " + sprzedawca.podajNIP());
                    System.out.println("-------------------");
                    System.out.println("NIP kupujacego: " + kupujacy.podajNIP());
                    System.out.println("-------------------");
                    System.out.println("Cena netto: " + faktura.cenaNetto());
                    System.out.println("VAT: " + faktura.wartoscVAT());
                    System.out.println("Cena brutto: " + faktura.CenaKoncowa());
                    break;
                case 0:
                    System.out.println("Zakonczono dzialanie programu");
                    break;
                default:
                    System.out.println("Nieprawidlowy wybor. Sprobuj ponownie");

            }
        } while (odpowiedz != 0);
    }
}