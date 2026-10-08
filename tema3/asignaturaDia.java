import java.util.Scanner;
public class asignaturaDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int asignatura;
      
        System.out.println("Introduzca un día de la semana: ");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("El lunes toca LMDAW a primera hora");
                break;
            case 2:
                System.out.println("El martes toca BDDAW a primera hora");
                break;
            case 3:
                System.out.println("El miércoles SIDAW a primera hora");
                break;
            case 4:
                System.out.println("El jueves toca PRDAW a primera hora");
                break;
            case 5:
                System.out.println("El viernes toca EDDAW a primera hora");
                break;
            default:
                System.out.println("El día introducido no es válido");
                System.exit(1);
        }
    }
}