package com.company;

import javax.swing.*;
import java.text.DecimalFormat;
import Datos.*;

public class Main {

    public static void main(String[] args) {

        float r = Float.parseFloat(JOptionPane.showInputDialog("Teclea el radio"));
        Datos d = new Datos();
        d.getRadio(r);

        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(df.format(d.getLongitud()) + df.format(d.getArea()) + df.format(d.getVolumen()));
    }
}
