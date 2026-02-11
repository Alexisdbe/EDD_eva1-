/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_12;

/**
 *
 * @author burci
 */
public class Eva_1_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Ejemplo [] arreglo = new Ejemplo[2];
               System.out.println("arreglo" +arreglo);
               
                  
               
               arreglo[0] = new Ejemplo();
               arreglo[1] = new Ejemplo();
               System.out.println(arreglo[0]);
               System.out.println(arreglo[1]);
               System.out.println(arreglo[0].val);
               System.out.println(arreglo[1].val);
               Ejemplo[] copia = new Ejemplo[2];
               System.out.println("copia" +copia);
               //posicion por posicion copiar de un arreglo al otro
               //no sirve :(
               //copia[0] = arreglo[0]; //no duplico el objeto
               //copia[1] = arreglo[1];
               copia[0] = new Ejemplo();
               copia[1] = new Ejemplo();
               System.out.println("copia[0]" + copia[0]);
                System.out.println("copia[1]" + copia[1]);
               copia[0].val = arreglo[0].val;
                              copia[1].val = arreglo[1].val;

               
               
               
                       
    }
    
    }
class Ejemplo{
        int val = 5;
    
}

    
