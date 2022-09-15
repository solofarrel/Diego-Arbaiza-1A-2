package periodo2ex3;
public class Periodo2Ex3 {
    public static void main(String[] args) {
        // programa de Java para demostrar
        // declaraciones switch case anidadas
        String Branch = "CSE";
        int year = 2;
        
        switch(year)
        {
            case 1:
                System.out.println("Cursos electivos: Inglés, Cálculo");
                break;
            case 2:
                switch (Branch) // switch anidado
                {
                    case "CSE":
                    case "CCE":
                        System.out.println("Cursos electivo : Machine Learning, Big Data");
                    break;
                    
                    case "ECE":
                        System.out.println("Cursos electivos : Programación");
                    break;
                    
                    default:
                        System.out.println("Cursos electivos : Ingeniería de Software");
                    
                    
                }
        }
    }
    
}
