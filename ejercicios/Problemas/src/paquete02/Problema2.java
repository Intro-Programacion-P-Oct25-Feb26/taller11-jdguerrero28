/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] viviendas = obtenerViviendas();
        double[][] consumos = obtenerConsumos();
        double[] totales = obtenerTotales(consumos);
        presentarReporte(viviendas, totales);
        // TODO code application logic here
    }

    public static String[] obtenerViviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] lista = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre de la vivienda " + (i + 1)
                    + ":");
            lista[i] = entrada.nextLine();
        }
        return lista;
    }

    public static double[][] obtenerConsumos() {
        Scanner entrada = new Scanner(System.in);
        double[][] registro = new double[10][12];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.println("Vivienda " + (i + 1) + "- Mes " + (j + 1)
                        + ":");
                registro[i][j] = entrada.nextDouble();
            }
        }
        return registro;
    }

    public static double[] obtenerTotales(double[][] registro) {
        double[] sumas = new double[registro.length];
        for (int i = 0; i < registro.length; i++) {
            double sumaPorVivienda = 0;
            for (int j = 0; j < registro[i].length; j++) {
                sumaPorVivienda = sumaPorVivienda + registro[i][j];
            }
            sumas[i] = sumaPorVivienda;
        }
        return sumas;
    }

    public static void presentarReporte(String[] viviendas, double[] totales) {
        String reporte = String.format("\nREPORTE FINAL\n");
        for (int i = 0; i < viviendas.length; i++) {
            reporte = String.format("%sVivienda: %s --- Consumo Total: "
                    + "%s kWh\n",
                    reporte, viviendas[i], totales[i]);
        }
        System.out.printf("%s", reporte);
    }
}
