package Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;

public class ventanaPrincipal {
    private JPanel panel1;
    private JComboBox comboBox1;

    public ventanaPrincipal() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.irVentanaSecundaria();
            }
        });
        comboBox1.addContainerListener(new ContainerAdapter() {
        });
    }

    public JPanel getpPrincipal() {
        return panel1;
    }


}
