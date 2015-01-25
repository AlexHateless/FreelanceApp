package com.freelance.dao.connection;

import com.freelance.dao.entity.Freelancer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.01.15.
 */
public class ConnectDB {
    private static final String SERVERNAME = "localhost";
    private static final String DATABASE = "FreelanceDB";
    private static final String USERNAME = "hateless";
    private static final String PASSWORD = "825332703";

    public static Connection createConnection() {
        String url = "jdbc:mysql://" + SERVERNAME + "/" + DATABASE;
        try {
            Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            return conn;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = createConnection();
        Statement s = conn.createStatement();
        String sqlQuery = "Select * FROM Freelancer";
        ResultSet rs = s.executeQuery(sqlQuery);
        List<Freelancer> list = new ArrayList();
        while (rs.next()) {
            long id = rs.getLong(1);
            String firstName = rs.getString(2);
            String lastName = rs.getString(3);
            Freelancer f = new Freelancer(id, firstName, lastName);
            System.out.println(f);
        }
        System.out.println("DONE");
    }
}
