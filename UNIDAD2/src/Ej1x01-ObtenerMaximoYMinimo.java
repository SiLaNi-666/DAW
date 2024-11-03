import java.util.Scanner;

public class Ej1x01 {

    public static int obtenerMinimo (int num1, int num2, int num3){
        int minimo = num1;

        if (num2 < minimo){
            minimo = num2;
        }
        if (num3 < minimo){
            minimo = num3;
        }

        return minimo;
    }

    public static int obtenerMaximo (int num1, int num2, int num3){
        int maximo = num1;

        if (num2 > maximo) {
            maximo = num2;
        }
        if (num3 > maximo) {
            maximo = num3;
        }

        return maximo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Numero Entero A?");
        num1 = teclado.nextInt();
        System.out.println("Numero Entero B?");
        num2 = teclado.nextInt();
        System.out.println("Numero Entero C?");
        num3 = teclado.nextInt();

        System.out.println("Minimo: " + obtenerMinimo(num1, num2, num3));
        System.out.println("Maximo: " + obtenerMaximo(num1, num2, num3));

    }

}

