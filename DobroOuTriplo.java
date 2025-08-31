package lista2;

			import javax.swing.JOptionPane;

		public class DobroOuTriplo {
		    public static void main(String[] args) {
		        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

		        int resultado;
		        if (numero > 0) {
		            resultado = numero * 2;
		        } else {
		            resultado = numero * 3;
		        }

		        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
		    }
		}

