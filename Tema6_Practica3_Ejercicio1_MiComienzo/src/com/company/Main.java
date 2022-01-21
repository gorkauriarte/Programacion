package com.company;

import Excepciones.*;
import Modelo.*;
import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Veterinario> listaVeterinario;


    private static Cliente[] listaClientes;
    private static Veterinario[] listaVeterinarios;
    private static Mascota[] listaMascotas;

    public static void main(String[] args) {
	// write your code here
        try
        {
            meterDatos();
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null, "El programa termina");
        }

        int opcion;
        do {
            opcion =
                    Integer.parseInt(JOptionPane.showInputDialog("Teclea la opcion que desees: \n"
                    + "1) Numero de clientes con un animal concreto. \n"
                    + "2) Datos personales del cliente a partir del nombre de mascota \n"
                    + "3) Datos del veterinario a partir de los datos de una mascota \n"
                    + "4) Datos de las mascotas de un cliente \n"
                    + "5) Datos de las mascotas de un veterinario. \n"
                    + "6) Terminar"));
            switch (opcion) {
                case 1:
                    numClientesConAnimalConcreto();
                    break;
                case 2:
                    datosClienteConNombreMascota();
                    break;
                case 3:
                    datosVeterinarioConDatosMascota();
                    break;
                case 4:
                    datosMascotaDeUnCliente() ;
                    break;
                case 5:
                    datosMascotaDeUnVeterinario() ;
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"FINAL");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion no valida");
                    break;
            }
        }
        while (opcion != 6);
    }

    public static void meterDatos() {
        /*
        boolean seguir = true;
        listaVeterinarios = new ArrayList<>();
        while(seguir)
        {
            listaVeterinarios.add(solicitarNombre(),solicitarDireccion(),)
        }
        */


        listaClientes = new Cliente[5];

        listaClientes[0] = new Cliente("Andoni", "Calle1", "111111111");
        listaClientes[1] = new Cliente("Martin", "Calle2", "222222222");
        listaClientes[2] = new Cliente("Urko", "Calle3", "333333333");
        listaClientes[3] = new Cliente("Ander", "Calle4", "444444444");
        listaClientes[4] = new Cliente("Pablo", "Calle5", "555555555");

        listaVeterinarios = new Veterinario[5];

        listaVeterinarios[0] = new Veterinario("Eduardo", "Calle6", "666666666", "11111111A", "11111");
        listaVeterinarios[1] = new Veterinario("Markel", "Calle7", "777777777", "22222222B", "22222");
        listaVeterinarios[2] = new Veterinario("Eder", "Calle8", "888888888", "33333333C", "33333");
        listaVeterinarios[3] = new Veterinario("Amets", "Calle9", "999999999", "44444444D", "44444");
        listaVeterinarios[4] = new Veterinario("Unai", "Calle10", "111111222", "55555555E", "55555");

        listaMascotas = new Mascota[5];

        listaMascotas[0] = new Mascota("perro","pastor aleman","Jokin","16/02/2012","Masculino",38,0.58, "rizado");
        listaMascotas[1] = new Mascota("perro","bulldog","Kiko","22/04/2013","Masculino",24,0.47, "liso");
        listaMascotas[2] = new Mascota("perro","pastor belga","Rodri","12/12/2015","Femenino",32,0.54, "rizado");
        listaMascotas[3] = new Mascota("gato","persa","Jon","29/06/2012","Femenino",15,0.23, "rizado");
        listaMascotas[4] = new Mascota("gato","siames","Pablo","02/01/2018","Masculino",27,0.28, "liso");

    }



    public static void numClientesConAnimalConcreto() {

    }
    public static void datosClienteConNombreMascota() {

    }
    public static void datosVeterinarioConDatosMascota() {

    }
    public static void datosMascotaDeUnCliente() {

    }
    public static void datosMascotaDeUnVeterinario() {

    }

}

