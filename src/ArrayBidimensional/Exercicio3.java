/*
Fai un programa que dada una matriz bidimensional calcule a sua traspuesta.
 */
package ArrayBidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int f ,c;
        System.out.print("\nIntroduce número de filas :");
        f = leer.nextInt();
        System.out.print("\nIntroduce número de columnas :");
        c = leer.nextInt();
        int[][] primera = new int[f][c];
        int[][] segunda = new int[c][f];
        
        for (int contador = 0; contador < primera.length; contador++ ) {
            System.out.print("\n");
            for (int contador1 = 0; contador1 < primera[contador].length; contador1++ ){
                primera[contador][contador1] = aleatorio.nextInt(10);
                segunda[contador1][contador] = primera[contador][contador1];
                System.out.print(primera[contador][contador1]);
            }
        }
        
        System.out.print("\n");
        
        for (int contador = 0; contador < segunda.length; contador++ ) {
            System.out.print("\n");
            for (int contador1 = 0; contador1 < segunda[contador].length; contador1++ ){
                System.out.print(segunda[contador][contador1]);
            }
        }
        
    }
    
}
