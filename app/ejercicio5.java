package app;

import javax.swing.JOptionPane;

public class ejercicio5 {

    public static void main(String[] args) {
        double x = 0.0;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de x:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de y:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de z:"));
        
        x = (-b +(Math.sqrt(Math.pow(b, 2) + (4*a*c))))/(2*a);
        
        JOptionPane.showMessageDialog(null, x);
    }
}
