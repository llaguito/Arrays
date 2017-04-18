/*
4) Fai un programa que dada una matriz bidimensional calcule a si e simetrica.
 */
package ArrayBidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio4 {

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
        
        if (f == c){
        
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
            
            int contar = 0;
            int contar1 = 0;
            while ((primera[contar][contar1] == segunda[contar][contar1]) && (contar < primera.length)){
                contar1++;
                if (contar1 < primera[primera.length -1].length) {
                } 
                else {
                    contar1 = 0;
                    contar++;
                }
            }
            
            if (primera[contar][contar1] != segunda[contar][contar1]){
                System.out.println("\n\nLa matriz no es simétrica.");
            }
            else {
                System.out.println("\n\nLa matriz es simétrica.");
            }
            
        }
        
        else {
            System.out.println("\n\nLa matriz no es simétrica.");
        }
        
    }
    
}
