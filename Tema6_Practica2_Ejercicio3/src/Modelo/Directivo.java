package Modelo;

import java.util.ArrayList;

public class Directivo extends Empleado{
    private String categoria;



    private ArrayList<Empleado> listaEmpleados;


    public Directivo(String nombre, int edad, int sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public String mostrar(){
        return super.mostrar() + " " + this.getCategoria();
    }
}
