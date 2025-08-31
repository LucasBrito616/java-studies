package lista3;

		import javax.swing.JOptionPane;

		public class SomaPares {
		    public static void main(String[] args) {
		        int soma = 0;

		        for (int i = 1; i <= 500; i++) {
		            if (i % 2 == 0) {
		                soma += i;
		            }
		        }

		        JOptionPane.showMessageDialog(null, "Somatório dos pares de 1 a 500: " + soma);
		    }
		}



