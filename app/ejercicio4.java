/*Dados dos (2) números calcule la suma, resta, multiplicación, división y módulo
*/
package app;


public class ejercicio4 {

    public static void main(String[] args) {
         //entrada
        int numero1 = 25;
        int numero2 = 5;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;
        int modulo =0;
        //proceso 
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        modulo= numero1 % numero2;
        //salida
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(modulo);
    }
    
}
