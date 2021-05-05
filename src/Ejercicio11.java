import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio11 {
    private JButton btnSubePasajero;
    private JPanel panel1;
    private JButton btnBajaPasajero;
    private JButton btnReiniciar;
    private JLabel lblNumeroPasajeros;
    private JTextField txtNumeroPasajeros;
    private int numeroPasajeros = 0;

    public Ejercicio11() {
        btnSubePasajero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numeroPasajeros++;
            }
        });
    }
}
