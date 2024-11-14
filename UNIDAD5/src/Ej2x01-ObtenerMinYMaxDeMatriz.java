import java.util.Arrays;
import java.util.Scanner;

public class Ej2x01 {

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int m [] [] = new int[4] [4];

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.print("¿Numero Entero (" + (i+0) + "," + (j+0) + "): ");
                m[i][j] = teclado.nextInt();
            }
        }
        System.out.println("MATRIZ:");
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }
}
