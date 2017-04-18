package Class;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Alumno {
    private String nombre;
    private double peso;
    private double altura; //Tiene que estar en metros.

    
    public Alumno(){}
    
    public Alumno(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
        
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public String calcularIMC(){
        String frase = "";
        if (getIMC() < 17){
            frase ="IMC :Infrapeso";
            }
        if ((getIMC() >= 17) && (getIMC() < 18)){
            frase ="IMC :Baixo peso";
            }
        if ((getIMC() >= 18) && (getIMC() < 25)){
            frase ="IMC :Peso normal (Saudable)";
            }
        if ((getIMC() >= 25) && (getIMC() < 30)){
            frase ="IMC :Sobrepeso (Pre-obesidade)";
            }
        if ((getIMC() >= 30) && (getIMC() < 35)){
            frase ="IMC :Sobrepeso crónico (Obesidade grao I)";
            }
        if ((getIMC() >= 35) && (getIMC() < 40)){
            frase ="IMC :Sobrepeso crónico (Obesidade grao II)";
            }
        if (getIMC() >= 40){
            frase ="IMC :Sobrepeso crónico (Obesidade grao III)";
                    }
        return frase;
    }
    
    public double getIMC(){
        double imc = this.peso/(this.altura*this.altura);
        return imc;
    }
    
    public double mediaPeso(Alumno[] DAW){
        double sumaPesos = 0;
        int contador = 0;
        double mediaPesos;
        while (contador < DAW.length){
            sumaPesos = sumaPesos + DAW[contador].getPeso();
            contador++;
        }
        mediaPesos = sumaPesos / contador;
        return mediaPesos;
    }
    
    public double mediaAltura(Alumno[] DAW){
        double sumaAlturas = 0;
        int contador = 0;
        double mediaAlturas = 0;
        while (contador < DAW.length){
            sumaAlturas = sumaAlturas + DAW[contador].getAltura();
            contador++;
        }
        mediaAlturas = sumaAlturas / contador;
        return mediaAlturas;
    }
    
}
