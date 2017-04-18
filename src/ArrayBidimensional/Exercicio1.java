/*
1)Crea un array bidimensional, de f filas e c columnas (sendo f,c números enteiros introducidos polo  usuario), despois dalle valores aleatorios as posicions empregando a clase ramdon ou math.

  Por ultimo mostra os datos da matriz da seguinte forma:

A)	Filas empezando pola ultima
B)	Columnas empezando pola ultima
C)	No caso de que a matriz sexa cuadrada (c==f) mostrar as duas diagonales
 

                         P.e         
1	5	6	7
5	5	6	6
8	5	5	3
3	3	3	3

A)	{3,3,3,3}{8,5,5,5},{5,5,6,6},{1,5,6,7}
B)	{7,6,3,3},{6,6,5,3},{5,5,5,3},{1,5,8,3}
C)	{1,5,5,3}{3,5,6,7}

 */
package ArrayBidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int f ,c;
        System.out.print("\nIntroduce número de filas :");
        f = leer.nextInt();
        System.out.print("\nIntroduce número de columnas :");
        c = leer.nextInt();
        int[][] Array = new int[f][c];
        
        for (int contador = 0; contador < Array.length; contador++ ) {
            System.out.print("\n");
            for (int contador1 = 0; contador1 < Array[contador].length; contador1++ ){
                Array [contador][contador1] = aleatorio.nextInt(10);
                System.out.print(Array[contador][contador1]);
            }
        }
        
        System.out.print("\n");
        
        for (int contador = Array.length - 1; contador >= 0; contador-- ) {
            System.out.print("\n");
            for (int contador1 = 0; contador1 < Array[contador].length; contador1++ ){
                System.out.print(Array[contador][contador1]);
            }
        }
        
        System.out.print("\n");
        
        for (int contador = 0; contador < Array.length; contador++ ) {
            System.out.print("\n");
            for (int contador1 = Array[contador].length - 1; contador1 >= 0; contador1-- ){
                System.out.print(Array[contador][contador1]);
            }
        }

        System.out.print("\n");
        
        if (f == c){
            int contador1 = 0;
            
            System.out.print("\n");
        
            for (int contador = 0; contador < Array.length; contador++ ) {
                System.out.print(Array[contador][contador]);
            }
            
            System.out.print("\n\n");            
            
            for (int contador = Array.length - 1; contador >= 0; contador-- ) {
                System.out.print(Array[contador][contador1]);
                contador1++;
            }
        } 
    }
}
    

