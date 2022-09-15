package periodo1ex1;
import java.util.Scanner; // el programa usa la clase Scanner
public class Periodo1Ex1 {
    public static void main(String[] args) {
        // TODO code application logic here
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner (System.in);
        
        int número1; // primer número a comparar
        int número2; // segundo número a comparar
        
        System.out.print("Escriba el primer entero: "); // indicador
        número1 = entrada.nextInt(); // lee el primer número del usuario
        
        System.out.print("Escriba el segundo entero: "); // indicador 
        número2 = entrada.nextInt(); // lee el segundo número del usuario
        
        if (número1 == número2)
        System.out.println("El número " + número1 + " es igual a " + número2);
        
        if (número1 != número2)
        System.out.println("El número " + número1 + " es distinto a " + número2);
        
        if (número1 < número2)
        System.out.println("El número " + número1 + "es menor a " + número2);
        
        if (número1 > número2)
        System.out.println("El número " + número1 + " es mayor a " + número2);
        
        if (número1 <= número2)
        System.out.println("El número " + número1 + " es menor o igual a " + número2);
        
        if (número1 >= número2)
        System.out.println("El número " + número1 + " es mayor o igual a " + número2);
        
    }
    
}
