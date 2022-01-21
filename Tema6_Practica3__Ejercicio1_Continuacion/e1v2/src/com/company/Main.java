package com.company;

import Modelo.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Excepciones.*;

public class Main {

    // "Base de datos"
    private static ArrayList<Veterinario> listaVeterinarios;
    private static ArrayList<Mascota> listaMascotas;
    private static ArrayList<Cliente> listaClientes;
    private static String nombreVeterinario;
    private static String nombreCliente;

    public static void main(String[] args)
     {
	    try
        {
            guardarDatos();

            crearMenu();
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null,"El programa termina");
        }
        catch(Exception e)
        {
            System.out.println("Problemas: " + e.getClass());
        }
    }

    public static void guardarDatos() throws Exception
    {
        // Solicitar, validar y guardar los datos de los clientes, de las mascotas y de los veterinarios.
        guardarVeterinarios();
        guardarMascotas();

    }

    public static void guardarVeterinarios() throws Exception
    {
        boolean seguir = true;
        listaVeterinarios = new ArrayList<>();
        while(seguir)
        {
            listaVeterinarios.add(new Veterinario(solicitarNombre(),solicitarDireccion(),solicitarTelefono(),solicitarDni(),solicitarNss()));
            int respuesta = JOptionPane.showConfirmDialog(null,"¿Hay más veterinarios?");
            if (respuesta != 0)
                seguir = false;
        }
    }

    public static String solicitarDireccion() throws Exception
    {
        String direccion="";
        boolean error = true;
        while(error)
        {
            try
            {
                direccion = JOptionPane.showInputDialog("Teclea dirección");
                if (direccion.isEmpty())
                    throw new DatoNoValido("La dirección es un campo obligatorio");
                // C/ Portal De Villarreal 19 5A
                Pattern pat = Pattern.compile("^C/ [A-Z][a-z]+([ ][A-Z][a-z]+)* [0-9]{1,3} [0-9][a-zA-Z]$");
                Matcher mat = pat.matcher(direccion);
                if (!mat.matches())
                    throw new DatoNoValido("La dirección no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return direccion;
    }

    public static String solicitarNombre() throws Exception
    {
        nombreVeterinario="";
        boolean error = true;
        while(error)
        {
            try
            {
                nombreVeterinario = JOptionPane.showInputDialog("Teclea el nombre");
                if (nombreVeterinario.isEmpty())
                    throw new DatoNoValido("El nombre es un campo obligatorio");
                Pattern pat = Pattern.compile("^[A-Z][a-z]+([ ][A-Z][a-z]+)*$");
                Matcher mat = pat.matcher(nombreVeterinario);
                if (!mat.matches())
                    throw new DatoNoValido("El nombre no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return nombreVeterinario;
    }

    public static String solicitarTelefono() throws Exception
    {
        String telefono="";
        boolean error = true;
        while(error)
        {
            try
            {
                telefono = JOptionPane.showInputDialog("Teclea el telefono");
                if (telefono.isEmpty())
                    throw new DatoNoValido("El telefono es un campo obligatorio");
                Pattern pat = Pattern.compile("^[6789][0-9]{8}$");
                Matcher mat = pat.matcher(telefono);
                if (!mat.matches())
                    throw new DatoNoValido("El teléfono no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return telefono;
    }

    public static String solicitarDni() throws Exception
    {
        String dni="";
        boolean error = true;
        while(error)
        {
            try
            {
                dni = JOptionPane.showInputDialog("Teclea el dni");
                if (dni.isEmpty())
                    throw new DatoNoValido("El dni es un campo obligatorio");
                Pattern pat = Pattern.compile("^[0-9]{8}[A-Za-z]$");
                Matcher mat = pat.matcher(dni);
                if (!mat.matches())
                    throw new DatoNoValido("El dni no tiene un formato adecuado");
                // Array para validar la letra.
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return dni;
    }

    public static String solicitarNss() throws Exception
    {
        String nss="";
        boolean error = true;
        while(error)
        {
            try
            {
                nss = JOptionPane.showInputDialog("Teclea el número de la seguridad social");
                if (nss.isEmpty())
                    throw new DatoNoValido("El número de la seguridad social es un campo obligatorio");
                // https://cursos.com/blog/numero-seguridad-social/#:~:text=El%20N%C3%BAmero%20de%20la%20Seguridad%20Social%20est%C3%A1%20compuesto%20por%20nueve,%C3%BAltimos%20d%C3%ADgitos%20son%20de%20control.
                Pattern pat = Pattern.compile("^01 [0-9]{8} [0-9]{2}$");
                Matcher mat = pat.matcher(nss);
                if (!mat.matches())
                    throw new DatoNoValido("El número de la seguridad social no tiene un formato adecuado");
                error = false;
                // faltan las validaciones de los dígitos de control
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return nss;
    }



    public static void guardarMascotas() throws Exception
    {
        boolean seguir = true;
        listaMascotas = new ArrayList<>();
        while(seguir)
        {
            listaMascotas.add(new Mascota(solicitarRaza(),solicitarNombreMascota(),solicitarFechaNacimiento(),solicitarPeso(),solicitarSexo(),solicitarLongitud(),solicitarColor(),solicitarClientes(),solicitarVeterinario()));
            int respuesta = JOptionPane.showConfirmDialog(null,"¿Hay más mascotas?");
            if (respuesta != 0)
                seguir = false;
        }
    }

    public static String solicitarRaza() throws Exception
    {
        String raza="";
        boolean error = true;
        while(error)
        {
            try
            {
                raza = JOptionPane.showInputDialog("Teclea la raza");
                if (raza.isEmpty())
                    throw new DatoNoValido("El raza es un campo obligatorio");
                Pattern pat = Pattern.compile("^[A-Z][a-z]+([ ][A-Z][a-z]+)*$");
                Matcher mat = pat.matcher(raza);
                if (!mat.matches())
                    throw new DatoNoValido("La raza no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return raza;
    }

    public static String solicitarNombreMascota() throws Exception
    {
        String nombreMascota="";
        boolean error = true;
        while(error)
        {
            try
            {
                nombreMascota = JOptionPane.showInputDialog("Teclea el nombre");
                if (nombreMascota.isEmpty())
                    throw new DatoNoValido("El nombre es un campo obligatorio");
                Pattern pat = Pattern.compile("^[A-Z][a-z]+([ ][A-Z][a-z]+)*$");
                Matcher mat = pat.matcher(nombreMascota);
                if (!mat.matches())
                    throw new DatoNoValido("El nombre no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return nombreMascota;
    }

    public static LocalDate solicitarFechaNacimiento() throws Exception
    {
        String fechaNacimiento="";
        boolean error = true;
        while(error)
        {
            try
            {
                fechaNacimiento = JOptionPane.showInputDialog("Teclea la fecha de nacimiento");
                if (fechaNacimiento.isEmpty())
                    throw new DatoNoValido("La fecha de nacimiento es un campo obligatorio");
                Pattern pat = Pattern.compile("^[1-31][\\W][0-12][\\W][1990-2021]*$");
                Matcher mat = pat.matcher(fechaNacimiento);
                if (!mat.matches())
                    throw new DatoNoValido("La fecha de nacimiento no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return LocalDate.parse(fechaNacimiento);
    }

    public static float solicitarPeso() throws Exception
    {
        String peso="";
        boolean error = true;
        while(error)
        {
            try
            {
                peso = JOptionPane.showInputDialog("Teclea el peso");
                if (peso.isEmpty())
                    throw new DatoNoValido("El peso es un campo obligatorio");
                Pattern pat = Pattern.compile("^[0-100]$");
                Matcher mat = pat.matcher(peso);
                if (!mat.matches())
                    throw new DatoNoValido("El peso no tiene un formato adecuado");
                // Array para validar la letra.
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return Float.parseFloat(peso);
    }

    public static String solicitarSexo() throws Exception
    {
        String sexo="";
        boolean error = true;
        while(error)
        {
            try
            {
                sexo = JOptionPane.showInputDialog("Teclea el sexo");
                if (sexo.isEmpty())
                    throw new DatoNoValido("El sexo es un campo obligatorio");
                Pattern pat = Pattern.compile("^[M|F]$");
                Matcher mat = pat.matcher(sexo);
                if (!mat.matches())
                    throw new DatoNoValido("El sexo no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return sexo;
    }

    public static float solicitarLongitud() throws Exception
    {
        String longitud="";
        boolean error = true;
        while(error)
        {
            try
            {
                longitud = JOptionPane.showInputDialog("Teclea la longitud");
                if (longitud.isEmpty())
                    throw new DatoNoValido("La longitud es un campo obligatorio");
                Pattern pat = Pattern.compile("^[0-9][\\W][0-100]$");
                Matcher mat = pat.matcher(longitud);
                if (!mat.matches())
                    throw new DatoNoValido("La longitud no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return Float.parseFloat(longitud);
    }

    public static String solicitarColor() throws Exception
    {
        String color="";
        boolean error = true;
        while(error)
        {
            try
            {
                color = JOptionPane.showInputDialog("Teclea el color");
                if (color.isEmpty())
                    throw new DatoNoValido("El color es un campo obligatorio");
                Pattern pat = Pattern.compile("^[A-Z][a-z]*$");
                Matcher mat = pat.matcher(color);
                if (!mat.matches())
                    throw new DatoNoValido("El color no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return color;
    }

    public static Veterinario solicitarVeterinario() throws Exception
    {
        String nombreVeterinarioPedido = " ";
        boolean error = true;
        while(error)
        {
            try
            {
                nombreVeterinarioPedido = JOptionPane.showInputDialog("Teclea el nombre del veterinario");
                if (nombreVeterinarioPedido.isEmpty())
                    throw new DatoNoValido("El color es un campo obligatorio");
                Pattern pat = Pattern.compile("^[A-Z][a-z]+([ ][A-Z][a-z]+)*$");
                Matcher mat = pat.matcher(nombreVeterinarioPedido);
                if (!mat.matches())
                    throw new DatoNoValido("El nombre no tiene un formato adecuado");
                error = false;
                if (nombreVeterinarioPedido != nombreVeterinario)
                    throw new DatoNoValido("El veterinario no existe");
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return nombreVeterinarioPedido;
    }

    public static Cliente solicitarClientes() throws Exception
    {
        nombreCliente = " ";
        boolean error = true;
        while(error)
        {
            try
            {
                nombreCliente = JOptionPane.showInputDialog("Teclea el nombre del cliente");
                if (nombreCliente.isEmpty())
                    throw new DatoNoValido("El cliente es un campo obligatorio");
                Pattern pat = Pattern.compile("^[A-Z][a-z]+([ ][A-Z][a-z]+)*$");
                Matcher mat = pat.matcher(nombreCliente);
                if (!mat.matches())
                    throw new DatoNoValido("El nombre no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return nombreCliente;

        guardarClientes();
    }




    public static void guardarClientes() throws Exception
    {
        boolean seguir = true;
        listaClientes = new ArrayList<>();
        while(seguir)
        {
            listaClientes.add(new Cliente(solicitarNombreCliente(),solicitarDireccionCliente(),solicitarTelefonoCliente()));
            int respuesta = JOptionPane.showConfirmDialog(null,"¿Hay más clientes?");
            if (respuesta != 0)
                seguir = false;
        }
    }

    public static String solicitarNombreCliente() throws Exception
    {
        return nombreCliente;
    }

    public static String solicitarDireccionCliente() throws Exception
    {
        String direccionCliente="";
        boolean error = true;
        while(error)
        {
            try
            {
                direccionCliente = JOptionPane.showInputDialog("Teclea dirección");
                if (direccionCliente.isEmpty())
                    throw new DatoNoValido("La dirección es un campo obligatorio");
                // C/ Portal De Villarreal 19 5A
                Pattern pat = Pattern.compile("^C/ [A-Z][a-z]+([ ][A-Z][a-z]+)* [0-9]{1,3} [0-9][a-zA-Z]$");
                Matcher mat = pat.matcher(direccionCliente);
                if (!mat.matches())
                    throw new DatoNoValido("La dirección no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return direccionCliente;
    }

    public static String solicitarTelefonoCliente() throws Exception
    {
        String telefonoCliente="";
        boolean error = true;
        while(error)
        {
            try
            {
                telefonoCliente = JOptionPane.showInputDialog("Teclea el telefono");
                if (telefonoCliente.isEmpty())
                    throw new DatoNoValido("El telefono es un campo obligatorio");
                Pattern pat = Pattern.compile("^[6789][0-9]{8}$");
                Matcher mat = pat.matcher(telefonoCliente);
                if (!mat.matches())
                    throw new DatoNoValido("El teléfono no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return telefonoCliente;
    }





    public static void crearMenu() throws Exception
    {
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
                    datosMascotaDeUnCliente();
                    break;
                case 5:
                    datosMascotaDeUnVeterinario();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "FINAL");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        } while (opcion != 6);
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
