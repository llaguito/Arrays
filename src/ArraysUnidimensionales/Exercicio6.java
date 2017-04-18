/*
6)Facer un programa para controlar a salud o estado de forma dos alumnos dunha clase a partir do seu IMC,Para o cual necesitas coñecer os seguintes datos: peso en kg e altura en metros.

    O programa preguntara primeiro os datos dos alumnos e despois sacara un informe do IMC de cada alumno informado do seu estado según a tabla da OMS .
•	16 a 17: Infrapeso
•	17 a 18: Baixo peso
•	18 a 25: Peso normal (Saudable)
•	25 a 30: Sobrepeso (Pre-obesidade)
•	30 a 35: Sobrepeso crónico (Obesidade grao I)
•	35 a 40: Obesidade premórbida (Obesidade grao II)
•	>40: Obesidade mórbida (Obesidade grao III)


Para facelo deberas empregar 3 matrices:
Nome Array de strig
Peso: Array de Double
Altura: Array de Double.
IMC: Array Double

 */
package ArraysUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.print("Introduce cantidad de alumnos : ");
        cantidad = sc.nextInt();
        String[] nombre = new String[cantidad];
        double[] peso = new double[cantidad];
        double[] altura = new double[cantidad];
        double[] imc = new double[cantidad];
        for (int contador = 0; contador < cantidad; contador++){
            System.out.println("Introducir datos del alumno numero "+(contador+1)+" : ");
            sc.nextLine();
            System.out.print("Nombre : ");
            nombre[contador] = sc.nextLine();
            System.out.print("Peso : ");
            peso[contador] = sc.nextDouble();
            System.out.print("Altura(en centimetros) : ");
            altura[contador] = sc.nextDouble()/100;
            imc[contador] = peso[contador] / (altura[contador]*altura[contador]);
        }
        System.out.println("\n\nDatos de los alumnos introducidos :");
        for (int contador = 0; contador < cantidad; contador++){
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
    }
    
}
