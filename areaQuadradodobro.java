package lista1;

import javax.swing.JOptionPane;


public class areaQuadradodobro {

    public static void main(String[] args) {
        
    
        String lados = JOptionPane.showInputDialog(null, "Digite o lado do quadrado:");
        
       
        int lado = Integer.parseInt(lados);
        int areaQuadrad = lado * lado;
        int totals = areaQuadrad * 2;
        
       
        JOptionPane.showMessageDialog(null, "A area do quadrado é: " + lados 
                                            + "\nO dobro da área é: " + totals);
    }
}
