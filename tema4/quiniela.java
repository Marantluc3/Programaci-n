import java.util.Scanner;
public class quiniela {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        //Generamos un nº decimal aleatorio entre 0.0 y 1.0
double probabilidad = Math.random();
//Variable para guardar el resultado
String resultadoQuiniela;
if (probabilidad < 0.50) {
    //probabilidad de 1/2
    resultadoQuiniela = "1";
}
//rango de 0.5 a 0.833... a 1.0 -> Probabilidad 1/3 (33.33%)
else if (probabilidad < (0.50 + 1.0 / 3.0)) {
        resultadoQuiniela = "X";
}
//rango de 0.83 a 1.0 -> Probabilidad de 1/6 (16.67)
else {
    resultadoQuiniela = "2";
}
System.out.println("Resultado de la quiniela es: " + resultadoQuiniela);
}
}