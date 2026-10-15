import java.util.Scanner;
public class cartabaraja {
    public static void main(String[] args) {
int valor = (int) (Math.random() * 13.0);
int palo = (int)(Math.random() * 4.0);
Scanner sc = new Scanner(System.in);

System.out.print("El palo de la baraja es:" );
if (palo == 0)
    System.out.println("Picas");
else if (palo == 1)
    System.out.println("Corazones");
else if (palo == 2)
    System.out.println("Diamantes");
else 
    System.out.println("tréboles");

System.out.println("El valor de la carta es:" + valor);
sc.close();
}
}
