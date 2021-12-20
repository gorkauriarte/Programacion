package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private int dNacimiento;
    private int mNacimiento;
    private int aNacimiento;
    private String direccion;
    private String codigoPostal;
    private String ciudad;

    public Persona(String nombre, int dNacimiento, int mNacimiento, int aNacimiento, String direccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int calcularEdad(){
        LocalDate fechaNac = LocalDate.of(dNacimiento, mNacimiento, aNacimiento);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }

    public boolean esMayorDeEdad(){
        return this.calcularEdad() >= 18;
    }



    public String toString() {
        return "Persona{ \n" + "Nombre= " + nombre +
                "\nDia de nacimiento= " + dNacimiento +
                "\nMes de nacimiento= " + mNacimiento +
                "\nAño de nacimiento= "+ aNacimiento +
                "\nDireccion= " + direccion +
                "\nCodigo postal= " + codigoPostal +
                "\nCiudad= "+ ciudad + "\n }";
    }

}
