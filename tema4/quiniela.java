import java.util.Scanner;
public class quiniela {
    public static void main(String[] args) {
        int dado = (int) (1 + Math.random() * 6); 

        if (dado <= 3) {
            System.out.println("Ha salido el 1");
        }
        else if (dado <= 5) {
            System.out.println("Ha salido la X");
        }
        else {
            System.out.println("Ha salido el 2");
        }
    }
}
