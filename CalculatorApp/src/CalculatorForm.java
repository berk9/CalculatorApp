import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;


public class CalculatorForm  extends JFrame implements Calculator {

    private JTextField TextField;
    private JPanel MyCalculator;
    private JButton button7;
    private JButton button4;
    private JButton button1;
    private JButton buttonDot;
    private JButton button8;
    private JButton button5;
    private JButton button2;
    private JButton button9;
    private JButton buttonDivision;
    private JButton button6;
    private JButton buttonMultiplication;
    private JButton button3;
    private JButton buttonPlus;
    private JButton buttonEquals;
    private JButton buttonMinus;
    private JButton buttonNull;
    private JRadioButton OFFRadioButton;
    private JRadioButton ONRadioButton;
    private JButton buttonClear;
    private JButton buttonBackspace;
    private JButton buttonPlusMinus;
    private JButton buttonPI;
    private JButton buttonSquareRoot;
    private JButton buttonPercent;
    private JPanel Commands;

    public CalculatorForm() {

        add(MyCalculator);

        setTitle("Calculator");
        setSize(360, 460);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage
                (Toolkit.getDefaultToolkit()
                .getImage("C:\\Users\\ACER\\Desktop\\berk\\48-512.png"));

        MyCalculator.setBackground(Color.black);
        Commands.setBackground(Color.black);

        TextField.setForeground(Color.white);
        TextField.setBackground(Color.black);
        TextField.setBorder(new LineBorder(Color.black));
        TextField.setCaretColor(Color.black);


        buttonPlus.setBackground(Color.red);
        buttonPlus.setForeground(Color.white);

        buttonMultiplication.setBackground(Color.red);
        buttonMultiplication.setForeground(Color.white);

        buttonMinus.setBackground(Color.red);
        buttonMinus.setForeground(Color.white);

        buttonDivision.setBackground(Color.red);
        buttonDivision.setForeground(Color.white);

        buttonEquals.setBackground(Color.red);
        buttonEquals.setForeground(Color.white);

        buttonDot.setBackground(Color.red);
        buttonDot.setForeground(Color.white);

        buttonPercent.setBackground(Color.red);
        buttonPercent.setForeground(Color.white);

        buttonPI.setBackground(Color.red);
        buttonPI.setForeground(Color.white);

        buttonSquareRoot.setBackground(Color.red);
        buttonSquareRoot.setForeground(Color.white);

        buttonPlusMinus.setBackground(Color.red);
        buttonPlusMinus.setForeground(Color.white);

        buttonClear.setBackground(Color.gray);
        buttonClear.setForeground(Color.white);

        buttonBackspace.setBackground(Color.gray);
        buttonBackspace.setForeground(Color.white);

        button1.setBackground(Color.darkGray);
        button1.setForeground(Color.white);

        button2.setBackground(Color.darkGray);
        button2.setForeground(Color.white);

        button3.setBackground(Color.darkGray);
        button3.setForeground(Color.white);

        button4.setBackground(Color.darkGray);
        button4.setForeground(Color.white);

        button5.setBackground(Color.darkGray);
        button5.setForeground(Color.white);

        button6.setBackground(Color.darkGray);
        button6.setForeground(Color.white);

        button7.setBackground(Color.darkGray);
        button7.setForeground(Color.white);

        button8.setBackground(Color.darkGray);
        button8.setForeground(Color.white);

        button9.setBackground(Color.darkGray);
        button9.setForeground(Color.white);

        buttonNull.setBackground(Color.darkGray);
        buttonNull.setForeground(Color.white);


        ONRadioButton.setForeground(Color.white);
        ONRadioButton.setBackground(Color.black);
        OFFRadioButton.setForeground(Color.white);
        OFFRadioButton.setBackground(Color.black);
        ONRadioButton.setSelected(true);
        OFFRadioButton.setSelected(false);
        OFFRadioButton.setEnabled(true);



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "1");
                }else{
                    TextField.setText("1");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "2");
                }else{
                    TextField.setText("2");
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "3");
                }else{
                    TextField.setText("3");
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "4");
                }else{
                    TextField.setText("4");
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "5");
                }else{
                    TextField.setText("5");
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "6");
                }else{
                    TextField.setText("6");
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "7");
                }else{
                    TextField.setText("7");
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "8");
                }else{
                    TextField.setText("8");
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "9");
                }else{
                    TextField.setText("9");
                }
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                if (!TextField.getText().contains(",") && !TextField.getText().isEmpty()) {
                    String buttonDecimalDotText = TextField.getText() + buttonDot.getText();
                    TextField.setText(buttonDecimalDotText);

                }
            }
        });
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
               calculationOperations();
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    number = Double.parseDouble(textFieldText);
                    calculation = 4;
                    TextField.setText("");
                }else {
                    number = Double.parseDouble(TextField.getText());
                    calculation = 4;
                    TextField.setText("");
                }
            }
        });
        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    number = Double.parseDouble(textFieldText);
                    calculation = 3;
                    TextField.setText("");
                }else {
                    number = Double.parseDouble(TextField.getText());
                    calculation = 3;
                    TextField.setText("");
                }
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    number = Double.parseDouble(textFieldText);
                    calculation = 1;
                    TextField.setText("");

                }else {
                    number = Double.parseDouble(TextField.getText());
                    calculation = 1;
                    TextField.setText("");
                }
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    number = Double.parseDouble(textFieldText);
                    calculation = 2;
                    TextField.setText("");
                }else {
                    number = Double.parseDouble(TextField.getText());
                    calculation = 2;
                    TextField.setText("");
                }
            }
        });

        buttonNull.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().length() > 9){
                    return;
                }
                if (!TextField.getText().equals("0") && !TextField.getText().equals("NaN")) {
                    TextField.setText(TextField.getText() + "0");
                }else{
                    TextField.setText("0");
                }
            }
        });
        OFFRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disableCommands();
            }
        });
        ONRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableCommands();
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                TextField.setText("0");
            }
        });
        buttonBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                int length = TextField.getText().length();
                int num = TextField.getText().length() - 1;
                String result;

                if (length > 0) {
                    StringBuilder backspace = new StringBuilder(TextField.getText());
                    backspace.deleteCharAt(num);
                    result = backspace.toString();
                    TextField.setText(result);
                    if (result.equals("")){
                        TextField.setText("0");
                    }
                }

            }
        });
        buttonPercent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    number = Double.parseDouble(textFieldText);
                    percentOperation();

                }else {
                    number = Double.parseDouble(TextField.getText());
                    percentOperation();
                }
            }
        });
        buttonSquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    number = Double.parseDouble(textFieldText);
                    sqrtOperation();
                }else {
                    number = Double.parseDouble(TextField.getText());
                    sqrtOperation();
                }
            }
        });
        buttonPI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    TextField.setText("");
                    TextField.setText(decimalFormat.format(Math.PI));
            }
        });
        buttonPlusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().isEmpty()){
                    getToolkit().beep();
                    return;
                }
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    number = Double.parseDouble(textFieldText);
                    plusMinusOperation();
                }else {
                    number = Double.parseDouble(TextField.getText());
                    plusMinusOperation();
                }
            }
        });

        //Letters Off
        TextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent event) {
                super.keyTyped(event);
                char c = event.getKeyChar();

                if (TextField.getText().isEmpty()){
                    TextField.setText("0");
                }

                if(TextField.getText().equals("0") || TextField.getText().equals("NaN")){
                    if(Character.isDigit(c)) {
                        String newText = "" + c;
                        TextField.setText(newText);
                    }
                    event.consume();
                }
                if(TextField.getText().length() > 10){
                    event.consume();
                }
                if((!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE)
                        || Character.isSpaceChar(c)){
                    event.consume();
                }
            }
        });

        TextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {
                super.keyPressed(event);
                char c = event.getKeyChar();
                if(TextField.getText().equals("NaN")){
                    if(c == KeyEvent.VK_BACK_SPACE){
                        TextField.setText("");
                    }
                    event.consume();
                }
            }

        });
    }

    //OffButton
    @Override
    public void disableCommands() {

        TextField.setText("");
        TextField.setEnabled(false);
        buttonDot.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonMultiplication.setEnabled(false);
        buttonDivision.setEnabled(false);
        buttonNull.setEnabled(false);
        buttonEquals.setEnabled(false);
        ONRadioButton.setEnabled(true);
        OFFRadioButton.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonBackspace.setEnabled(false);
        buttonPlusMinus.setEnabled(false);
        buttonPI.setEnabled(false);
        buttonPercent.setEnabled(false);
        buttonSquareRoot.setEnabled(false);

        ONRadioButton.setSelected(false);
        OFFRadioButton.setSelected(true);
    }

    //OnButton
    @Override
    public void enableCommands() {

        TextField.setText("0");
        TextField.setEnabled(true);
        buttonDot.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonMultiplication.setEnabled(true);
        buttonDivision.setEnabled(true);
        buttonNull.setEnabled(true);
        buttonEquals.setEnabled(true);
        ONRadioButton.setEnabled(true);
        OFFRadioButton.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonBackspace.setEnabled(true);
        buttonPlusMinus.setEnabled(true);
        buttonPI.setEnabled(true);
        buttonPercent.setEnabled(true);
        buttonSquareRoot.setEnabled(true);

        ONRadioButton.setSelected(true);
        OFFRadioButton.setSelected(false);
    }

    double number;
    double result;
    int calculation;
    DecimalFormat decimalFormat = new DecimalFormat("0.########");

    // Operations
    @Override
    public void calculationOperations() {
        switch (calculation) {

            case 1: // PlusOperations
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    result = number + Double.parseDouble(textFieldText);
                    TextField.setText(decimalFormat.format(result));
                }else {
                    result = number + Double.parseDouble(TextField.getText());
                    TextField.setText(decimalFormat.format(result));
                }

                    break;

            case 2: // MinusOperations
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    result = number - Double.parseDouble(textFieldText);
                    TextField.setText(decimalFormat.format(result));
                }else {
                    result = number - Double.parseDouble(TextField.getText());
                    TextField.setText(decimalFormat.format(result));
                }
                    break;

            case 3: // MultiplicationOperations
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    result = number * Double.parseDouble(textFieldText);
                    TextField.setText(decimalFormat.format(result));
                }else {
                    result = number * Double.parseDouble(TextField.getText());
                    TextField.setText(decimalFormat.format(result));
                }

                    break;

            case 4: // DivisionOperations
                if(TextField.getText().contains(",")) {
                    String textFieldText = TextField.getText().replace(",", ".");
                    result = number / Double.parseDouble(textFieldText);
                    TextField.setText(decimalFormat.format(result));
                }else {
                    result = number / Double.parseDouble(TextField.getText());
                    TextField.setText(decimalFormat.format(result));
                }
                    break;

        }
    }

        // % function
        @Override
        public void percentOperation(){
            result = number/100;
            TextField.setText(decimalFormat.format(result));
        }

        //Square root function
        @Override
        public void sqrtOperation(){
            result = Math.sqrt(number);
            TextField.setText(decimalFormat.format(result));
        }

        //Positive or Negative
        @Override
        public void plusMinusOperation() {
            result = number * -1;
            TextField.setText(decimalFormat.format(result));
        }


    }

