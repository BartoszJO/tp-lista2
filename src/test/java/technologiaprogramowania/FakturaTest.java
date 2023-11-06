package technologiaprogramowania;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class FakturaTest {

    @Test
    public void testCenaNetto() {
        Faktura faktura = new Faktura(new Date(), new Sklep("Sprzedawca", "Adres", "NIP"), new Sklep("Kupujący", "Adres kupującego", "NIP kupującego"));
        faktura.dodajProdukt(new Produkty("Samochód", 1, 1000.0));
        assertEquals(1000.0, faktura.cenaNetto(), 0.01);
    }

    @Test
    public void testWartoscVAT() {
        Faktura faktura = new Faktura(new Date(), new Sklep("Sprzedawca", "Adres", "NIP"), new Sklep("Kupujący", "Adres kupującego", "NIP kupującego"));
        faktura.dodajProdukt(new Produkty("Samochód", 1, 1000.0));
        assertEquals(230.0, faktura.wartoscVAT(), 0.01);
    }

    @Test
    public void testCenaKoncowa() {
        Faktura faktura = new Faktura(new Date(), new Sklep("Sprzedawca", "Adres", "NIP"), new Sklep("Kupujący", "Adres kupującego", "NIP kupującego"));
        faktura.dodajProdukt(new Produkty("Samochód", 1, 1000.0));
        assertEquals(1230.0, faktura.CenaKoncowa(), 0.01);
    }
}

