/*
1.	Hacer un programa que almacene en un vector de 5 elementos las ventas anuales de cada una de las 5 tiendas de una cadena de supermercados (asignárselos al vector al declararlo). A continuación calcular cuál fue la tienda que menos vendió, cuál fue la que más vendió y el importe total de ventas de las 5 tiendas.
 */
package ArraysUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tienda = {"Pepito", "Antonio", "Jesusito", "Manolete", "Paco"};
        int[] ventas = new int[5];
        int importeTotal = 0;
        int max;
        int min;
        int posicionMax = 0;
        int posicionMin = 0;
        for (int contador = 0; contador < ventas.length; contador++){
            System.out.println("Introduce ventas anuales de la tienda de "+tienda[contador]+" :");
            ventas[contador] = sc.nextInt();
        }
        max = ventas[0];
        min = ventas[0];
        for (int contador = 0; contador < ventas.length; contador++){
            if (ventas[contador] > max){
                max = ventas[contador];
                posicionMax = contador;
            }
            else if (ventas[contador] < min) {
                min = ventas[contador];
                posicionMin = contador;
            }
        }
        System.out.println("La tienda que menos vendió fue la de "+tienda[posicionMin]+" y la que más vendió "+tienda[posicionMax]+".");
        for (int contador = 0; contador < ventas.length; contador++){
            importeTotal = importeTotal + ventas[contador];
        }
        System.out.println("El importe total anual de las ventas es : "+importeTotal);
    
    }
    
}
