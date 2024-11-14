import java.util.Arrays;
import java.util.Random;

public class Ej2x03 {

    public static int [][] rellenar (int filas, int columnas, int limiteInf, int limiteSup){
        int [][] m = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                m[i][j] = random.nextInt(limiteSup - limiteInf + 1) + limiteInf;
            }
        }
        return m;
    }

    public static int sumaFilas (int [][]m){
        int sumaFilas = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++){
                sumaFilas += m[i][j];
            }
            System.out.println("Suma de Fila " + (i+0) + ": " + sumaFilas);
        }
        return sumaFilas;
    }
    public static int sumaColumnas (int [][] m){
        int sumaColumnas = 0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                sumaColumnas += m[j][i];
            }
            System.out.println("Suma de Columna " + (i+0) + ": " + sumaColumnas);
        }
        return sumaColumnas;
    }

    public static void main(String[]args){
        int filas = 8;
        int columnas = 8;
        int limiteInf = 1;
        int limiteSup = 100;

        int [][] m = rellenar (filas, columnas, limiteInf, limiteSup);
        int sumaFilas = sumaFilas(m);
        int sumaColumnas = sumaColumnas(m);

        System.out.println("Matriz:");
        System.out.println(m);
    }

}
