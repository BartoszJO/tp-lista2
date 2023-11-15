package technologiaprogramowania;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BazaDanychMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/nazwa_bazy_danych";
    private static final String USER = "uzytkownik";
    private static final String PASSWORD = "haslo";

    private static final Logger logger = Logger.getLogger(BazaDanychMySQL.class.getName());

    public static void dodajFakture(Faktura faktura) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO faktury (data, sprzedawca, kupujacy, cena_netto, vat, cena_brutto) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setDate(1, new java.sql.Date(faktura.podajDate().getTime()));
                statement.setString(2, faktura.podajDaneSprzedawcy());
                statement.setString(3, faktura.podajDaneKupujacego());
                statement.setDouble(4, faktura.cenaNetto());
                statement.setDouble(5, faktura.wartoscVAT());
                statement.setDouble(6, faktura.CenaKoncowa());

                statement.executeUpdate();

            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Błąd przy dodawaniu faktury do bazy danych", e);
        }
    }
}
