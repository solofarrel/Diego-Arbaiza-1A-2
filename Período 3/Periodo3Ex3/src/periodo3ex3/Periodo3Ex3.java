package periodo3ex3;

import java.util.Scanner;

public class Periodo3Ex3 {
    public static void main(String[] args) {
       
        Scanner objeto = new Scanner (System.in);
        int valor, conteo = 0;
        double suma = 0;
        boolean seguir = false;
        
        while(!(seguir))
        {
        System.out.println("Ingresar un valor entero, el proceso finalizará cuando ingrese un múltiplo de 8");
        valor = objeto.nextInt();
        
            if ((valor%8)==0)
            {
             seguir=true;
            }
            else
            {
                System.out.println("♡♡♡ chao, lea indicaciones ♡♡♡");
            }
        }
    }
    
}
