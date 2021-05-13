import javax.swing.*; //Heredada de JFrame
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio15 extends JFrame implements ActionListener {

    /*
    Declaramos los componentes a emplear en la interfaz
     */
    //Barra
    JMenuBar mnb1;
    //Elementos0 de la barra
    JMenu mnuControles;
    JMenu mnuTamaño;
    //Elementos contenidos en los elementos0
    JMenuItem mnuItmBajaRes;
    JMenuItem mnuItmAltaRes;
    JMenuItem mnuItmVerde;
    JMenuItem mnuItmRojo;

    /*
    Método constructor instanciado
    en el método main. Al ejecutarse main
    se generará lo siguiente.
     */
    public Ejercicio15(){
        /*
        Ejercicio15 hereda de JFrame y al instanciarse en
        el método main se dibuja una ventana.
         */

        //Instanciamos los componentes
        mnb1 = new JMenuBar();
        mnuControles = new JMenu();
        mnuTamaño = new JMenu();
        mnuItmBajaRes = new JMenuItem();
        mnuItmAltaRes = new JMenuItem();
        mnuItmVerde = new JMenuItem();
        mnuItmRojo = new JMenuItem();

        //Asocia el objeto JMenuBar al JFrame
        /*
        super.setJMenuBar(mnb1);
        this.setJMenuBar(mnb1);
         */
        //Ejercicio15 es un JFrame
        setJMenuBar(mnb1);

        //Asocia el objeto JMenu al objeto JMenuBar
        //Y le añadimos un texto
        mnb1.add(mnuControles);
        mnuControles.setText("Controles");
        mnb1.add(mnuTamaño);
        mnuTamaño.setText("Tamaño");

        //Asocia el objeto JMenuItem al objeto JMenu
        mnuControles.add(mnuItmAltaRes);
        mnuItmAltaRes.setText("AltaRes");
        mnuItmBajaRes.setText("BajaRes");
        mnuControles.add(mnuItmBajaRes);
        mnuTamaño.add(mnuItmVerde);
        mnuTamaño.add(mnuItmRojo);

        //Asocia el evento ActionListener a los objetos JMenuItem
        mnuItmAltaRes.addActionListener(this);
        mnuItmBajaRes.addActionListener(this);
        mnuItmVerde.addActionListener(this);
        mnuItmRojo.addActionListener(this);


    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public static void main(String[] args){
        int ejeXEsquinaIzq = 0;
        int ejeYEsquinaIzq = 0;
        int ancho = 300;
        int alto = 300;

        Ejercicio15 frm1 = new Ejercicio15();
        frm1.setTitle("Ejercicio15");
        frm1.setBounds(ejeXEsquinaIzq, ejeYEsquinaIzq, ancho, alto);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm1.setVisible(true);
    }

}
