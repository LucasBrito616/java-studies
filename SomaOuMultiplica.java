package lista2;

import javax.swing.JOptionPane;

public class SomaOuMultiplica {
    public static void main(String[] args) {
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A:"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B:"));

        int resultado;
        if (A == B) {
            resultado = A + B;
        } else {
            resultado = A * B;
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}