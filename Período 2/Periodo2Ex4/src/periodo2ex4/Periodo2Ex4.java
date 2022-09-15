package periodo2ex4;
public class Periodo2Ex4 {
    public static void main(String[] args) {
        // Programa Java para demostrar el uso de un
        // string para controlar una declaración switch
        String str = "dos";
        switch(str)
        {
            case "uno":
                System.out.println("uno");
                break;
            case "dos":
                System.out.println("dos");
                break;
            case "tres":
                System.out.println("tres");
                break;
            default:
                System.out.println("no coincide");
           
        }
    }
    
}
