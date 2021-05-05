import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3 {
    private JList lstHabilidades;
    private JPanel panel1;
    private JButton btnAceptar;
    private JLabel lblMensaje;
    private JButton btnEliminarSeleccion;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio3");
        frame.setContentPane(new Ejercicio3().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio3() {

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String mensaje;
                mensaje = "La/s habilidade/s seleccionada/s es/son: "+lstHabilidades.getSelectedValuesList().toString();
                if (lstHabilidades.isSelectionEmpty()){
                    mensaje = "";
                }
                lblMensaje.setText(mensaje);

            }
        });
        btnEliminarSeleccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String mensaje = "";
                lstHabilidades.clearSelection();
                lblMensaje.setText(mensaje);
            }
        });
    }
}
