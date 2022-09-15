package periodo1ex7;
import java.util.Scanner;
public class Periodo1Ex7 {
    public static void main(String[] args) {
    String nombre,clave;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese nombre de usuario");
    nombre = entrada.nextLine();
    System.out.print("Ingrese clave de usuario");
    clave = entrada.nextLine();
    if(nombre.equals(" Juan ") & clave.equals(" 123456 ")){
    System.out.println("Bienvenido al Sistema");
    }
    else{
    System.out.println("Nombre de Usuario o contraseña Incorrecto");
    }
    }
    
}
