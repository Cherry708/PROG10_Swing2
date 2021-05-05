import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio6 {
    private JList lstGeneraciones;
    private JPanel panel1;
    private JButton btnGeneracion6;
    private JButton btnGeneracion7;
    private JLabel lblMensaje;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio6");
        frame.setContentPane(new Ejercicio6().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio6() {
        btnGeneracion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultListModel modelo = new DefaultListModel();
                modelo.addElement("Greeninja");
                modelo.addElement("Sylveon");
                modelo.addElement("Aegislash");
                lstGeneraciones.setModel(modelo);
            }
        });
        btnGeneracion7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultListModel modelo = new DefaultListModel();
                modelo.addElement("Mimikyu");
                modelo.addElement("Rowlet");
                modelo.addElement("Decidueye");
                lstGeneraciones.setModel(modelo);
            }
        });

        lstGeneraciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String mensaje = lstGeneraciones.getSelectedValue().toString();
                lblMensaje.setText(mensaje+"   ");
            }
        });
    }
}
