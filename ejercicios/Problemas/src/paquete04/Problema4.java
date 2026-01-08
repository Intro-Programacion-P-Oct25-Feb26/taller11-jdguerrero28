/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su cedula:");
        String cedula = entrada.nextLine();

        System.out.println("Ingrese opcion:\n1. Planilla Luz\n2. Predio\n");
        int opcion = entrada.nextInt();

        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (opcion == 2) {
                calcularPredio(nombre, cedula);
            } else {
                System.out.println("Opcion no valida\n");
            }
        }

// TODO code application logic here
    }

    public static void calcularValorLuz(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de Kw:");
        double kilovatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de Kw del mes:");
        double numeroKilovatio = entrada.nextDouble();
        
        double resultado = kilovatio * numeroKilovatio;
        
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de "
                + "$%.2f\n", n, c, resultado);
        
    }
    public static void calcularPredio(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del inmueble:");
        double inmueble = entrada.nextDouble();
        
        double resultado = inmueble * 0.02;
        
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n",
                n, c, inmueble, resultado);
        
    }

}
