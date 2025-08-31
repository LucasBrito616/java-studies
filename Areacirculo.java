package lista1;

import javax.swing.JOptionPane;

public class Areacirculo {

	public static void main(String[] args) {
	

		        
		String raio = JOptionPane.showInputDialog(null, "Digite o raio do circulo:");
		  int raios = Integer.parseInt(raio);
		  
		  

	        double area = Math.PI * raios * raios;
	        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
	        
	    
		        
		        
	
}
	}