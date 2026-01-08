/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = obtenerMediaAritmetica(informacion);
        double desviacion = obtenerDesviacion(informacion, media);

        String resultado = String.format("Media: %.2f\nDesviacion Estandar: "
                + "%.2f\n", media, desviacion);
        System.out.printf("%s", resultado);
    }
    public static double obtenerMediaAritmetica(int[]info) {
        double suma = 0;
        for (int i= 0; i< info.length;i++){
        suma = suma + info[i];
        }
        return suma/info.length;
    }
    public static double obtenerDesviacion(int[]info, double media) {
        double suma = 0;
        for (int i= 0; i< info.length;i++){
        suma = suma + Math.pow(info[i]-media, 2);
        }
        return Math.sqrt(suma/info.length);
    }
}
