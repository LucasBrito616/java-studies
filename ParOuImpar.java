package lista2;

import javax.swing.JOptionPane;

public class ParOuImpar {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(input);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ímpar.");
        }
    }
}