package technologiaprogramowania;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProduktyTest {

    @Test
    public void testPodajCenaNetto() {
        Produkty produkt = new Produkty("Samochód", 2, 1000.0);
        assertEquals(2000.0, produkt.podajCenaNetto(), 0.01);
    }

    @Test
    public void testPodajWartoscVAT() {
        Produkty produkt = new Produkty("Samochód", 2, 1000.0);
        assertEquals(460.0, produkt.podajWartoscVAT(), 0.01);
    }

    @Test
    public void testToString() {
        Produkty produkt = new Produkty("Samochód", 2, 1000.0);
        assertEquals("Nazwa produktu: Samochód, Ilosc produktu: 2, Cena produktu: 1000.0", produkt.toString());
    }
}