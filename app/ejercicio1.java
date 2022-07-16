/*Ejercicio 1.
¿De cuál tipo de dato sería la variable donde almacena lo siguiente?
 “Hola Mundo"
 Verdadero
 ‘1'
 ‘c'
 256
 8>19*/
package app;

public class ejercicio1 {

    public static void main(String[] args) {
        
 String hola = "Hola Mundo";
boolean  verdadero= true;
char numero='1';
char letra='c';
int numero1= 256;
int numero2= 8;

//proceso
if (numero1>19) {
          System.out.print("El numero 8 es mayor a 19\n");  
          }else{
    System.out.println("el numero 8 es menor a 19\n");
}
//salida
System.out.println(hola + " es una variable String \n");
System.out.println(verdadero + " es una variable boolean \n");
System.out.println(numero + " es una variable char \n");
System.out.println(letra + " es una variable char \n");
System.out.println(numero1 + " es una variable int \n");
System.out.println(numero2 + " es una variable int \n");
    }
    
}
