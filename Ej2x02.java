import java.util.Scanner;

public class Ej2x02 {

    /**
     * dibuja un rectangulo proporcionados su alto y su ancho
     * @param altura del rectangulo
     * @param anchura del rectangulo
     */
    public static void dibujarRectangulo (int altura, int anchura) {

        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= anchura; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura, anchura;
        int respuesta = 1;
        do {
            System.out.print("Altura del rectangulo?");
            altura = teclado.nextInt();
            System.out.print("Anchura del rectangulo?");
            anchura = teclado.nextInt();

            if (altura > 0 && anchura > 0) {
                dibujarRectangulo(altura, anchura);
            } else if (altura < 0) {
                System.out.println("La altura del rectangulo debe ser positiva");
            } else {
                System.out.println("La anchura del rectangulo debe ser positiva");
            }

            System.out.print("¿Desea procesar otro rectángulo (0 para salir)?");
            respuesta = teclado.nextInt();
        } while (respuesta != 0);

    }

}
