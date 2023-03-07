package epsi.javajdbcTP5;

import epsi.javajdbcTP5.bo.Fournisseur;
import epsi.javajdbcTP5.dal.FournisseurDaoJdbc;

import java.sql.*;
import java.util.ResourceBundle;

public class Update {
    private static final String url;
    private static final String user;
    private static final String pwd;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        url = bundle.getString("db.url");
        user = bundle.getString("db.login");
        pwd = bundle.getString("db.password");
    }

    public static void main(String[] args) throws SQLException {
        try {
            Fournisseur f8 = new Fournisseur(8, "f8");
            FournisseurDaoJdbc FDJ = new FournisseurDaoJdbc();
            FDJ.update("Dubois & Fils", "L''espace création");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}