import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {

    private JCheckBox chkPikachu;
    private JPanel panel1;
    private JCheckBox chkCharmander;
    private JCheckBox chkGeodude;
    private JButton btnAceptar;
    private JLabel lblMensaje;

       public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio1");
        frame.setContentPane(new Ejercicio1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio1() {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String mensaje = "Pokemon/s elegido/s:";
                if(chkPikachu.isSelected()){
                    mensaje = mensaje+" "+"Pikachu";
                }
                if(chkCharmander.isSelected()){
                    mensaje = mensaje+" "+"Charmander";
                }
                if(chkGeodude.isSelected()){
                    mensaje = mensaje+" "+"Geodude";
                }
                lblMensaje.setText(mensaje);

            }
        });
    }
}
