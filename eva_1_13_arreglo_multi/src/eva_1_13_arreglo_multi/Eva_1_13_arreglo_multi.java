/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_13_arreglo_multi;

/**
 *
 * @author burci
 */
public class Eva_1_13_arreglo_multi {
    final static int FILAS = 5;
    final static int COL = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arreglo = new int [FILAS][COL];
        //acceso por indice
        //primer posicion
        arreglo[0][0] = 100;
        //intermedia
        arreglo[3][1] = 500;
        //ultima posicion
        arreglo[4][2] = 1600;
         for (int i = 0; i < FILAS; i++){ //primera dimension
        for(int j = 0; j < COL; j++){
            arreglo[i][j] = (int)(Math.random() * 100);
        }
        }
        //dos dimensiones -- dos ciclos para recorrer el arreglo
        for (int i = 0; i < FILAS; i++){ //primera dimension
        for(int j = 0; j < COL; j++){    //segunda dimension
            System.out.println("[" + arreglo [i][j] + "]");
        }
            System.out.println("");
    }
        System.out.println("Arreglo:" + arreglo);
         System.out.println("Arreglo[0]:" + arreglo[0]);
         System.out.println("Arreglo[1]:" + arreglo[1]);
         System.out.println("Arreglo[2]:" + arreglo[2]);
    }
    
}
