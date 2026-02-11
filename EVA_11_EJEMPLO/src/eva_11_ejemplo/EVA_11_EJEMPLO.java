/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_11_ejemplo;

/**
 *
 * @author burci
 */
public class EVA_11_EJEMPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo [] arreglo = new Ejemplo[2];
               System.out.println(arreglo);
               
               
               arreglo[0] = new Ejemplo();
               arreglo[1] = new Ejemplo();
               System.out.println(arreglo[0]);
               System.out.println(arreglo[1]);
               System.out.println(arreglo[0].val);
               System.out.println(arreglo[1].val);

               
               
                       
    }
}
 class Ejemplo{
        int val = 5;   
}
