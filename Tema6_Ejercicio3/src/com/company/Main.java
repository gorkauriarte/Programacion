package com.company;
import com.company.Persona;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
public class Main {

    private static ArrayList<Persona> listaGente;

    public static void main(String[] args) {
            listaGente = new ArrayList();
            obtenerDatos();
            BuscarPersonaMayorEdad() ;
            BuscarElche() ;
            NumeroDePersonasMayoresDeEdad() ;
    }
    public static void obtenerDatos() {
            do {

                    String nombre = JOptionPane.showInputDialog("Teclea el nombre de la persona");
                    int dNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia de nacimiento de la persona"));
                    int mNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes de nacimiento de la persona"));
                    int aNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año de nacimiento de la persona"));
                    String direccion = JOptionPane.showInputDialog("Teclea la direccion de la persona");
                    String codigoPostal = JOptionPane.showInputDialog("Teclea el codigo postal de la persona");
                    String ciudad = JOptionPane.showInputDialog("Teclea la ciudad de la persona");



                    Persona a = new Persona(nombre, dNacimiento, mNacimiento, aNacimiento, direccion, codigoPostal, ciudad);
                    listaGente.add(a);


            } while (JOptionPane.showConfirmDialog(null, "¿Desea añadir mas alumnos?")==0);

        }

    public static void BuscarPersonaMayorEdad() {

    }

    public static void BuscarElche() {
        int x;
        for (x=0; x < listaGente.size() && !listaGente.get(x).getCiudad().equals("Elche"); x++){}
        if (x == listaGente.size())
            JOptionPane.showMessageDialog(null, "No hay ninguna persona de Elche");
        else
            JOptionPane.showMessageDialog(null, "Personas de Elche: \n" + listaGente.get(x).toString());
    }

    public static void NumeroDePersonasMayoresDeEdad() {
        
    }
}
