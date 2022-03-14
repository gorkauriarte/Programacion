package Vista;

import com.company.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaSecundaria {


    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton guardarButton;
    private JButton atrasButton;

    public ventanaSecundaria() {
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.irVentanaPrincipal();
            }
        });
    }

    public JPanel getpPrincipal() {
        return panel1;
    }
}
