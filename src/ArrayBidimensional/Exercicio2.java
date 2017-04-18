/*
2) Crea dous arrays bidimensionais, de f filas e c columnas (sendo f,c números enteiros introducidos polo  usuario), despois dalle valores aleatorios as posicions empregando a clase ramdon ou math.

    Fai un programa que calcule a suma do arrays.

 */
package ArrayBidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int f ,c;
        System.out.print("\nIntroduce número de filas :");
        f = leer.nextInt();
        System.out.print("\nIntroduce número de columnas :");
        c = leer.nextInt();
        int[][] primera = new int[f][c];
        int[][] segunda = new int[f][c];
        
        for (int contador = 0; contador < primera.length; contador++ ) {
            System.out.print("\n");
            for (int contador1 = 0; contador1 < primera[contador].length; contador1++ ){
                primera[contador][contador1] = aleatorio.nextInt(10);
                segunda[contador][contador1] = aleatorio.nextInt(10);
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
        
        System.out.print("\n");
        
        for (int contador = 0; contador < primera.length; contador++ ) {
            System.out.print("\n");
            for (int contador1 = 0; contador1 < primera[contador].length; contador1++ ){
                primera[contador][contador1] = primera[contador][contador1] + segunda[contador][contador1];
                System.out.print(primera[contador][contador1]+" ");
            }
        }
    }
}