package periodo1ex6;
import java.util.Scanner;
public class Periodo1Ex6 {
    public static void main(String[] args) {
       Scanner Entrada = new Scanner (System.in);
       System.out.println("Ingrese la base: ");
       double base = Entrada.nextDouble();
       System.out.println("Ingrese el exponente: ");
       double exponente = Entrada.nextDouble();
       double resultado = Math.pow(base, exponente);
       System.out.println("El resultado es: "+ resultado);
       
    }
    
}
