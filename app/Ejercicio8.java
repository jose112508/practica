
package tarea;

import java.util.Scanner;

public class Ejercicio8 {
//Dado un (1) número, imprimir Positivo o negativo según sea el numero.

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.print("Ingrese un numero: ");
      int num=input.nextInt();
      
      if(num>0){
          System.out.println("El numero "+num+ " es Positivo ");
      }else{
          System.out.println("El numero "+num+" es negativo");
      }
    }
    
}
