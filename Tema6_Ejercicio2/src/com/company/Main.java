package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int respuesta = 0;
    do{
        Alumno nuevoALumno = new Alumno( , , , );
        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea añadir más alumnos?");
    } while (respuesta != 0);
    /*
    Alumno nuevoAlumno = new Alumno();
    nuevoAlumno.setCodigo(JOptionPane.showInputDialog("Tecle el numero del alumno buscado"));
    JOptionPane.showMessageDialog(null, "El codigo del alumno es: " + nuevoAlumno.getCodigo +
                            "\n El nombre del alumno es: " + nuevoAlumno.getNombre +
                            "\n El domicilio del alumno es: " + nuevoAlumno.getDomicilio +
                            "\n El telefono del alumno es: " + nuevoAlumno.getTelefono);
    */
    }
}
