/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Zerbex
 */
public class conectar {

    Connection conect = null;

    public Connection conexion() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/taller_guzman", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return conect;

    }

}
