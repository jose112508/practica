
package tarea ;

import java.util.Scanner;

public class Ejercicio11 {

   //Dado un (1) número de cuatro (4) dígitos imprimirlo por separado en unidades,
// decenas, centenas y unidades de mil.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
    System.out.print("Ingrese un numero: ");
    int num=input.nextInt();
    
        int millares=num/ 1000 ;
        System.out.print( " Millares= " + millares);
	int centenas=(num-(millares* 1000 ))/ 100 ;
	int decenas=(num- (millares* 1000 + centenas* 100 ))/ 10 ;
	int unidades=num-(millares* 1000 + centenas* 100 + decenas* 10 );
       System.out.print( " Millares= %i \n " + millares);
	 System.out.print( " Centenas= %i \n " + centenas);
	 System.out.print( " Decenas= %i \n " +decenas);
	 System.out.print ( " Unidades= %i \n " + unidades);
}
}
