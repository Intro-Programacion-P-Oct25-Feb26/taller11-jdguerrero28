/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese opcion a calcular:\n1. Area Cuadrado\n"
                + "2. Area Triangulo\n3. Area Rectangulo");
        int opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Opcion no valida");
                }                // TODO code application logic here
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese lado:");
        double lado = entrada.nextDouble();
        
        double area = lado * lado;
        System.out.printf("El area del cuadrado es: %.2f\n", area);

    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese base:");
        double base = entrada.nextDouble();
        System.out.println("Ingrese altura:");
        double altura = entrada.nextDouble();
        
        double area = (base * altura) / 2;
        System.out.printf("El area del triangulo es: %.2f\n", area);

    }
    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese base:");
        double base = entrada.nextDouble();
        System.out.println("Ingrese altura:");
        double altura = entrada.nextDouble();
        
        double area = base * altura;
        System.out.printf("El area del rectangulo es: %.2f\n", area);

    }
}
