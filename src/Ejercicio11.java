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
    private int numeroPasajeros;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio11");
        frame.setContentPane(new Ejercicio11().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);
    }

    public Ejercicio11() {
        numeroPasajeros = 0;
        txtNumeroPasajeros.setText(String.valueOf(numeroPasajeros));

        btnSubePasajero.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numeroPasajeros++;
                txtNumeroPasajeros.setText(String.valueOf(numeroPasajeros));
                if (numeroPasajeros > 20) {
                    try {
                        throw new Exception();
                    } catch (Exception e){
                        txtNumeroPasajeros.setText("Has alcanzado el aforo máximo.");
                        numeroPasajeros = 21;
                    }
                }
            }
        });
        btnBajaPasajero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numeroPasajeros--;
                txtNumeroPasajeros.setText(String.valueOf(numeroPasajeros));
                if (numeroPasajeros < 0) {
                    try {
                        throw new Exception();
                    } catch (Exception e){
                        txtNumeroPasajeros.setText("El número de pasajeros no puede ser inferior a 0.");
                        numeroPasajeros = 0;
                    }
                }
            }
        });
        btnReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numeroPasajeros = 0;
                txtNumeroPasajeros.setText(String.valueOf(numeroPasajeros));
            }
        });
    }
}
