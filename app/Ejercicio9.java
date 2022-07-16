
package tarea;


public class Ejercicio9 {

  
// Dado un (1) número binario de cuatro (4) dígitos imprimir su bit da paridad. El bit
//de paridad es 1 si el número de bits 1 es impar y 0 en caso contrario.
      public static boolean findParity(int x)
    {
        // dividir recursivamentemente el entero (32 bits) en dos iguales
        // mitades y toma su XOR hasta que solo quede 1 bit
 
        x = (x & 0x0000FFFF) ^ (x >> 16);
        x = (x & 0x000000FF) ^ (x >> 8);
        x = (x & 0x0000000F) ^ (x >> 4);
        x = (x & 0x00000003) ^ (x >> 2);
        x = (x & 0x00000001) ^ (x >> 1);
 
        // devuelve verdadero si el último bit está establecido
        return (x & 1) == 1;
    }
 
    public static void main(String[] args)
    {
        int x = 10;
 
        System.out.println(x + " en binario es " + Integer.toBinaryString(x));
 
        if (findParity(x)) {
            System.out.println(x + " contiene bits impares");
        }
        else {
            System.out.println(x + " contiene bits pares");
        }
    }
}