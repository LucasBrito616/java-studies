package lista3;

import javax.swing.JOptionPane;

public class SomaMedia {
	    public static void main(String[] args) {
	        int soma = 0;

	        for (int i = 1; i <= 10; i++) {
	            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " + i + ":"));
	            soma += valor;
	        }

	        double media = soma / 10.0;

	        JOptionPane.showMessageDialog(null, "Somatório: " + soma + "\nMédia: " + media);
	    }
	}