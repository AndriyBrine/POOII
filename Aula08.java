import javax.swing.JOptionPane;

public class Aula08 {
    public static void main(String args[]) {

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        JOptionPane.showMessageDialog(null, "O resultado da soma: " + (num1 + num2));
        JOptionPane.showMessageDialog(null, "O resultado da subtração: " + (num1 - num2));
        JOptionPane.showMessageDialog(null, "O resultado da divisão: " + (num1 / num2));
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação: " + (num1 * num2));

        
    }
}
