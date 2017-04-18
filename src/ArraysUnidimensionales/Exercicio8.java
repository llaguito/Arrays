/*
8)Fai un programa que pida un tamaño de un array, despois solicite os números do mesmo e os mostre ordenados.
 */
package ArraysUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        int contador = 0;
        int auxiliar;
        System.out.print("¿Cual será el tamaño de la array? ");
        tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        while (contador < array.length){
            System.out.print("Introduce numero "+(contador+1)+": ");
            array[contador] = sc.nextInt();
            contador++;
        }
        for (int primero = 0;primero < array.length; primero++){
            for (int segundo = 0; segundo < array.length; segundo++){
                if (segundo == (array.length-1)){}
                else if (array[segundo] > array[segundo+1]){
                    auxiliar = array[segundo];
                    array[segundo] = array[segundo+1];
                    array[segundo+1] = auxiliar;
                }
                
            }
        }
        System.out.print("Array ordenada :");
        contador = 0;
        while ( contador < array.length ){
            System.out.print(array[contador]+" ");
            contador++;
        }
    }
    
}
