package Clase;
import java.util.ArrayList;
public class Estudio {
    private String nombre;
    private String ciudad;
    private String direccion;
    private String direccionWeb;
    private String fechaDeFundacion;
    private String pais;
    private String numeroDeTelefono;


    private ArrayList <Pelicula> listaPeliculas;


    public Estudio(String nombre, String ciudad, String direccion, String direccionWeb, String fechaDeFundacion, String pais, String numeroDeTelefono, Pelicula listaPeliculas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.direccionWeb = direccionWeb;
        this.fechaDeFundacion = fechaDeFundacion;
        this.pais = pais;
        this.numeroDeTelefono = numeroDeTelefono;
        this.listaPeliculas = listaPeliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionWeb() {
        return direccionWeb;
    }

    public void setDireccionWeb(String direccionWeb) {
        this.direccionWeb = direccionWeb;
    }

    public String getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(String fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
