package Modelo;

public class Empleado extends Persona{
    private int sueldoBruto;


    public Empleado(String nombre, int edad, int sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String mostrar(){
        return this.getNombre() + " " + this.getEdad() + " " + this.getSueldoBruto();
    }

    public Double calcularSalarioNeto(){
        return null;
    }
}
