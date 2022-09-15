package periodo2ex2;
public class Periodo2Ex2 {
    public static void main(String[] args) {
        // Programa Java para demostrar switch case
        // con tipo de datos primitivos (int)
        int day = 5;
        String dayString;
        // instrucción de switch con tipo de datos int
        switch (day){
    
        case 1: dayString = "Lunes";
                break;
        case 2: dayString = "Martes";   
                break;  
        case 3: dayString = "Miércoles";
                break;
        case 4: dayString = "Jueves";
                break;
        case 5: dayString = "Viernes";
                break;
        case 6: dayString = "Sábado";
                break;
        case 7: dayString = "Domingo";
                break;
        default: dayString = "Día inválido";
                break;
    }
    System.out.println(dayString);
}
        
}
