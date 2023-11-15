package technologiaprogramowania;

import java.util.ArrayList;
import java.util.Date;

public class Faktura {
    final private Date fakturaData;
    final private Sklep sprzedawca;
    final private Sklep kupujacy;
    final private ArrayList<Produkty> przedmioty = new ArrayList<>();

    public Faktura(Date fakturaData, Sklep sprzedawca, Sklep kupujacy) {
        this.fakturaData = fakturaData;
        this.sprzedawca = sprzedawca;
        this.kupujacy = kupujacy;
    }

    public Date podajDate() {
        return fakturaData;
    }

    public String podajDaneSprzedawcy() {
        return sprzedawca.podajDane();
    }

    public String podajDaneKupujacego() {
        return kupujacy.podajDane();
    }

    public double cenaNetto() {
        double cena_Netto = 0.0;
        for (Produkty produkt : przedmioty) {
            cena_Netto += produkt.podajCenaNetto();
        }
        return cena_Netto;
    }

    public double wartoscVAT() {
        double cenaBrutto = 0.0;
        for (Produkty produkt : przedmioty) {
            cenaBrutto += produkt.podajWartoscVAT();
        }
        return cenaBrutto;
    }

    public double CenaKoncowa() {
       return cenaNetto() + wartoscVAT();
    }

    public void dodajProdukt(Produkty produkt) {
        przedmioty.add(produkt);
    }

    public ArrayList<Produkty> podajProdukty() {
        return przedmioty;
    }

}
