/*
2.	Hacer un programa que lea un numero cifra cifra y diga si el numero es capicúa.
 */
package ArraysUnidimensionales;

import static java.lang.String.valueOf;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        char letra;
        String num = "";
        String mun = "";
        System.out.println("Introduce numero a comprobar :");
        numero = sc.nextInt();
        num = valueOf(numero);
        for (int contador = 0; contador < (valueOf(numero)).length(); contador++){
            letra = num.charAt(contador);
            mun = letra + mun;
        }
        if (num.equalsIgnoreCase(mun) == true){
            System.out.println("El numero es capicúa.");
        }
        else {
            System.out.println("El numero no es capicúa.");
        }
    }
    
}
