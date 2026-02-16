/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_15_multi_arreglos;

/**
 *
 * @author burci
 */
public class Eva_1_15_multi_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][];
        matriz[0] = new int[5];
        matriz[1] = new int[2];
        matriz[2] = new int[4];
        for (int i = 0; i < matriz.length; i++){
                    for (int j = 0; j < matriz[i].length; j++){
                        matriz[i][j] = (int)(Math.random() * 100);
                    }

        }
                for (int i = 0; i < matriz.length; i++){
                            for (int j = 0; j < matriz.length; j++){
                                System.out.println("[" + matriz[i][j] + "]");
                            }
                            System.out.println("");

                }


    }
    
}
