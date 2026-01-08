/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades = obtenerCiudades();
        presentar(ciudades);
    }

    public static String[] obtenerCiudades() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero de ciudades a ingresar:");
        int numero = entrada.nextInt();
        entrada.nextLine();

        String[] ciudades = new String[numero];
        for (int i = 0; i < numero; i++) {
            System.out.println("Ciudad " + (i + 1) + ":");
            ciudades[i] = entrada.nextLine();

        }
        return ciudades;
    }

    public static void presentar(String[] lista) {
        String resultado = String.format("------------------------------\n"
                + "Ciudades con 4 o 5 caracteres:\n");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].length() == 4 || lista[i].length() == 5) {
                resultado = String.format("%s"
                        + "-%s\n", resultado, lista[i]);
            }
        }
        System.out.printf("%s\n", resultado);

    }

}
