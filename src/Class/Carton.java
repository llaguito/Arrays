package Class;

import java.util.Random;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Carton {
    private int[] numeros = new int [15];

    
    public Carton() {
        int numero;
        Random aleatorio = new Random();
        for (int contador = 0; contador < numeros.length; contador++ ) {
            numero = aleatorio.nextInt(99) + 1;
            while (comprobarNumero(numero) == true) {
                numero = aleatorio.nextInt(99) + 1;               
            }
            this.numeros[contador] = numero;
        }
    }
        
    public boolean comprobarNumero(int numero) {
        boolean comprobarNumero = false;
        for (int contador = 0; contador < numeros.length; contador++){
            if (numero == numeros[contador]) {
                comprobarNumero = true;
            }
        }
        return comprobarNumero;
    }    
    
    public boolean ganador () {
        boolean ganador = true;
        int contador = 0;
        while ((contador < numeros.length) && (ganador == true)){
            if (numeros[contador] == 0) {
                ganador = true;
            }
            else {
                ganador = false;
            }
        contador++;
        }
        return ganador;
    }
    
    /*public boolean ganador () {
        boolean ganador = false;
        for (int contador = 0; contador < numeros.length; contador++) {
            if (numeros[contador] == 0) {
                ganador = true;
            }
            else {
                ganador = false;
            }
        }
        return ganador;
    }*/
    
    public void imprimirPrimera() {
        for (int contador = 0; contador < 5; contador++){
            if (this.numeros[contador] < 10){
                System.out.print(" ");
            }
            if (this.numeros[contador] == 0){
                System.out.print("X ");
            }
            else {
                System.out.print(this.numeros[contador]+" ");
            }
        }        
    }

    public void imprimirSegunda() {
        for (int contador = 5; contador < 10; contador++){
            if (this.numeros[contador] < 10){
                System.out.print(" ");
            }
            if (this.numeros[contador] == 0){
                System.out.print("X ");
            }
            else {
                System.out.print(this.numeros[contador]+" ");
            }
        }        
    }
    
    public void imprimirTercera() {
        for (int contador = 10; contador < 15; contador++){
            if (this.numeros[contador] < 10){
                System.out.print(" ");
            }
            if (this.numeros[contador] == 0){
                System.out.print("X ");
            }
            else {
                System.out.print(this.numeros[contador]+" ");
            }
        }        
    }
    
    public boolean ganadorL1 () {
        boolean ganador = true;
        int contador = 0;
        while ((contador < 5) && (ganador == true)){
            if (numeros[contador] == 0) {
                ganador = true;
            }
            else {
                ganador = false;
            }
        contador++;
        }
        return ganador;
    }
 
    public boolean ganadorL2 () {
        boolean ganador = true;
        int contador = 5;
        while ((contador < 10) && (ganador == true)){
            if (numeros[contador] == 0) {
                ganador = true;
            }
            else {
                ganador = false;
            }
        contador++;
        }
        return ganador;
    }
   
    public boolean ganadorL3 () {
        boolean ganador = true;
        int contador = 10;
        while ((contador < 15) && (ganador == true)){
            if (numeros[contador] == 0) {
                ganador = true;
            }
            else {
                ganador = false;
            }
        contador++;
        }
        return ganador;
    }
    
    /*public boolean ganadorL1 () {
        boolean ganador = false;
        for (int contador = 0; contador < 5; contador++) {
            if (numeros[contador] == 0) {
                ganador = true;
            }
            else {
                ganador = false;
            }
        }
        return ganador;
    }
    
    public boolean ganadorL2 () {
        boolean ganador = false;
        for (int contador = 5; contador < 10; contador++) {
            if (numeros[contador] == 0) {
                ganador = true;
            }
            else {
                ganador = false;
            }
        }
        return ganador;
    }
    
    public boolean ganadorL3 () {
        boolean ganador = false;
        for (int contador = 10; contador < 15; contador++) {
            if (numeros[contador] == 0) {
                ganador = true;
            }
            else {
                ganador = false;
            }
        }
        return ganador;
    }*/
    
    public void cambiarNumero(int numero) {
        for (int contador = 0; contador < numeros.length; contador++){
            if (numero == numeros[contador]) {
                numeros[contador] = 0;
            }
        }
    }
    
    public void imprimirCarton () {
        System.out.print("\n");
        for (int contador = 0; contador < numeros.length; contador++){
            if (this.numeros[contador] < 10){
                System.out.print(" ");
            }
            if (this.numeros[contador] == 0){
                System.out.print("X ");
            }
            else {
                System.out.print(this.numeros[contador]+" ");
            }
            if ((contador+1)%5 == 0){
                System.out.print("\n");
            }
        }
    }
   
    public void tacharNumero(int numero) {
        for (int contador = 0; contador < numeros.length; contador++){
            if (numero == numeros[contador]){
                numeros[contador] = 0;
            }
        }
    }
        
}
