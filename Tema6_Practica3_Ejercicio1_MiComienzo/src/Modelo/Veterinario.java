package Modelo;

public class Veterinario extends Persona{
    private String dni;
    private String numeroSeguridadSocial;


    public Veterinario(String nombre, String direccion, String telefono, String dni, String numeroSeguridadSocial) {
        super(nombre, direccion, telefono);
        this.dni = dni;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
