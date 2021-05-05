import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ComponentAdapter;
import java.beans.PropertyChangeListener;

public class Ejercicio10 {
    private JSpinner spnValor;
    private JPanel panel1;
    private JLabel lblMensaje;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio10");
        frame.setContentPane(new Ejercicio10().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setVisible(true);
    }

    public Ejercicio10() {
        spnValor.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                lblMensaje.setText("El valor es: "+spnValor.getValue().toString());
            }
        });
    }
}

