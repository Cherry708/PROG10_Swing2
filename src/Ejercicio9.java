import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Ejercicio9 {
    private JSlider slNivelSlider;
    private JPanel panel1;
    private JLabel lblMensaje;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio9");
        frame.setContentPane(new Ejercicio9().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setVisible(true);
    }

    public Ejercicio9() {
        slNivelSlider.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                String mensaje = String.valueOf(slNivelSlider.getValue());
                lblMensaje.setText("Cantidad: "+mensaje);

            }
        });
    }
}
