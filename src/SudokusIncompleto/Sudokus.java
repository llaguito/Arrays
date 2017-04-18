package SudokusIncompleto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Sudokus {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int[] aux = new int[9];
        int[] comprueba = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] ejemplo = {{4, 1, 3, 8, 2, 5, 6, 7, 9}, {5, 6, 7, 1, 4, 9, 8, 3, 2}, {2, 8, 9, 7, 3, 6, 1, 4, 5}, {1, 9, 5, 4, 6, 2, 7, 8, 3}, {7, 2, 6, 9, 8, 3, 5, 1, 4}, {3, 4, 8, 5, 1, 7, 2, 9, 6}, {8, 5, 1, 6, 9, 4, 3, 2, 7}, {9, 7, 2, 3, 5, 8, 4, 6, 1}, {6, 3, 4, 2, 7, 1, 9, 5, 8}};
        for (int contadorFilas = 0; contadorFilas < ejemplo.length; contadorFilas++) {
            for (int contadorColumnas = 0; contadorColumnas < ejemplo[contadorFilas].length; contadorColumnas++) {
                System.out.print(ejemplo[contadorFilas][contadorColumnas]+" ");
            }
            System.out.print("\n");
        }
        
        boolean comprobar = true;
        int comprobacion = 0;
        while ((comprobar == true) || (comprobacion == 0)){
            
            //Comprueba Filas
            for (int contadorFilas = 0; contadorFilas < ejemplo.length; contadorFilas++) {
                for( int contadorColumnas = 0; contadorColumnas < ejemplo[contadorFilas].length; contadorColumnas++) {
                aux = comprueba; 
                    for (int contadorComprueba = 0; contadorComprueba < comprueba.length; contadorComprueba++) {
                        if (aux[contadorComprueba] == ejemplo[contadorFilas][contadorColumnas]){
                             aux[contadorComprueba] = 0;
                        }
                    }
                    for (int contadorAux = 0;contadorAux < aux.length; contadorAux++){
                        if(aux[contadorAux] != 0){
                            comprobar = false;
                        }
                    }
                }
            }
            if (comprobar == true){
                comprobacion++;
            }
            
            //Comprueba Columnas
            for (int contadorColumnas = 0; contadorColumnas < ejemplo[ejemplo.length - 1].length; contadorColumnas++) {
                for( int contadorFilas = 0; contadorFilas < ejemplo.length; contadorFilas++) {
                aux = comprueba; 
                    for (int contadorComprueba = 0; contadorComprueba < comprueba.length; contadorComprueba++) {
                        if (aux[contadorComprueba] == ejemplo[contadorFilas][contadorColumnas]){
                             aux[contadorComprueba] = 0;
                        }
                    }
                    for (int contadorAux = 0;contadorAux < aux.length; contadorAux++){
                        if(aux[contadorAux] != 0){
                            comprobar = false;
                        }
                    }
                }
            }
            
            //Comprueba Regiones
            
        }
        
        if (comprobar == false){
            System.out.print("NO");
        }
        else{
            System.out.print("SI");
        }
    }
}