/*
9)Fai un programa que simule un bingo, ten en conta o seguinte:
1) Un bingo e un bombo do que se extraen bolas de forma aleatoria do 1 o 99 (ambos inclusive) e sin repetición.
2)Cada xogadar tera un carton composto por 15 numeros aleatorios do 1 0 99, podera haber tantos xogadores como se queira (limite 100)
3)Cada vez que se extraía unha bola do bombo tera que mostrar en pantalla o numero que sacou e os números que quedan en cada carton.
4)habrá que avisar cando un xogador canta línea.
Sexerencias:
Int[] números =new int[100]   Array onde gardaremos os números que se van sacando do bombo, de forma que cada numero que salga do bombo funcione como índice do arrary números.
    X =numero aleatorio entre 1-99     Si x=9
   Numero[x]++;                                      Estaremos incremantando a posición números[9]
    De esta forma para ver si o numero e repetido bastara con buscar si Numero[x] e distinto de 0.
Para controlar as líneas supor que os 5 primeiros números do array carton se corresponden ca 1 linea os 5 seguintes ca 2 etc etc.
Para controlar os números que quedan en cada carton o mais comodo seria ir pondo a cero aquelas posicions que contoñen ese numero.

 */
package ArrayBidimensional;

import Class.Carton;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int jugadores;
        int respuesta;
        int juega = 0;
        int carton = 0;
        int numero1 = 0;
        System.out.print("Introduce numero de jugadores : ");
        jugadores = leer.nextInt();
        Carton[] jugador = new Carton[jugadores];
        for ( int contador = 0; contador < jugador.length; contador++) {
            jugador[contador] = new Carton();            
        }
        String[] menu = {"Ver un cartón", "Ver todos los cartones", "Continuar", "Tachar Número", "Cantar Linea", "Cantar BINGO", "Terminar Juego"};

        int numero = 0;
        int[] bombo = new int[100];
        
        for (int contador = 0; contador < bombo.length; contador++ ) {
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
        
            System.out.print("\n\nEl numero que salio del Bombo es : "+numero);
            System.out.print("\n");
            respuesta = 1;
            while (( respuesta == 1) || (respuesta == 2) || ( respuesta == 4) || ( respuesta == 5) || ( respuesta == 6)) {
                System.out.print("\nMenú :");
                for (int conta = 0; conta < menu.length; conta++){
                    numero1 = conta + 1;
                    System.out.print("\n"+numero1+" "+menu[conta]);
                }
                System.out.print("\n\n¿Que escoges?   ");
                respuesta = leer.nextInt();
                if (respuesta == 1) {
                    System.out.print("\nCarton del jugador que desea ver : ");
                    carton = leer.nextInt();
                    jugador[carton-1].imprimirCarton();
                }
                /*if (respuesta == 2) {
                    for (int contador1 = 0; contador1 < jugadores; contador1++) {
                        System.out.print("\n");
                        jugador[contador1].imprimirCarton();
                    }
                }*/
                if (respuesta == 2) {
                    System.out.print("\n");
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
                }
                if (respuesta == 4) {                    
                    System.out.print("\nCarton del jugador que desea ver : ");
                    carton = leer.nextInt();
                    jugador[carton-1].tacharNumero(numero);
                    jugador[carton-1].imprimirCarton();
                }
                if (respuesta == 5) {
                    int linea = 0;
                    System.out.print("\n¿Que jugador eres?  ");
                    juega = leer.nextInt(); 
                    if (linea != 0){
                        System.out.print("Ya se ha cantado Linea");
                    }
                    else {
                        if ((jugador[juega-1].ganadorL1() == true) || (jugador[juega-1].ganadorL2() == true) || (jugador[juega-1].ganadorL3() == true)) {
                            System.out.print("\nLINEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                            linea++;
                        }
                        else {
                            System.out.print("\nNo seas tramposo.");
                        }
                    }
                    
                }
                if (respuesta == 6) {
                    System.out.print("\n¿Que jugador eres?  ");
                    juega = leer.nextInt();
                    if (jugador[juega-1].ganador() == true){
                        System.out.print("\nBINGOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                        contador = 101;
                    }
                    else {
                        System.out.print("\nNo seas tramposo.");                        
                    }
                }
                if (respuesta == 7){
                    contador = 101;
                }
            }
        }
    }
}  