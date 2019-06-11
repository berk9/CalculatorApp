import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {


      SwingUtilities.invokeLater(() -> {

          CalculatorForm calculatorForm = new CalculatorForm();
          calculatorForm.setVisible(true);
      });
    }
}
