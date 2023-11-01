package technologiaprogramowania;

public class Sklep {
    final private String nazwa;
    final private String adres;
    final private String nip;

    public Sklep(String nazwa, String adres, String nip) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.nip = nip;
    }

    public String podajDane() {
        return nazwa;
    }

    public String podajAdres() {
        return adres;
    }

    public String podajNIP() {
        return nip;
    }

}
