package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static ArrayList<Float> arrayListCreada;

    public static void main(String[] args) {
        arrayListCreada = new ArrayList<Float>();
        llenarArray();
        mostrarMenu();
    }

    public static void llenarArray() {
        String respuesta = "";
        for (int x = 0; !Objects.equals(respuesta, "n"); x++) {
            arrayListCreada.add (x, Float.valueOf(JOptionPane.showInputDialog("Introduce un numero para el arraylist")));
            respuesta = JOptionPane.showInputDialog("¿Desea continuar? s / n");
        }
    }

    public static void mostrarMenu() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?" +
                    "\n 1) Visualizar maximo y mínimo." +
                    "\n 2) Buscar un numero." +
                    "\n 3) Borrar un numero." +
                    "\n 4) Convertir en un array." +
                    "\n 5) Mostrar el numero de elementos que contiene." +
                    "\n 6) Insertar un nuevo elemento por el final." +
                    "\n 7) Insertar un nuevo elemento en la posicion que te indique el usuario." +
                    "\n 8) Borrar un elemento de una posicion concreta." +
                    "\n 9) Calcular la suma y la media aritmetica de los valores contenidos." +
                    "\n 10) Finalizar."));
            switch (opcion) {
                case 1:
                    Accion1();
                    break;
                case 2:
                    Accion2();
                    break;
                case 3:
                    Accion3();
                    break;
                case 4:
                    Accion4();
                    break;
                case 5:
                    Accion5();
                    break;
                case 6:
                    Accion6();
                    break;
                case 7:
                    Accion7();
                    break;
                case 8:
                    Accion8();
                    break;
                case 9:
                    Accion9();
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Has finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No has escrito un número correcto");
            }
        } while(opcion != 10);
    }

    public static void Accion1() {
        double maximo = arrayListCreada.get(0);
        int posicionMaximo = 0;
        double minimo =arrayListCreada.get(0);
        int posicionMinimo = 0;

        for (int x = 1; x < arrayListCreada.size(); x++) {
            if (arrayListCreada.get(x) > maximo) {
                maximo = arrayListCreada.get(x);
                posicionMaximo = x;
            }
            else
            if (arrayListCreada.get(x) < minimo) {
                minimo = arrayListCreada.get(x);
                posicionMaximo = x;
            }
        }
        JOptionPane.showMessageDialog(null, "El maximo es " + maximo + " que esta en la posicion " + posicionMaximo + " y el menor es " + minimo + " que esta en la posicion " + posicionMinimo);
    }

    public static void Accion2() {
        Float numeroBuscado = Float.parseFloat(JOptionPane.showInputDialog("Teclea el numero que desees buscar"));
        boolean trueFalse = arrayListCreada.contains(numeroBuscado);
        if (trueFalse == true){
            JOptionPane.showMessageDialog(null, "El numero se ha encontrado");
        }
        if (trueFalse == false) {
            JOptionPane.showMessageDialog(null, "El numero no se ha encontrado");
        }
    }

    public static void Accion3() {
        Float numeroBuscado = Float.parseFloat(JOptionPane.showInputDialog("Teclea el numero que desees buscar para eliminar"));
        boolean trueFalse = arrayListCreada.contains(numeroBuscado);
        if (trueFalse == true){
            arrayListCreada.remove(numeroBuscado);
            JOptionPane.showMessageDialog(null, "El numero se ha borrado");
        }
        if (trueFalse == false) {
            JOptionPane.showMessageDialog(null, "El numero no se ha encontrado");
        }
    }

    public static void Accion4() {
        Double[] array;
        array = arrayListCreada.toArray(new Double[arrayListCreada.size()]);
    }

    public static void Accion5() {
        JOptionPane.showMessageDialog(null, "Tiene " + arrayListCreada.size() + " elementos");
    }

    public static void Accion6() {
        arrayListCreada.add (Float.valueOf(JOptionPane.showInputDialog("Introduce el numero que deseas añadir")));
    }

    public static void Accion7() {
        float numeroEnElQueAñadir = Float.parseFloat(JOptionPane.showInputDialog("Tecleaen que posicion deseas añadirlo"));
        arrayListCreada.add (numeroEnElQueAñadir = Float.parseFloat(JOptionPane.showInputDialog("Teclea el numero que deseas añadir")));
    }

    public static void Accion8() {
        Float posicionBorrar = Float.valueOf(JOptionPane.showInputDialog("Teclea la posicion que deseas borrar"));
        arrayListCreada.remove(posicionBorrar);
    }

    public static void Accion9() {

    }

}