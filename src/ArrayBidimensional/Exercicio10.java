/*
10)Fai un  programa onde definas un array que permita gardar os pesos dos alumnos das clases do instituto:

   DAM1: 55,56,88,105,48,59,77,75,66
   DAM2:55,66,77,88,99
   DAW: 88,78,76,79,
   DAW2:99,98,97,94,95,96,92,91,108
   ENFERMERIA: 50,51,52,53,56,49,4548,47,48,50,52,44
      Crea tamen un array no que se garde os nomes das clases que se pedirá por teclado, e despois mostra a media de peso de cada clase xunto co seu nome e a media total.

 */
package ArrayBidimensional;

import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] pesos = {{55, 56, 88, 105, 48, 59, 77, 75, 66},{55, 66, 77, 88, 99}, {88, 78, 76, 79, 88}, {50, 51, 52, 53, 56, 49, 45, 48, 47, 48, 50, 52, 44}};
        String[] clases = {"DAM1", "DAM2", "DAW1", "DAW2", "ENFERMERIA"};
        String[] menu = {"1 Introducir peso", "2 Ver pesos de una clase y media de los pesos","3 Ver media total", "4 Terminar proceso"};
        
        int respuesta = 0;
        int contadorClase;
        int nuevoPeso;
        int contador0 = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int sumaPesos;
        int contadorMedia = 0;
        int mediaPesos;
        
        while ( respuesta != 3) {
            
            for(int contador = 0; contador < menu.length; contador++){
                System.out.print("\n\n"+menu[contador]);
            }
            System.out.print("\n\n¿Que opción escoges?  ");
            respuesta = leer.nextInt() - 1;
            
            switch (respuesta) {
                
                case 0 :
                    System.out.print("\nClases : ");
                    for ( int contador = 0; contador < clases.length; contador++){
                        System.out.print("\n"+(contador + 1)+" "+clases[contador]);
                    }
                    System.out.print("\n¿Para que clase vas introducir un peso?  ");
                    contadorClase = leer.nextInt() - 1;
                    System.out.print("\n¿Que peso introduces?  ");
                    nuevoPeso = leer.nextInt();
                    switch (contadorClase){
                        
                        case 0 :
                            pesos[contadorClase][contador0] = nuevoPeso;
                            contador0++;
                            break;
                            
                        case 1 :
                            pesos[contadorClase][contador1] = nuevoPeso;
                            contador1++;
                            break;
                            
                        case 2 :
                            pesos[contadorClase][contador2] = nuevoPeso;
                            contador2++;
                            break;
                           
                        case 3 :
                            pesos[contadorClase][contador3] = nuevoPeso;
                            contador3++;
                            break;
                           
                        case 4 :
                            pesos[contadorClase][contador4] = nuevoPeso;
                            contador4++;
                            break;
                    }
                    break;
                    
                case 1 :
                    sumaPesos = 0;
                    System.out.print("\n¿Que clase quieres ver la media?  ");
                    contadorClase = leer.nextInt() - 1;
                    System.out.print("\nLos pesos de la clase "+clases[contadorClase]);
                    for (int contador = 0; contador < pesos[contadorClase].length; contador++){
                        if (pesos[contadorClase][contador] != 0){
                            sumaPesos = sumaPesos + pesos[contadorClase][contador];
                            contadorMedia++;
                            System.out.print(" "+ pesos[contadorClase][contador]);
                        }
                    }
                    System.out.print("\nLa media de pesos es "+(sumaPesos/contadorMedia));
                    break;
                
                case 2 :
                    sumaPesos = 0;
                    for (int contador = 0; contador < pesos.length; contador++) {
                        for (int conta = 0; conta < pesos[contador].length; conta++) {
                            if (pesos[contador][conta] != 0){
                                sumaPesos = sumaPesos + pesos[contador][conta];
                                contadorMedia++;
                            }
                        }
                    }
                    System.out.print("\nLa media de pesos es "+(sumaPesos/contadorMedia)+"\n");
                    
                case 3 :
                    respuesta = 3;
                    break;
            }
        }
    }
    
}
