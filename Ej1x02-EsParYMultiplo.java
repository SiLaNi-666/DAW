public class Ej1x02 {

    public static boolean esPar(int numero) {
        boolean par = false;

        if (numero % 2 == 0) {
            par = true;
        }
        return par;
    }

    public static boolean esMultiplo (int num1, int num2){
        boolean multiplo = false;

        if (num1 % num2 == 0){
            multiplo = true;
        }
        return multiplo;
    }

    public static void main(String[] args) {

        System.out.println("Numero pares entre 1 y 20:");
        for (int i = 1; i <= 20; i++) {
            if (esPar(i)) {
                System.out.println( i );
            }

        }

        System.out.println("Numeros multiplos de 3 entre 1 y 20:");
        for (int i = 1; i<= 20; i++){
            if(esMultiplo(i, 3)){
                System.out.println( i );
            }
        }

        System.out.println("Numeros multiplos de 5 entre 1 y 20");
        for (int i = 1; i <= 20; i++){
            if(esMultiplo (i,5)){
                System.out.println( i );
            }
        }

    }

}
