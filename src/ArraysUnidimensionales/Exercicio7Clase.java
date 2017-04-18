package ArraysUnidimensionales;

/**
 *
 * @author Santiago Losada Borrajo
 */
public class Exercicio7Clase {
    private String nombre;
    private double peso;
    private double altura; //Tiene que estar en metros.
    private double imc;
    
    public Exercicio7Clase(){}
    
    public Exercicio7Clase(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.imc = this.calcularIMC();
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
    
    public double calcularIMC(){
        imc = this.peso/(this.altura*this.altura);
        return imc;
    }
}
