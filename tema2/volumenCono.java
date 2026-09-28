import java.util.Scanner;
public class volumenCono {
  public static void main(String[] args) {
   double volumen = 0.0;
   double radio = 0.0;
   double altura = 0.0;
   double v = 1/3*3.14159*System.out.println(Math.pow(radio, 2)*altura);
    
    // Asigna un valor a radio
    radio = 20;
    // Asigna un valor a altura
    altura = 30;
    //Calcula
    volumen = v;
    // Muestra el resultado
    System.out.println(" El volumen del cono de radio " +
      radio + " y altura " + altura + " es " + volumen);
  }
}