package ArraysUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio8otro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        int contador = 0;
        int contadorArray;
        int contador2;
        int contadorAux;
        int auxiliar;
        System.out.print("¿Cual será el tamaño de la array? ");
        tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        while (contador < array.length){
            System.out.print("Introduce numero "+(contador+1)+": ");
            array[contador] = sc.nextInt();
            if (contador > 0){
                contadorAux = contador;
                for (contadorArray = (contadorAux-1); contadorArray >= 0; contadorArray--) {
                    if (array[contadorAux] < array[contadorArray]){
                        auxiliar = array[contadorAux];
                        array[contadorAux] = array[contadorArray];
                        array[contadorArray] = auxiliar;
                        contadorAux--;
                    }
                }
            }
            contador++;
        }
        System.out.print("Array ordenada :");
        contador = 0;
        while ( contador < array.length ){
            System.out.print(array[contador]+" ");
            contador++;
        }
    }
}
