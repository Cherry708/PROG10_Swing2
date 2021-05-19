import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio16 {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char mathOperator;

    private JPanel pnlCalculadora;
    private JTextField txtDisplay;
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

    private void getOperator(String btnText){
        mathOperator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
    }

    public Ejercicio16() {
        btnNum1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum1Text = txtDisplay.getText()+btnNum1.getText();
                txtDisplay.setText(btnNum1Text);
            }
        });
        btnNum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum2Text= txtDisplay.getText()+btnNum2.getText();
                txtDisplay.setText(btnNum2Text);
            }
        });
        btnNum3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum3Text= txtDisplay.getText()+btnNum3.getText();
                txtDisplay.setText(btnNum3Text);
            }
        });
        btnNum4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum4Text= txtDisplay.getText()+btnNum4.getText();
                txtDisplay.setText(btnNum4Text);
            }
        });
        btnNum5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum5Text= txtDisplay.getText()+btnNum5.getText();
                txtDisplay.setText(btnNum5Text);
            }
        });
        btnNum6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum6Text= txtDisplay.getText()+btnNum6.getText();
                txtDisplay.setText(btnNum6Text);
            }
        });
        btnNum7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum7Text= txtDisplay.getText()+btnNum7.getText();
                txtDisplay.setText(btnNum7Text);
            }
        });
        btnNum8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum8Text= txtDisplay.getText()+btnNum8.getText();
                txtDisplay.setText(btnNum8Text);
            }
        });
        btnNum9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum9Text= txtDisplay.getText()+btnNum9.getText();
                txtDisplay.setText(btnNum9Text);
            }
        });
        btnNum0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNum0Text= txtDisplay.getText()+btnNum0.getText();
                txtDisplay.setText(btnNum0Text);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnText = btnPlus.getText();
                getOperator(btnText);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnText = btnMinus.getText();
                getOperator(btnText);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnText = btnDivide.getText();
                getOperator(btnText);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnText = btnMultiply.getText();
                getOperator(btnText);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (mathOperator == '+'){
                    total2 = total1 + Double.parseDouble(txtDisplay.getText());
                } else if (mathOperator == '-'){
                    total2 = total1 - Double.parseDouble(txtDisplay.getText());
                } else if (mathOperator == '/'){
                    total2 = total1 / Double.parseDouble(txtDisplay.getText());
                } else if (mathOperator == '*'){
                    total2 = total1 * Double.parseDouble(txtDisplay.getText());
                }
                txtDisplay.setText(String.valueOf(total2));
                total1 = 0.0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = 0.0;
                txtDisplay.setText("");
            }
        });
        btnPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (txtDisplay.getText().equals("")){
                    txtDisplay.setText("0.");
                } else if (txtDisplay.getText().contains(".")){
                    btnPunto.setEnabled(false);
                } else {
                    String btnPuntoText = txtDisplay.getText()+btnPunto.getText();
                    txtDisplay.setText(btnPuntoText);
                }
                btnPunto.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio16");
        frame.setContentPane(new Ejercicio16().pnlCalculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
