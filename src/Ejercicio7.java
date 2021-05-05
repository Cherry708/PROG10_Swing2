import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio7 {
    private JList lstGeneraciones;
    private JPanel panel1;
    private JButton btnGeneracion6;
    private JButton btnGeneracion7;
    private JLabel lblMensaje;
    private JButton btnVaciar;

    public Ejercicio7() {
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
                super.mouseClicked(e);
                String mensaje = lstGeneraciones.getSelectedValue().toString();
                lblMensaje.setText(mensaje+"   ");
            }
        });
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String mensaje;
                mensaje = "";
                DefaultListModel modelo = new DefaultListModel();
                lstGeneraciones.setModel(modelo);
                lblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio7");
        frame.setContentPane(new Ejercicio7().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}

