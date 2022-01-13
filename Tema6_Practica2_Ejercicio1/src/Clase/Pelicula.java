package Clase;

public class Pelicula {
    private String titulo;
    private int año;
    private int duracionPorMinutos;
    private String tipo;

    private Estudio E;

    public Pelicula(String titulo, int año, int duracionPorMinutos, String tipo) {
        this.titulo = titulo;
        this.año = año;
        this.duracionPorMinutos = duracionPorMinutos;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracionPorMinutos() {
        return duracionPorMinutos;
    }

    public void setDuracionPorMinutos(int duracionPorMinutos) {
        this.duracionPorMinutos = duracionPorMinutos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Estudio getE() {
        return E;
    }

    public void setE(Estudio e) {
        E = e;
    }
}
