import java.util.Scanner;

public class MuestraDiaSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anio = leeAnioValido(sc);
        int mes = leeMesValido(sc);
        int dia = leeDiaValido(sc, anio, mes);

        int numDia = diaSemana(anio, mes, dia);
        String nombreDia = diaLetra(numDia);

        System.out.println("El día de la semana es: " + nombreDia);

        sc.close();
    }

    public static int diaSemana(int anio, int mes, int dia) {
        int a, b, c;

        if (mes == 1 || mes == 2) {
            a = mes + 10;
            b = (anio - 1) % 100;
            c = (anio - 1) / 100;
        } else {
            a = mes - 2;
            b = anio % 100;
            c = anio / 100;
        }

        int n = (700 + (26 * a - 2) / 10 + dia + b + b / 4 + c / 4 - 2 * c) % 7;

        if (n == 0) {
            n = 7;
        }

        return n;
    }

    public static String diaLetra(int n) {
        switch (n) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Día no válido";
        }
    }

    public static int leeAnioValido(Scanner sc) {
        int a = 1583;
        boolean valido = false;

        while (!valido) {
            System.out.println("Introduzca un año válido: ");
            a = sc.nextInt();
            if (a >= 1583) {
                valido = true;
            } else {
                System.out.println("Año no válido");
            }
        }
        return a;
    }

    public static int leeMesValido(Scanner sc) {
        int m = 1;
        boolean valido = false;

        while (!valido) {
            System.out.println("Introduzca un mes válido: ");
            m = sc.nextInt();
            if (m >= 1 && m <= 12) {
                valido = true;
            } else {
                System.out.println("Mes no válido");
            }
        }
        return m;
    }

    public static int leeDiaValido(Scanner sc, int anio, int mes) {
        int d = 1;
        boolean valido = false;

        while (!valido) {
            System.out.println("Introduzca un día válido: ");
            d = sc.nextInt();

            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (d >= 1 && d <= 30) {
                    valido = true;
                } else {
                    System.out.println("Día no válido");
                }
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (d >= 1 && d <= 31) {
                    valido = true;
                } else {
                    System.out.println("Día no válido");
                }
            } else if (mes == 2) {
                if (esBisiesto(anio)) {
                    if (d >= 1 && d <= 29) {
                        valido = true;
                    } else {
                        System.out.println("Día no válido");
                    }
                } else {
                    if (d >= 1 && d <= 28) {
                        valido = true;
                    } else {
                        System.out.println("Día no válido");
                    }
                }
            }
        }
        return d;
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}