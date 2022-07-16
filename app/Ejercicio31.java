package app;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        double p=0;
        int c=0, s=0;
        System.out.println("Ingrese un numero: ");
        n = input.nextInt();
        s=s+n;
        while (n != 0) {
            System.out.println("Ingrese un numero: ");
            n = input.nextInt();
            c++;
            s=s+n;
        }
        p=s/c;
        System.out.println("El promedio de la serie es: "+p);
    }
}
