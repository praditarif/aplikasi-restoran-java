/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplikasi_Restoran_Sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private Connection con;

    public void connect() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/db_restoran";
            String user = "root";
            String password = "";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection success");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            throw e;
        }
    }

    public Connection getCon() {
        return con;
    }
}
