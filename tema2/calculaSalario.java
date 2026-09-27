import java.util.Scanner;
public class calculaSalario {
public static void main(String[] args) {
    int horas;
    int salario;
    Scanner sc = new Scanner (System.in);
    //Mostramos en pantalla
    System.out.println("Introduce el nº de horas trabajadas en la semana");
    //Leemos desde teclado
    horas =sc.nextInt();

    //Calculamos
    salario = horas * 12; //Calculamos las horas multiplicadas por 12
    //Mostramos el resultado
    System.out.println("el salario semanal es: " + salario + "euros");
}
}