import javax.swing.*;

public class Datos {

    private float radio;

    public Datos(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getLongitud(){
        return (2 * Math.PI * radio);
    }
    public double getArea(){
        return Math.PI * radio * radio;
    }
    public double getVolumen(){
        return 4 * Math.PI * radio * radio / 3;
    }
}
