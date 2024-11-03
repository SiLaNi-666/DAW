import java.util.Scanner;

public class Ej2x01 {

    public static void escribirTablaMultiplicar(int numero){
        System.out.println("Tabla de multiplicar del " + numero);
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d x %2d = %2d\n", numero, i, numero * i);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.print("¿Numero?");
        numero = teclado.nextInt();

        if (numero < 0){
            System.out.println("El numero debe ser positivo");
        } else {
            escribirTablaMultiplicar(numero);
        }
    }
}
