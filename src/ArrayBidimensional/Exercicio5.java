/*
5)Fai un programa que calcule o producto de duas matrices.
 */
package ArrayBidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int f;
        int c;
        int numero = 0;
        System.out.print("\nIntroduce número de filas : ");
        f = leer.nextInt();
        System.out.print("\nIntroduce número de columnas : ");
        c = leer.nextInt();
        int[][] primera = new int[f][c];
        int[][] segunda = new int[c][f];
        
        if ( f == c){
            int[][] multiplica = new int[f][c];
        
            for (int contador = 0; contador < primera.length; contador++ ) {
                for (int contador1 = 0; contador1 < primera[contador].length; contador1++ ){
                    primera[contador][contador1] = aleatorio.nextInt(10);
                    segunda[contador1][contador] = primera[contador][contador1];
                }
            }
      
            for (int contador = 0; contador < primera.length; contador++) {
                for (int contar = 0; contar < primera[contador].length; contar++){
                    for (int contador1 = 0; contador1 < primera[contador].length; contador1++) {
                        numero+= (primera[contador][contador1] * segunda[contador1][contar]);
                    }
                    multiplica[contador][contar] = numero;
                    numero = 0;
                }    
            }
           
            System.out.print("\nMultiplicamos :\n");
        
            for (int contador = 0; contador < multiplica.length; contador++ ) {
                System.out.print("\n");
                
                for (int contador1 = 0; contador1 < primera[contador].length; contador1++ ){
                    System.out.print(primera[contador][contador1]+" ");
                }
                
                System.out.print("  ");
                
                for (int contador1 = 0; contador1 < segunda[contador].length; contador1++ ){
                    System.out.print(segunda[contador][contador1]+" ");
                }
                
                System.out.print("   =   ");
                
                for (int contador1 = 0; contador1 < multiplica[contador].length; contador1++ ){
                    System.out.print(multiplica[contador][contador1]+" ");
                }
                                               
            }
            
        }
        
        else {
            System.out.println("No se pueden mumltiplicar.");
        }
    }
}
