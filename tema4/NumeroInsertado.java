import java.util.Scanner; 
public class NumeroInsertado {
    public static void main(String[] args) {
        String num;
        int p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un nº entero positivo: ");
        num = sc.next();
        System.out.println("Introduzca la posición a partir de la cual quiere partir el nº: ");
        p = sc.nextInt();
        System.out.println("Los números partidos son el " + num.substring(0, p) +" y el " + num.substring(p));
        sc.close();
    }
}
