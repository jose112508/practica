/*
Dados dos (2) lados de un triángulo en cm, calcular la hipotenusa del mismo.
 */
package app;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        //entrada 
        //Declaramos las variables
        double c, b, solucion;
        ejercicio6 pita = new ejercicio6();
        Scanner sca = new Scanner(System.in);

//Pedimos los números
        System.out.println("coloca el primer número");
        String cIntermedio = sca.next();
        System.out.println("Coloca el segundonúmero");
        String bIntermedio = sca.next();
        c = Double.parseDouble(pita.cambioComas(cIntermedio));
        b = Double.parseDouble(pita.cambioComas(bIntermedio));
//Hacemos las operaciones
        solucion = (c * c) + (b * b);
        solucion = Math.sqrt(solucion);
//Imprimimos en pantalla la solución
        System.out.println("La solución es " + solucion);

    }
//Aquí creo el método en caso que usemos un teclado extendido para que transforme «.» en»,»
    public String cambioComas(String str) {
        str = str.replaceAll(",", ".");
        return str;
    }

}
        



