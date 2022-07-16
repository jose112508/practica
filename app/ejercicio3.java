/*
Escribir las siguientes expresiones matemáticas a pseudo-codigo.
 */
package app;

public class ejercicio3 {

    public static void main(String[] args) {
int ln = 0;
        int ln1 = 0;
        int a = 600;
        int b = 10;
        int c = 12;
        ln = (a + (b / c)) / ((a / b) + c);
        ln1 = (a / (a + b)) / (a / (a - b));

        System.out.println("El resultado de la primera operacion es: " + ln
                + " \n El resultado de la segunda operacion es: " + ln1);
    }
}
   
