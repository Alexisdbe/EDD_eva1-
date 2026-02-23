package eva_1_19;

/**
 * @author burci
 */
public class Eva_1_19 {

    public static void main(String[] args) {
        System.out.println("Calculando GCD de 180 y 48:");
        int resultado = gcd(180, 48);
        System.out.println("-----------------------------------");
        System.out.println("El Maximo comun divisor es: " + resultado);
    }

    public static int gcd(int val1, int val2) {
        int paso = 1;
        while (val2 != 0) {
            int residuo = val1 % val2;
            
            // Imprimimos el residuo de esta iteración
            System.out.println("Paso " + paso + ": " + val1 + " % " + val2 + " = Residuo: " + residuo);
            
            val1 = val2;
            val2 = residuo;
            paso++;
        }
        return val1;
    }
}