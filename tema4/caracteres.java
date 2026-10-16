public class caracteres {
    public static void main(String[] args) {
        char caracter = 0;
        int numeroaleatorio;
        int contador = 1;
        numeroaleatorio = (int)(Math.random() * 4);
        if (numeroaleatorio == 0) {
            caracter = '#';
        } else if (numeroaleatorio == 1) {
            caracter = '$'; 
        } else if (numeroaleatorio == 2) {
            caracter = '€';
        } else {
            caracter = '&';
        }
        while (contador <=5) {
            System.out.print(caracter);
            contador++;
        }
    }
}