package Modelo;

import java.util.ArrayList;

public class Empresa {
    private String nombre;

    private ArrayList<Empleado> listaEmpleados;

    private ArrayList<Cliente> listaClientes;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    /*
    public void setEmpleado(Empleado e){
        listaEmpleados.add(e);
    }
    public void setEmpleado(Empleado e){
        listaEmpleados.add(e);
    }
    */

}
