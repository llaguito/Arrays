/*
6) Fai un programa que pida por teclado a dimensión de un array unidimensional lle de valores de forma aleatoria entre 0-10 e despois o mostre de forma inversa.
 */
package ArrayBidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int l;
        System.out.print("\nIntroduce longitud de la array :");
        l = leer.nextInt();
        int[] primera = new int[l];
        int[] segunda = new int[l];
        
        int numero = primera.length - 1;
        for (int contador = 0; contador < primera.length; contador++ ){
            primera[contador] = aleatorio.nextInt(10);
            segunda[numero] = primera[contador];
            numero--;
        }
        
        System.out.print("\n");
        
        for (int contador = 0; contador < primera.length; contador++ ){
            System.out.print(primera[contador]+" ");
        }
        
        System.out.print("\n");
        
        for (int contador = 0; contador < segunda.length; contador++ ){
            System.out.print(segunda[contador]+" ");
        }
        
    }
}
