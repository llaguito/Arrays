/*
4.	Hacer un programa  que dado un número de DNI obtenga la letra del NIF. La letra correspondiente a un número de DNI se calcula mediante el siguiente algoritmo. Se obtiene el
resto de dividir el número de DNI entre 23. El número resultante nos indica la posición de la letra correspondiente a ese DNI, en la siguiente cadena: 

Tabla de asignación
0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22
T	R	W	A	G	M	Y	F	P	D	X	B	N	J	Z	S	Q	V	H	L	C	K	E
No se utilizan las letras: I, Ñ, O, U.
La I y la O se evitan para evitar confusiones con otros caracteres, como 1, l ó 0.

NOTA: hacer este programa utilizando un vector para almacenar cada una de las letras de la tabla anterior.

 */
package ArraysUnidimensionales;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letra = {"T", "R" ,"W" ,"A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int dni;
        int mod;
        String nif;
        String nif2;
        System.out.print("Introduce tu numero de DNI : ");
        dni = sc.nextInt();
        mod = dni % 23;
        System.out.println("\n\nLa letra que pertenece a tu numero de DNI es : "+letra[mod]+"\nTu NIF es : "+dni+letra[mod]);
        nif = ""+dni+letra[mod];
        nif2 = ""+dni;
        

        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo=new File("texto.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir=new FileWriter(archivo,true);

            //Escribimos en el archivo con el metodo write 
            escribir.write(nif);
            escribir.write(nif2);

            //Cerramos la conexion
            escribir.close();
        }

        //Si existe un problema al escribir cae aqui
        catch(Exception e) {
            System.out.println("Error al escribir");
        }
    }
}
