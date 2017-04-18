/*
9)Fai un programa que lea un string e diga cantas lentras hai de cada,Suponse que son todas en minúsculas ou todas en maiusculas.
 */
package ArraysUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] cantidad = new int[26];
        String frase = "";
        String letra = "";
        System.out.print("Introduce frase a contabilizar: ");
        frase = leer.nextLine();
        for (int contador = 0; contador < frase.length(); contador++) {
            letra = "" + frase.charAt(contador);
            for (int pasador = 0; pasador < letras.length; pasador++) {
                if (letra.equalsIgnoreCase(letras[pasador]) == true){
                    cantidad[pasador]++;
                }
            }
        }
        System.out.println("Tenemos: ");
        for (int contador = 0; contador < letras.length; contador++){
            if (cantidad[contador] != 0){
                System.out.println(letras[contador]+": "+cantidad[contador]);
            }
        }
    }
    
}
