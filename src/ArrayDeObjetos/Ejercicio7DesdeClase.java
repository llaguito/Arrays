/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayDeObjetos;

import Class.Alumno;
import java.util.Scanner;

/**
 *
 * @author DAW116
 */
public class Ejercicio7DesdeClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Cuantos alumnos vas introducir: ");
        int numero = leer.nextInt();
        Alumno[] DAW = new Alumno[numero];
        String n = "";
        String contesta = "";
        int respuesta = 0;
        int contador2;
        int contador1 = 0;
        String[] menu = {"Introducir Datos del Alumno" ,"Ver datos de un alumno (consulta por nombre)" ,"Listado IMC clase" ,"Media Altura clase" ,"Media peso clase" ,"salir"};
        while (respuesta != 6){
            System.out.print("\nMenú :\n1-"+menu[0]+"\n2-"+menu[1]+"\n3-"+menu[2]+"\n4-"+menu[3]+"\n5-"+menu[4]+"\n6-"+menu[5]+"\n\nOPCION :");
            respuesta = leer.nextInt();
            
            switch (respuesta) {
                case 1 :
                    Alumno nuevo = new Alumno();
                    System.out.println("Introduce el nombre");
                    nuevo.setNombre(leer.next());
                    System.out.println("Introduce el peso");
                    nuevo.setPeso(leer.nextDouble());
                    System.out.println("Introduce la altura (en metros)");
                    nuevo.setAltura(leer.nextDouble());
                    DAW[contador1] = nuevo;
                    contador1++;
                    System.out.println("\n\n¿Desea continuar? Si/No ");
                    contesta = leer.next();
                    if (contesta.equalsIgnoreCase("NO") == true){
                        respuesta = 6;
                    }
                    break;

                case 2:
                    System.out.print("\nIntroduce nombre de alumno a buscar : ");
                    n = leer.next();
                    contador2 = 0;
                    while ( DAW[contador2].getNombre().equalsIgnoreCase(n) != true){
                        contador2++;
                    }
                    System.out.println("\nNombre :"+DAW[contador2].getNombre()+"\nPeso :"+DAW[contador2].getPeso()+"\nAltura :"+DAW[contador2].getAltura()+"m \n"+DAW[contador2].calcularIMC());
                    System.out.println("\n\n¿Desea continuar? Si/No ");
                    contesta = leer.next();
                    if (contesta.equalsIgnoreCase("NO") == true){
                        respuesta = 6;
                    }
                    break;
      
                case 3:
                    contador2 = 0;
                    while (contador2 < DAW.length){
                        System.out.print("\nNombre :"+DAW[contador2].getNombre()+"\n"+DAW[contador2].calcularIMC()+"\n");
                        contador2++;
                    }
                    System.out.println("\n¿Desea continuar? Si/No ");
                    contesta = leer.next();
                    if (contesta.equalsIgnoreCase("NO") == true){
                        respuesta = 6;
                    }
                    break;

                case 4:
                    System.out.println("La media de las alturas es :"+DAW[0].mediaAltura(DAW));
                    System.out.println("\n\n¿Desea continuar? Si/No ");
                    contesta = leer.next();
                    if (contesta.equalsIgnoreCase("NO") == true){
                        respuesta = 6;
                    }
                    break;
            
                case 5:
                    System.out.println("La media de los pesos es :"+DAW[0].mediaPeso(DAW));
                    System.out.println("\n\n¿Desea continuar? Si/No ");
                    contesta = leer.next();
                    if (contesta.equalsIgnoreCase("NO") == true){
                        respuesta = 6;
                    }
                    break;
                    
                case 6:
                    break;
            }       
        }
    
    }
}