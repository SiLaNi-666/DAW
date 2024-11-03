import java.util.Scanner;

public class Ej1x02 {

    public static boolean esLetraMayusucla(char c){
        return c >= 65 && c <= 90;
    }

    public static boolean esLetraMinucla(char c){
        return c >= 97 && c <= 122;
    }

    public static void main(String[] args) {
        Scanner telcado = new Scanner(System.in);

        System.out.print("Caracter:");
        char c = telcado.next().charAt(0);

        if (esLetraMayusucla(c)){
            System.out.printf("El caracter %c es una letra mayuscula", c);
        } else if (esLetraMinucla(c)){
            System.out.printf("El caracter %c es una letra minúscula", c);
        } else {
            System.out.printf("El caracter %c no es una letra", c);
        }

    }

}
