package lista3;



		import javax.swing.JOptionPane;

		public class Imparese {
		    public static void main(String[] args) {
		        String numerosImpares = "";

		        for (int i = 0; i <= 20; i++) {
		            if (i % 2 != 0) {
		                numerosImpares += i + " ";
		            }
		        }

		        JOptionPane.showMessageDialog(null, "Números ímpares de 0 a 20:\n" + numerosImpares);
		    }
		}
	


