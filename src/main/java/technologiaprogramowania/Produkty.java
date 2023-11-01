package technologiaprogramowania;

public class Produkty {
    final private String produkt;
    final private int ilosc;
   final private double cena;

    public Produkty(String produkt, int ilosc, double cena) {
        this.produkt = produkt;
        this.ilosc = ilosc;
        this.cena = cena;
    }

    public double podajCenaNetto() {
        return cena * ilosc;
    }

    public double podajWartoscVAT() {
        return (cena * ilosc) * 0.23;
    }

    @Override
    public String toString() {
        return "Nazwa produktu: " + produkt + ", Ilosc produktu: " + ilosc + ", Cena produktu: " + cena;
    }

}
