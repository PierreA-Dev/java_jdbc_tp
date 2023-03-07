package epsi.javajdbcTP5;

import java.sql.*;

public class T_Connection {
    private static final String url = "jdbc:mysql://localhost:8080/administration";
    private static final String user = "root";
    private static final String pwd = "";
    public static void main(String[] args) throws SQLException {
        try (Connection cnx = DriverManager.getConnection(url, user, pwd);
             PreparedStatement stmt = cnx.prepareStatement("SELECT * FROM fournisseur")) {
            System.out.println(cnx);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
