import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio8 {
    private JComboBox cmbNumeros;
    private JPanel panel1;
    private JButton btnPares;
    private JButton btnImpares;
    private JLabel lblMensaje;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio8");
        frame.setContentPane(new Ejercicio8().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio8() {
        btnPares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Número 0");
                modelo.addElement("Número 2");
                modelo.addElement("Número 4");
                modelo.addElement("Número 6");
                modelo.addElement("Número 8");
                cmbNumeros.setModel(modelo);
                String mensaje = cmbNumeros.getSelectedItem().toString();
                lblMensaje.setText(mensaje);
            }
        });
        btnImpares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Número 1");
                modelo.addElement("Número 3");
                modelo.addElement("Número 5");
                modelo.addElement("Número 7");
                modelo.addElement("Número 9");
                cmbNumeros.setModel(modelo);
                String mensaje = cmbNumeros.getSelectedItem().toString();
                lblMensaje.setText(mensaje);
            }
        });

        /*
        No funciona como las listas, no vale con un mouse listener.
         */
        cmbNumeros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String mensaje = cmbNumeros.getSelectedItem().toString();
                lblMensaje.setText(mensaje);
            }
        });
    }
}
