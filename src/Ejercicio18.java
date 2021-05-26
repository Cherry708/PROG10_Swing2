import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ejercicio18 {

    private ArrayList<JCheckBox> listaCheckBoxGeneraciones;
    //Ejercicio19
    private String[] arrayNombrePokemons1Generacion = {"Bulbasaur","Ivysaur","Venusaur","Charmander","Charmaleon",
            "Charizard","Squietle","Wartortle","Blastoise","Caterpie"};
    private String[] arrayNombrePokemons2Generacion =
            {"Chikorita","Bayleef","Meganium","Cyndaquil","Quilava","Typhlosion","Totodile",
                    "Croconaw","Feraligatr","Sentret"};



    private JPanel pnlForm;
    private JComboBox cmbGeneraciones;
    private JPanel pnlMaestro;
    private JPanel pnlDetalle;
    private JButton btnAceptar;

    JCheckBox checkBoxGeneraciones;


    public Ejercicio18(){
        pnlDetalle.setLayout(new GridLayout(10,1));
        listaCheckBoxGeneraciones = new ArrayList<>();

        /*
        Se debe declarar un listener para el objeto
        JComboBox del que queremos conocer el estado.
        Debemos esperar a que un evento suceda para
        modificar su estado.
         */
        /* Ejercicio 19 */

        cmbGeneraciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pnlDetalle.removeAll();
                if (cmbGeneraciones.getSelectedIndex() == 1){
                    dibujarPanelDetalle1(arrayNombrePokemons1Generacion);
                } else if (cmbGeneraciones.getSelectedIndex() == 2){
                    dibujarPanelDetalle1(arrayNombrePokemons2Generacion);
                } else if (cmbGeneraciones.getSelectedIndex() == 0){
                    pnlDetalle.removeAll(); //Elimina el contenido y ya no será seleccionable pero no borra la pantalla
                    pnlDetalle.repaint(); //Dibuja nada o lo que le suministres
                }
                pnlDetalle.doLayout();
            }
        });

        //Ejercicio 20
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombresSeleccionados = "";

                for (int contador = 0; contador < listaCheckBoxGeneraciones.size(); contador++){
                    if (listaCheckBoxGeneraciones.get(contador).isSelected()){
                        nombresSeleccionados = listaCheckBoxGeneraciones.get(contador).getText().concat(" "+nombresSeleccionados);
                    }
                }

                if (!nombresSeleccionados.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Has marcado "+nombresSeleccionados);
                }
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

    public void dibujarPanelDetalle1(/*Ejercicio 19*/String[] array){
        int checkBoxSize = 10;
        for (int contador = 0; contador < checkBoxSize; contador++) {
            checkBoxGeneraciones = new JCheckBox();
            //Ejercicio 19
            checkBoxGeneraciones.setText(array[contador]);
            pnlDetalle.add(checkBoxGeneraciones);
            listaCheckBoxGeneraciones.add(checkBoxGeneraciones);
        }
    }
}
