import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ejercicio18 {

    private ArrayList<JCheckBox> listaCheckBoxGeneraciones;

    private JPanel pnlForm;
    private JComboBox cmbGeneraciones;
    private JPanel pnlMaestro;
    private JPanel pnlDetalle;

    public Ejercicio18(){
        pnlDetalle.setLayout(new GridLayout(10,1));
        listaCheckBoxGeneraciones = new ArrayList<>();

        /*
        Se debe declarar un listener para el objeto
        JComboBox del que queremos conocer el estado.
        Debemos esperar a que un evento suceda para
        modificar su estado.
         */
        cmbGeneraciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pnlDetalle.removeAll();
                if (cmbGeneraciones.getSelectedIndex()+1 == 2){
                    dibujarPanelDetalle1(1);
                } else if (cmbGeneraciones.getSelectedIndex()+1 == 3){
                    dibujarPanelDetalle1(2);
                } else if (cmbGeneraciones.getSelectedIndex() == 0){
                    pnlDetalle.removeAll(); //Elimina el contenido y ya no será seleccionable pero no borra la pantalla
                    pnlDetalle.repaint(); //Dibuja nada o lo que le suministres
                }
                pnlDetalle.doLayout();
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio18");
        frame.setContentPane(new Ejercicio18().pnlForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void dibujarPanelDetalle1(int index){
        int checkBoxSize = 10;
        for (int contador = 0; contador < checkBoxSize; contador++) {
            JCheckBox checkBoxGeneraciones = new JCheckBox();
            checkBoxGeneraciones.setText("Generacion "+index+" - Pokemon " + (contador + 1));
            pnlDetalle.add(checkBoxGeneraciones);
        }

    }
}
