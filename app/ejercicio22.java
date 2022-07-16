package app;

import java.util.*;
import java.io.*;

public class ejercicio22 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        int cifras;
        char car;
        do {
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cifras = 0;    //esta variable es el contador de cifras
            while (n != 0) {             //mientras a n le queden cifras
                n = n / 10;         //le quitamos el último dígito
                cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cifras + " cifras");
            System.out.print("Continuar? ");
            car = (char) System.in.read();
        } while (car != 'n' && car != 'N');
    }
}
