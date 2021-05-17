import javax.swing.*;

public class Ejercicio16 {

    private JPanel pnlCalculadora;
    private JTextField txtResultado;
    private JButton btnMultiply;
    private JButton btnNum3;
    private JButton btnNum2;
    private JButton btnNum5;
    private JButton btnNum8;
    private JButton btnPunto;
    private JButton btnPlus;
    private JButton btnNum6;
    private JButton btnNum9;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnEquals;
    private JButton btnNum1;
    private JButton btnNum4;
    private JButton btnNum7;
    private JButton btnNum0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio16");
        frame.setContentPane(new Ejercicio16().pnlCalculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
