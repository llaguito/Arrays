/*
8)O mesmo que o sete pero con un array bidimensional.
 */
package ArrayBidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int f;
        int c;
        int sumaValoresImpares = 0;
        System.out.print("\nIntroduce número de filas : ");
        f = leer.nextInt();
        System.out.print("\nIntroduce número de columnas : ");
        c = leer.nextInt();
        int[][] primera = new int[f][c];
        
        System.out.print("\n");

        for (int contador = 0; contador < primera.length; contador++ ) {
            System.out.print("\n");
            for (int contador1 = 0; contador1 < primera[contador].length; contador1++ ){
                primera[contador][contador1] = aleatorio.nextInt(10);
                System.out.print(primera[contador][contador1]+" ");
                if (primera[contador][contador1] % 2 != 0){
                    sumaValoresImpares = sumaValoresImpares + primera[contador][contador1];
                }
            }
        }    
        
        System.out.print("\nLa suma de los valores impares es : "+sumaValoresImpares+"\n");
    }
    
}
