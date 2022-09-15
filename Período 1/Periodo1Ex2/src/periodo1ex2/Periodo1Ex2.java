package periodo1ex2;
import java.util.Scanner;
public class Periodo1Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int número1; // primer número a comparar
        
        System.out.print("Escriba el primer entero: "); // indicador
        número1 = entrada.nextInt(); // lee el primer número del usuario
        
        
        if (número1 >= 100){
        System.out.println("El número " + número1 + " es mayor o igual a 100");
        }
        else if (número1 >= 50){
            System.out.println("El número " + número1 + " es mayor o igual a 50 pero menor que 100");
        }
        else if (número1 >= 0){
            System.out.println("El número " + número1 + " es mayor o igual a 50 pero menor que 50");
        } else {
            System.out.println("El número " + número1 + " es menor que 0");
        }

        }
    
}
