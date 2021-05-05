import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio4 {
    private JList lstHabilidades;
    private JPanel panel1;
    private JLabel lblMensaje;
    private JButton btnEliminarSelecciónButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio4");
        frame.setContentPane(new Ejercicio4().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio4() {
        lstHabilidades.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                String mensaje;
                mensaje = "La/s habilidade/s seleccionada/s es/son: "+lstHabilidades.getSelectedValuesList().toString();
                if (lstHabilidades.isSelectionEmpty()){
                    mensaje = "";
                }
                lblMensaje.setText(mensaje);
            }
        });

        btnEliminarSelecciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String mensaje = "";
                lstHabilidades.clearSelection();
                lblMensaje.setText(mensaje);
            }
        });
    }



}
