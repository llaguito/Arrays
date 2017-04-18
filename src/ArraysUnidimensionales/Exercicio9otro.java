package ArraysUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio9otro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] letras = new int[27];
        String frase = "";
        char letra;
        int numero;
        System.out.print("Introduce frase a contabilizar: ");
        frase = leer.nextLine();
        for (int contador = 0;contador < frase.length(); contador++){
            if (((int)(frase.charAt(contador))) != 255) {
                letras[((int)(frase.charAt(contador)))-97]++;
            }
        }
        System.out.println("Tenemos: ");
        for (int contador = 0; contador < letras.length; contador++){
            if (letras[contador] != 0){
                System.out.println(((char)(contador+97))+": "+letras[contador]);
            }
        }
    }
    
}
