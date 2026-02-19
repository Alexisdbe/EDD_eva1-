/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_18;

/**
 *
 * @author burci
 */
public class Eva_1_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 =" + factorialFor(5));
                System.out.println("Factorial de 5 =" + factorialRec(5));

    }
    public static int factorialFor(int valor){
        int resu = 1;
        for(int i = 1; i <= valor; i++){
            resu = resu * i;
        }
        return resu;
    }
    public static double factorialRec(int val){
        if(val > 0)
        return val * factorialRec(val - 1);
        else 
            return 1;
    }
    
}
