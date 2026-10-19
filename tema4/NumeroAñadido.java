import java.util.Scanner; 
public class NumeroAñadido {
    public static void main(String[] args) {
        String num;
        int p;
        String digito;
        int indice;
        String resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un nº entero positivo: ");
        num = sc.next();
        System.out.println("Introduzca la posición a partir de la cual quiere partir el nº: ");
        p = sc.nextInt();
        System.out.println("Introduzca el dígito que quiere insertar: ");
        digito = sc.next();
       indice = p - 1;
       resultado = num.substring(0, indice) + digito + num.substring(indice);
       System.out.println("El resultado es: " + resultado);
       sc.close();
    }
}