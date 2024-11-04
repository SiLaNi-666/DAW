package Ej1x02;

import entrada.Teclado;

public class Ej1x02 {

    public static boolean esLetraMayusucla(char c){
        return c >= 65 && c <= 90;
        //return ((c >= 'A' && c <= 'Z') || (c == 'Ñ'));
    }

    public static boolean esLetraMinucla(char c){
        return c >= 97 && c <= 122;
    }

    public static void main(String[] args) {
        char c = Teclado.leerCaracter("Introduce un caracter:");

        if (esLetraMayusucla(c)){
            System.out.printf("El caracter %c es una letra mayuscula", c);
        } else if (esLetraMinucla(c)){
            System.out.printf("El caracter %c es una letra minúscula", c);
        } else {
            System.out.printf("El caracter %c no es una letra", c);
        }

    }

}
