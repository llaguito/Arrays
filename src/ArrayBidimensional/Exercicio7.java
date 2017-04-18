/*
7) Fai un programa que pida por teclado a dimensión de un array unidimensional lle de valores de forma aleatoria entre 0-10 e despois o mostre a suma dos seus valores impares.
 */
package ArrayBidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int l;
        int sumaValoresImpares = 0;
        System.out.print("\nIntroduce longitud de la array : ");
        l = leer.nextInt();
        int[] primera = new int[l];
        
        System.out.print("\n");

        for (int contador = 0; contador < primera.length; contador++ ){
            primera[contador] = aleatorio.nextInt(10);
            System.out.print(primera[contador]+" ");
            if (primera[contador] % 2 != 0){
                sumaValoresImpares = sumaValoresImpares + primera[contador];
            }
        }
        
        System.out.print("\nLa suma de los valores impares es : "+sumaValoresImpares+"\n");
                
    }
}
