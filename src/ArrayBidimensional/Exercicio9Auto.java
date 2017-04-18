package ArrayBidimensional;

import Class.Carton;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio9Auto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int jugadores;
        System.out.print("Introduce numero de jugadores : ");
        jugadores = leer.nextInt();
        
        Carton[] jugador = new Carton[jugadores];
        for ( int contador = 0; contador < jugador.length; contador++) {
            jugador[contador] = new Carton();            
        }
        
        for (int contadorPrimera = 0; contadorPrimera < jugador.length; contadorPrimera++) {
            jugador[contadorPrimera].imprimirPrimera();
            System.out.print("     ");
            }
        System.out.print("\n");                    
        for (int contadorSegunda = 0; contadorSegunda < jugador.length; contadorSegunda++) {          
            jugador[contadorSegunda].imprimirSegunda();
            System.out.print("     ");
        }
        System.out.print("\n");
        for (int contadorTercera = 0; contadorTercera < jugador.length; contadorTercera++) {
            jugador[contadorTercera].imprimirTercera();
            System.out.print("     ");
        }
        System.out.print("\n");
        
        int numero = 0;
        int contalinea = 0;
        int linea = 0;
        int contabingo = 0;
        int bingo = 0;
        int contadorJugador;
        int[] bombo = new int[100];
        int contador = 0;
        while ((contador < bombo.length) && (bingo == 0)) {
        //for (int contador = 0; contador < bombo.length; contador++ ) {
            boolean comprobarNumero = false;            
            while (comprobarNumero == false) {
                numero = aleatorio.nextInt(99) + 1;
                int contador1 = 0;
                while ((bombo[contador1] != numero) && (contador1 <= contador)){
                    contador1++;
                }
                if (bombo[contador1] != numero) {
                    comprobarNumero = true;
                }
            }
            bombo[contador] = numero;
        
            for (contadorJugador = 0; contadorJugador < jugador.length; contadorJugador++){
                jugador[contadorJugador].tacharNumero(numero);
                if ( contalinea == 0){
                    if ((jugador[contadorJugador].ganadorL1() == true) || (jugador[contadorJugador].ganadorL2() == true) || (jugador[contadorJugador].ganadorL3() == true)) {
                        contalinea++;
                        linea = contadorJugador + 1;
                        System.out.print("\nLinea para el jugador "+linea);
                    }
                }
                if ( contalinea == 1) {
                    if ( contabingo == 0) {
                        if (jugador[contadorJugador].ganador() == true){
                            bingo = contadorJugador + 1;
                            System.out.print("\nBingo para el jugador "+bingo);
                            contabingo++;
                        }
                    }
                }
            }
        contador++;
        }
        System.out.print("\n\n");
        for (int contadorPrimera = 0; contadorPrimera < jugador.length; contadorPrimera++) {
            jugador[contadorPrimera].imprimirPrimera();
            System.out.print("     ");
            }
        System.out.print("\n");                    
        for (int contadorSegunda = 0; contadorSegunda < jugador.length; contadorSegunda++) {          
            jugador[contadorSegunda].imprimirSegunda();
            System.out.print("     ");
        }
        System.out.print("\n");
        for (int contadorTercera = 0; contadorTercera < jugador.length; contadorTercera++) {
            jugador[contadorTercera].imprimirTercera();
            System.out.print("     ");
        }
    }    
}
