import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio14 {
    private JPanel panel1;
    private JLabel lblEdad;
    private JLabel lblPeso;
    private JLabel lblEstatura;
    private JTextField txtEdad;
    private JTextField txtPeso;
    private JTextField txtEstatura;
    private JButton btnCalcular;
    private JLabel lblResultado;
    private JTextField txtResultado;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio14");
        frame.setContentPane(new Ejercicio14().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio14() {
        //Boton calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcularImc();
            }
        });


    }

    private void calcularImc() {
        float peso = Float.parseFloat(txtPeso.getText());
        float estatura = Float.parseFloat(txtEstatura.getText());
        int edad = Integer.parseInt(txtEdad.getText());
        float operacion = peso / (estatura * estatura);

        if (edad < 16) {
            txtResultado.setText("Tu edad es inferior a la permitida.");
        } else if (operacion < 18.5) {
            txtResultado.setText("Desnutrición");
        } else if (operacion >= 18.5 && operacion < 25) {
            txtResultado.setText("Saludable");
        } else if (operacion >= 25 && operacion < 30) {
            txtResultado.setText("Pre-obesidad");
        } else if (operacion >= 30 && operacion < 35) {
            txtResultado.setText("Obesidad");
        } else
            txtResultado.setText("Error");
    }
}
