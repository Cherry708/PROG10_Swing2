import javax.swing.*; //Heredada de JFrame
import java.awt.*;
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
    //Elementos1 contenidos en los elementos0
    JMenu mnuTamaño;
    JMenu mnuColor;
    //Elementos2 contenidos en elementos1
    JMenuItem mnuItmBajaRes;
    JMenuItem mnuItmAltaRes;
    JMenuItem mnuItmMaxRes;
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
        mnuControles = new JMenu("Controles");
        mnuTamaño = new JMenu("Tamaño");
        mnuColor = new JMenu("Color");
        mnuItmBajaRes = new JMenuItem("854x480");
        mnuItmAltaRes = new JMenuItem("1280x720");
        mnuItmMaxRes = new JMenuItem("Máxima resolución");
        mnuItmVerde = new JMenuItem("Verde");
        mnuItmRojo = new JMenuItem("Rojo");

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
        mnuControles.add(mnuTamaño);
        mnuControles.add(mnuColor);

        //Asocia el objeto JMenuItem al objeto JMenu
        mnuTamaño.add(mnuItmAltaRes);
        mnuTamaño.add(mnuItmBajaRes);
        mnuTamaño.add(mnuItmMaxRes);
        mnuColor.add(mnuItmVerde);
        mnuColor.add(mnuItmRojo);

        //Asocia el evento ActionListener a los objetos JMenuItem
        mnuItmAltaRes.addActionListener(this);
        mnuItmBajaRes.addActionListener(this);
        mnuItmVerde.addActionListener(this);
        mnuItmRojo.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource().equals(mnuItmAltaRes)){
            setSize(1280,720);
            setLocationRelativeTo(null);
        }
        if (actionEvent.getSource().equals(mnuItmBajaRes)){
            setSize(854,480);
            setLocationRelativeTo(null);
        }
        if (actionEvent.getSource().equals(mnuItmMaxRes)){
         Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
         setSize(dimension);
         setLocationRelativeTo(null);
        }
        if (actionEvent.getSource().equals(mnuItmRojo)){
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (actionEvent.getSource().equals(mnuItmVerde)){
            getContentPane().setBackground(new Color(0,255,0));
        }
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
        frm1.setLocationRelativeTo(null);
        frm1.setVisible(true);
    }

}
