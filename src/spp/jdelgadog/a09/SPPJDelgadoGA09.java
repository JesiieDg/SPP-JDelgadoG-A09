/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a09;

import java.util.Scanner;

/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner kb = new Scanner(System.in);
        int filas, columnas;
        //System.out.println("Ingrese el número de filas:  ");
        filas = solicitaEntero("Ingrese el número de filas");
        //System.out.println("Ingrese el número de columnas:  ");
        columnas = solicitaEntero("Ingrese el número de columnas");
        int matrizA[][] = new int[filas][columnas];
        int matrizB[][] = new int[filas][columnas];
        System.out.println("");
        System.out.println("        Llenar Matriz A");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matrizA[i][j] = solicitaEntero("Ingrese el valor de la fila " + i + " de la columna " + j + ":  ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("         LLenar Matriz B");
        System.out.println("");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matrizB[i][j] = solicitaEntero("Ingrese el valor de la fila  " + i + "de la columna " + j + ":  ");

            }
        }
        int R[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                R[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("");
        System.out.println("");

        System.out.println("     Suma de las matrices A y B");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("   " + matrizA[i][j] + "  +  " + matrizB[i][j] + "  =  " + R[i][j]);
            }
        }
        System.out.println("       Matriz Resultante");
        for (int i = 0; i < filas; i++) {
            System.out.print(" ");
            for (int j = 0; j < columnas; j++) {
                System.out.print(R[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int solicitaEntero(String mensaje) {
        Scanner kb = new Scanner(System.in);
        int fila = 0;
        boolean flag;
        do {
            System.out.println(" " + mensaje);//podemos solicitar cualquier numero entero con indicacion de itroduce tal o cual cosa las veces que quieras

            try {
                fila = kb.nextInt();

                flag = true;
            } catch (Exception ex) {
                flag = false;
                System.out.println("El número insertado no es entero" + ex);
                kb.nextLine();//Resetea la memoria y borra el enter inicial y permite meter otro numero
            }
        } while (flag == false);
        return fila;
    }
}
