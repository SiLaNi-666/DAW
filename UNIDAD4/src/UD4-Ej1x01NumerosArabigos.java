package Ej1x01;

import java.util.Scanner;

import entrada.Teclado;

public class Ej1x01 {

    public static boolean esNumeroArabigo (char c){
        return c >= 48 && c <= 57;
        //return (c >= '0' && c <= '9')
    }

    public static void main(String[] args) {
        char c = Teclado.leerCaracter("¿Caracter?");

        if (esNumeroArabigo(c)){
            System.out.printf("El caracter %c es un numero arabigo", c);
        } else {
            System.out.printf("El caracter %c no es un numero arabigo", c);
        }
    }
}
