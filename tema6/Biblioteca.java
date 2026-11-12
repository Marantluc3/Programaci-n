import java.util.Scanner;

public class Biblioteca {
    public static boolean esCapicua(int n) {
        int original = n;
        int inverso = 0;
        while (n != 0) {
            inverso = inverso * 10 + n % 10;
            n /= 10;    
        }
        return original == inverso;
    }
    public static int Potencia(int base, int exponente) {
        int potencia = (int) Math.pow(base, exponente);
        return potencia;
    }
    public static int digitos(int numero) {
       if (numero == 0) {
            return 1;
        }
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }
    public static int voltea(int n) {
        int inverso = 0;
        while (n != 0) {
            inverso = inverso * 10 + n % 10;
            n = n /10;
        }
        return inverso;
    }
    public static int quitaPorDetras(int numero, int cuantos) {
        for (int i = 0; i < cuantos; i++) {
            numero /= 10;
        }
        return numero;
    }
    public static int pegaPorDelante(int numero, int digito) {
        return Integer.parseInt(digito + "" + numero);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Comprobar si es capicúa");
            System.out.println("2. Calcular potencia");
            System.out.println("3. Contar dígitos");
            System.out.println("4. Voltear número");
            System.out.println("5. Quitar por detrás");
            System.out.println("6. Pegar por delante");
            System.out.println("7. Salir");
            System.out.print("Elige una opción entre el 1 y el 7: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int nCapicua;
                    System.out.print("Dime un numero: ");
                    nCapicua = sc.nextInt();
                    System.out.println(esCapicua(nCapicua));
                    break;
                case 2:
                    int base;
                    int potencia;
                    System.out.print("Dime un numero de base: ");
                    base = sc.nextInt();
                    System.out.print("Dime un numero como potencia: ");
                    potencia = sc.nextInt();
                    System.out.println(Potencia(base, potencia));
                    break;
                case 3:
                    int nDigitos;
                    System.out.print("Dime un numero: ");
                    nDigitos = sc.nextInt();
                    System.out.println(digitos(nDigitos));
                    break;
                case 4:
                    int nVoltear;
                    System.out.print("Dime un numero para darle la vuelta:");
                    nVoltear = sc.nextInt();
                    System.out.println(voltea(nVoltear));
                    break;
                case 5:
                    int nQuitar;
                    int quitar;
                    System.out.print("Dime un numero: ");
                    nQuitar = sc.nextInt();
                    System.out.print("Dime cuantos numeros quito: ");
                    quitar = sc.nextInt();
                    System.out.println(quitaPorDetras(nQuitar, quitar));
                    break;
                case 6:
                    int nBase;
                    int añadir;
                    System.out.print("Dime un numero: ");
                    nBase = sc.nextInt();
                    System.out.print("Dime un digito para añadir: ");
                    añadir = sc.nextInt();
                    System.out.println(pegaPorDelante(nBase, añadir));
                    break;
                case 7:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Ese nº no es válido");
                    break;
            }
        } while (opcion != 7);
            sc.close();
        } 
    }