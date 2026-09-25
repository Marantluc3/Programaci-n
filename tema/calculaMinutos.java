import java.util.Scanner;
public class calculaMinutos {
public static void main(String[] args) {
    int segundos;
    int minutos;
    int segundosRestantes;
    Scanner sc = new Scanner (System.in);
    //Mostramos en pantalla
    System.out.println("calculamos el nº de minutos y segundos, dada una cantidad de segundos");
    System.out.println("--------------------------------------------------------------");
    System.out.println("Introduce el nº de segundos");
    //Leemos desde teclado
    segundos =sc.nextInt();

    //Calculamos
    minutos= segundos/60; //Calculamos en nº de minutos
    segundosRestantes= minutos%60; //calcula el nº de segundos restantes
    //Mostramos el resultado
    System.out.println("el nº de minutos es" + minutos + " y el nº de segundos restantes es" + segundosRestantes);
}
}
