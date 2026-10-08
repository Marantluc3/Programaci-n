import java.util.Scanner;
public class educado {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("Introducce una hora del día: ");
        hora = sc.nextInt();
        if (hora >= 6 && hora <= 12) 
            System.out.println("Buenos días");

            else if(hora >= 13 && hora <= 20)
                System.out.println("Buenas tardes");
            else if (hora >= 21 && hora <= 24 || hora >= 0 && hora <= 5)
                System.out.println("Buenas noches");
    
    sc.close();
        }
    }
