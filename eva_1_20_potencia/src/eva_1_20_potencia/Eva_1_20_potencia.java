/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_20_potencia;

/**
 *
 * @author burci
 */
public class Eva_1_20_potencia {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args) {
        int base = 2;

        // Calculamos 2 al cuadrado (exponente 2)
        int cuadrado = calcularPotencia(base, 2);
        
        // Calculamos 2 al cubo (exponente 3)
        int cubo = calcularPotencia(base, 3);

        // Imprimimos resultados
        System.out.println(base + " al cuadrado es: " + cuadrado);
        System.out.println(base + " al cubo es: " + cubo);
    }

    /**
     * Método recursivo para calcular potencia
     */
    public static int calcularPotencia(int b, int e) {
        if (e == 0) {
            return 1; // Todo número elevado a 0 es 1
        } else {
            return b * calcularPotencia(b, e - 1);
        }
    }
}
    

