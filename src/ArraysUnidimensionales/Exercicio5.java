/*
5.	Hacer un programa que simule el lanzamiento de un dado 10.000 veces. Almacenar en un vector de 6 posiciones el número de veces que salió cada tirada, escribiendo a continuación el número de veces que salió cada cara del dado. 

Calcular el tiempo que tarda en asignar al vector los 10.000 valores. Utilizar el método currentTimeMillis() de la clase System.

t0 = System.currentTimeMillis();
t1 = System.currentTimeMillis();
long tv = t1-t0;

 */
package ArraysUnidimensionales;

import java.util.Random;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio5 {

    public static void main(String[] args) {
        int[] dado = {1 ,2 ,3 ,4 ,5 ,6};
        int[] cantidad = new int[6];
        Random rnd = new Random();
        int random;
        double t0;
        double t1;
        double tv;            
        t0 = System.currentTimeMillis();
        //Bucle para sacar los 10000 numero aleatorios
        for (int contador = 0; contador < 10000; contador++) {
            random = rnd.nextInt(6);
            cantidad[random] = cantidad[random] + 1;
        }
        t1 = System.currentTimeMillis();
        tv = t1 - t0;
        //Muestre por pantalla del resultado
        System.out.println("Cada cara dio estos resultados : ");
        for (int contador = 0; contador < 6; contador++) {
            System.out.println("Para "+dado[contador]+" salieron "+cantidad[contador]);
        }
        System.out.println("\nEl proceso tardo "+tv);
    }
    
}
