package com.company;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import Vista.*;

public class Main {

    private static JFrame v1, v2;

    public static void main(String[] args) {
	// write your code here
        try {
            // 1. Cargar el controlador de acceso a datos
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Conectarse a la base de datos
            String url = "jdbc:mysql://localhost:3306/ejercicio2";
            String user = "root";
            String passwd = "usbw";
            Connection con = DriverManager.getConnection (url , user , passwd);

            // 3. Construir comandos SQL
            Statement sentencia = con. createStatement ();

        }
        catch( Exception e)
        {
            System.out.println(" Problemas con la base de datos " + e. getMessage ());
        }


        mostrarVentana();

    }
    public static void mostrarVentana() {
        v1 = new JFrame("Ventana");
        v1.setContentPane(new ventanaPrincipal().getpPrincipal());
        v1.setSize(500, 700);
        v1.setLocationRelativeTo(null);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.pack();
        v1.setVisible(true);
    }

    public static void irVentanaSecundaria() {
        v2 = new JFrame("Ventana");
        v2.setContentPane(new ventanaSecundaria().getpPrincipal());
        v2.setSize(500, 700);
        v2.setLocationRelativeTo(null);
        v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v2.pack();
        v2.setVisible(true);

        v1.setVisible(false);
    }
    public static void irVentanaPrincipal() {
        v1 = new JFrame("Ventana");
        v1.setContentPane(new ventanaPrincipal().getpPrincipal());
        v1.setSize(500, 700);
        v1.setLocationRelativeTo(null);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.pack();
        v1.setVisible(true);

        v2.setVisible(false);
    }

}
