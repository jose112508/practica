
package tarea;

import java.util.Scanner;


public class Ejercicio13 {
//Dado un número entero cuya cantidad de dígitos es igual a 5, determine si es capicúa.

    public static void main(String[] args) {
        int Num, aux, inverso = 0, cifra;
        Scanner input =new Scanner(System.in);
        do {
            System.out.print("Ingrese un número >= 10: ");                                                 
            Num = input.nextInt();
        } while (Num < 10);
       
        //le damos la vuelta al número
        aux = Num;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(Num == inverso){
            System.out.println("El numero "+Num+" capicua");
        }else{
            System.out.println("El numero "+Num+" no es capicua");
        }
    }
    
}
