/*
7)Modifica o exercicio 6 para que funcione do seguinte xeito:

O arrancar o programa debe mostrar un menú cas seguintes opcions
1-Introducir Datos alumno
2-Ver datos alumno (consulta por nome)
3-Listado IMC clase
5-Media Altura clase
6-Media peso clase
7-Salir

Cada vez que se realiza una opción do menú ten que volver a sair o menú, ata que se pulse na opción de sair.

 */
package ArraysUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        String[] nombre = {"Santiago", "Alexis", "Manuel", "Carlos", "Xabier", "Alan", "Boris", "Ismael"};
        double[] peso = {90, 70, 85, 70, 82, 95, 70, 80};
        double[] altura = {1.83 ,1.64 ,1.85 ,1.75 ,1.87 , 1.84 ,1.78 ,1.86};
        double[] imc = new double[8];
        int contador = 0;
        while(contador < 8){
            imc[contador] = peso[contador] / (altura[contador]*altura[contador]);
            contador++;
        }
        String n = "";
        String contesta = "";
        String[] menu = {"Introducir Datos del Alumno" ,"Ver datos de un alumno (consulta por nombre)" ,"Listado IMC clase" ,"Media Altura clase" ,"Media peso clase" ,"salir"};
        while (respuesta != 6){
            System.out.print("\nMenú :\n1-"+menu[0]+"\n2-"+menu[1]+"\n3-"+menu[2]+"\n4-"+menu[3]+"\n5-"+menu[4]+"\n6-"+menu[5]+"\n\nOPCION :");
            respuesta = sc.nextInt();
            
            if ( respuesta == 1){
                System.out.println("ERROR");
                System.out.print("Funcion no disponible, introduce otra opcion del menú : ");
                respuesta = sc.nextInt();
            }
            
            sc.nextLine();
            
            if ( respuesta == 2){
                System.out.print("\nIntroduce nombre de alumno a buscar : ");
                n = sc.nextLine();
                contador = 0;
                while ( nombre[contador].equalsIgnoreCase(n) != true){
                    contador++;
                }
                System.out.println("Nombre :"+nombre[contador]+"\nPeso :"+peso[contador]+"\nAltura :"+altura[contador]+"m");
                if (imc[contador] < 17){
                    System.out.print("IMC :Infrapeso");
                }
                if ((imc[contador] >= 17) && (imc[contador] < 18)){
                    System.out.print("IMC :Baixo peso");
                }
                if ((imc[contador] >= 18) && (imc[contador] < 25)){
                    System.out.print("IMC :Peso normal (Saudable)");
                }
                if ((imc[contador] >= 25) && (imc[contador] < 30)){
                    System.out.print("IMC :Sobrepeso (Pre-obesidade)");
                }
                if ((imc[contador] >= 30) && (imc[contador] < 35)){
                    System.out.print("IMC :Sobrepeso crónico (Obesidade grao I)");
                }
                if ((imc[contador] >= 35) && (imc[contador] < 40)){
                    System.out.print("IMC :Sobrepeso crónico (Obesidade grao II)");
                }
                if (imc[contador] >= 40){
                    System.out.print("IMC :Sobrepeso crónico (Obesidade grao III)");
                }
            }
      
            if ( respuesta == 3){
                contador = 0;
                while (contador < imc.length){
                    System.out.print("Nombre :"+nombre[contador]+" ;IMC :"+imc[contador]);
                    if (imc[contador] < 17){
                        System.out.print(" - Infrapeso\n");
                    }
                    if ((imc[contador] >= 17) && (imc[contador] < 18)){
                        System.out.print(" - Baixo peso\n");
                    }
                    if ((imc[contador] >= 18) && (imc[contador] < 25)){
                        System.out.print(" - Peso normal (Saudable)\n");
                    }
                    if ((imc[contador] >= 25) && (imc[contador] < 30)){
                        System.out.print(" - Sobrepeso (Pre-obesidade)\n");
                    }
                    if ((imc[contador] >= 30) && (imc[contador] < 35)){
                        System.out.print(" - Sobrepeso crónico (Obesidade grao I)\n");
                    }
                    if ((imc[contador] >= 35) && (imc[contador] < 40)){
                        System.out.print(" - Sobrepeso crónico (Obesidade grao II)\n");
                    }
                    if (imc[contador] >= 40){
                        System.out.print(" - Sobrepeso crónico (Obesidade grao III)\n");
                    }
                    contador++;
                }
            }
            
            if ( respuesta == 4){
                contador = 0;
                double sumaAlturas = 0;
                double mediaAltura;
                while (contador < altura.length){
                    sumaAlturas = sumaAlturas + altura[contador];
                    contador++;
                }
                mediaAltura = sumaAlturas / contador;
                System.out.println("La media de las alturas es :"+mediaAltura);
            }            
            
            if ( respuesta == 5){
                contador = 0;
                double sumaPesos = 0;
                double mediaPeso;
                while (contador < peso.length){
                    sumaPesos = sumaPesos + peso[contador];
                    contador++;
                }
                mediaPeso = sumaPesos / contador;
                System.out.println("La media de los pesos es :"+mediaPeso);
            }
            System.out.println("\n\n¿Desea continuar? Si/No ");
            contesta = sc.nextLine();
            if (contesta.equalsIgnoreCase("NO") == true){
                respuesta = 6;
            }
        }
    }
    
}
