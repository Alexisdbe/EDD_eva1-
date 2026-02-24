/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java
 * to edit this template
 */
package eva_1_21_sumatoria;

/**
 *
 * @author burci
 */
public class Eva_1_21_sumatoria {

    public static void main(String[] args) {
        System.out.println("La sumatoria de 5 = " + sumatoria(5));
    }

    public static int sumatoria(int n){
        if(n == 1)
            return 1;
        else
            return n + sumatoria(n - 1);
    }
}