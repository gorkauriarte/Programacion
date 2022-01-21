package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import Modelo.*;

import javax.swing.*;

public class Main {

    private static Persona[] listaPersonas;
    private static Empleado[] listaEmpleados;
    private static Cliente[] listaClientes;
    private static Directivo[] listaDirectivos;
    private static Empresa[] listaEmpresas;

    public static void main(String[] args) {
	// write your code here
        try{

            meterDatos();
            buscarDirectivoConMasSubordinados();

        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,e.getClass());
        }
    }

    public static void meterDatos() throws Exception{
        listaPersonas = new Persona[5];

        listaPersonas[0] = new Persona("Juan", 22);
        listaPersonas[1] = new Persona("Pedro", 29);
        listaPersonas[2] = new Persona("Aritz", 18);
        listaPersonas[3] = new Persona("Leo", 31);
        listaPersonas[4] = new Persona("Michael", 26);

        listaEmpleados = new Empleado[5];

        listaEmpleados[0] = new Empleado("Jon", 21, 2000);
        listaEmpleados[1] = new Empleado("Mikel", 41, 3000);
        listaEmpleados[2] = new Empleado("Paco", 19, 1900);
        listaEmpleados[3] = new Empleado("Ager", 28, 1500);
        listaEmpleados[4] = new Empleado("Daniel", 24, 2200);

        listaClientes = new Cliente[5];

        listaClientes[0] = new Cliente("Andoni", 21, "111111111");
        listaClientes[1] = new Cliente("Martin", 41, "222222222");
        listaClientes[2] = new Cliente("Urko", 19, "333333333");
        listaClientes[3] = new Cliente("Ander", 28, "444444444");
        listaClientes[4] = new Cliente("Pablo", 24, "555555555");

        listaDirectivos = new Directivo[5];

        listaDirectivos[0] = new Directivo("Eduardo", 37, 2100, "Categoria1");
        listaDirectivos[1] = new Directivo("Markel", 34, 2400, "Categoria3");
        listaDirectivos[2] = new Directivo("Eder", 49, 1700, "Categoria1");
        listaDirectivos[3] = new Directivo("Amets", 28, 1500, "Categoria2");
        listaDirectivos[4] = new Directivo("Unai", 32, 2200, "Categoria3");

        Empresa [] listaEmpresas = new Empresa[5];

        listaEmpresas[0] = new Empresa("Empresa1");
        listaEmpresas[1] = new Empresa("Empresa2");
        listaEmpresas[2] = new Empresa("Empresa3");
        listaEmpresas[3] = new Empresa("Empresa4");
        listaEmpresas[4] = new Empresa("Empresa5");

    }

    public static void buscarDirectivoConMasSubordinados() throws Exception {

    }
}
