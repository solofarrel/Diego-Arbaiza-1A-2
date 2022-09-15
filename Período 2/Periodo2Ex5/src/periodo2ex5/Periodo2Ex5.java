package periodo2ex5;
import java.util.Scanner;
public class Periodo2Ex5 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        System.out.println("Ingrese el número: ");
        int número;
        número = ingresar.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(número + " * " + i + " = " + número * i);
        }
    }
    
}
