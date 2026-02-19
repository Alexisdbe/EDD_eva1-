package eva1_17_recursividad;

public class Eva1_17_recursividad {

    public static void main(String[] args) {

        Eva1_17_recursividad obj = new Eva1_17_recursividad();
        obj.imprimirLista(10);

        System.out.println("");
        imprimirListaRec(10);

        System.out.println("");
        imprimirListaRecUp(10); 
    }

    public void imprimirLista(int val){
        for(int i = val; i > 0; i--)
            System.out.println(i + "-");
    }

    public static void imprimirListaUp(int val){
        impimirListaUp(val);
    }

    public static void impimirListaUp(int val){
        for(int i = 1; i <= val; i++)
            System.out.println(i + "-");
    }

    public static void imprimirListaRec(int val){
        System.out.println(val + " - ");
        if (val > 1)
            imprimirListaRec(val - 1);
    }

    public static void imprimirListaRecUp(int val){
        if(val > 1){
            imprimirListaRecUp(val + 1);
            System.out.println(val + " - ");
        }
    }
}
