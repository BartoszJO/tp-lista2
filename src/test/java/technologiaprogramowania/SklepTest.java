package technologiaprogramowania;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SklepTest {

    @Test
    public void testPodajDane() {
        Sklep sklep = new Sklep("Nazwa", "Adres", "NIP");
        assertEquals("Nazwa", sklep.podajDane());
    }

    @Test
    public void testPodajAdres() {
        Sklep sklep = new Sklep("Nazwa", "Adres", "NIP");
        assertEquals("Adres", sklep.podajAdres());
    }

    @Test
    public void testPodajNIP() {
        Sklep sklep = new Sklep("Nazwa", "Adres", "NIP");
        assertEquals("NIP", sklep.podajNIP());
    }
}

