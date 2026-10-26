import java.util.Scanner;
public class NotaNumerica {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double nota = 0.0;
        System.out.println("Introduzca una nota numérica");
        nota = sc.nextDouble();

        if (nota < 0.0 || nota > 10.0) 
            System.out.println("nota no válida");
        else {
            if (nota >= 9.0)
                System.out.println("Sobresaliente");
            else if (nota >= 7.00)
                System.out.println("Notable");
            else if (nota == 6.0)
                System.out.println("Bien");
            else if (nota >= 5.0)
                System.out.println("Aprobado");
            else if (nota >= 0.0)
                System.out.println("Suspendo");
            sc.close();
        }
    }    
}
