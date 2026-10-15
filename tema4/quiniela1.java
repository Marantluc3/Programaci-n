import java.util.Random;
public class quiniela1 {
    public static void main(String[] args) {
       int resultado;
       int i = 1;
     resultado = (int) (Math.random()*100 + 1);
     System.out.println("Quiniela al azar");
     while (i <= 15) { 
    resultado = (int) (Math.random()*100 + 1);
    if (resultado < 50)
        System.out.println("El resutado es 1");
    else if (50 < resultado && resultado > 80)
        System.out.println("El resultado es X");
    else 
        System.out.println("El resultado es 2");
    i++;
    }
}
}