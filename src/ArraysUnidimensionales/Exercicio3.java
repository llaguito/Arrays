/*
3.	Almacenar en un vector 5 numeros enteros leidos por teclado. Leer a continuación otro número y comprobar si está en el vector o no. En el caso de que esté visualizar que posición ocupa; sino indicarlo mediante un mensaje. Visualizar tambien el elemento más pequeño, el más grande y la posición de ambos. 
 */
package ArraysUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numeros = {"Primer", "Segundo", "Tercero", "Cuarto", "Quinto"};
        int[] numero = new int[5];
        int num;
        int contador;
        int posicion = 0;
        int max;
        int min;
        int posicionMin = 0;
        int posicionMax = 0;
        boolean verificar = false;
        for (contador = 0; contador < numero.length; contador++) {
            System.out.print("Introduce "+numeros[contador]+" número para introducir en el vector :");
            numero[contador] = sc.nextInt();
        }
        System.out.print("Introduce número a comprobar : ");
        num = sc.nextInt();
        for (contador = 0; contador < numero.length; contador++) {
            if (num == numero[contador]){
                posicion = contador;
                verificar = true;
            }
        }
        if (verificar == true){
            System.out.println("El número aparece en el vector en "+numeros[posicion]+" lugar.");
        }
        else {
            System.out.println("El número no aparece en el vector.");
        }
        max = numero[0];
        min = numero[0];
        for (contador = 0; contador < numero.length; contador++){
            if (numero[contador] > max){
                max = numero[contador];
                posicionMax = contador;
            }
            else if (numero[contador] < min) {
                min = numero[contador];
                posicionMin = contador;
            }
        }
        System.out.println("El más pequeño es el "+numero[posicionMin]+" que es el "+numeros[posicionMin]+" lugar.");
        System.out.println("El más grande es el "+numero[posicionMax]+" que es el "+numeros[posicionMax]+" lugar.");
    }
}