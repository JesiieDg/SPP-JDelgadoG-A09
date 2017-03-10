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
        sumaMatrices();

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
    public static void sumaMatrices(){
        int fila,columna; // checar bien!
        fila=solicitaEntero("Ingrese el número de filas");
        columna=solicitaEntero("Ingrese el número de columnas");
        int matrizA[][] = new int[fila][columna];
        int matrizB[][] = new int[fila][columna];
        System.out.println("");
        System.out.println("        Llenar Matriz A");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                matrizA[i][j] = solicitaEntero("Ingrese el valor de la fila " + i + " de la columna " + j + ":  ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("         LLenar Matriz B");
        System.out.println("");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                matrizB[i][j] = solicitaEntero("Ingrese el valor de la fila  " + i + "de la columna " + j + ":  ");

            }
        }
        int R[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                R[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("");
        System.out.println("");

        System.out.println("     Suma de las matrices A y B");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("   " + matrizA[i][j] + "  +  " + matrizB[i][j] + "  =  " + R[i][j]);
            }
        }
        System.out.println("       Matriz Resultante");
        for (int i = 0; i < fila; i++) {
            System.out.print(" ");
            for (int j = 0; j < columna; j++) {
                System.out.print(R[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
