package eva_1_23_numero_primo;

public class Eva_1_23_numero_primo {

    public static void main(String[] args) {
        System.out.println("El numero 537 es primo? " + esPrimoNoEficiente(537));
        System.out.println("El numero 537 es primo? " + esPrimoEficiente(537));
    }

    public static boolean esPrimoNoEficiente(int numero) {
        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }

    public static boolean esPrimoEficiente(int numero) {
        boolean esPrimo = true;

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}