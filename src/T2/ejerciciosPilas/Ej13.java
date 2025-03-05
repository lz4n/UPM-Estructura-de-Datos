package T2.ejerciciosPilas;

import java.util.Iterator;
import java.util.Stack;

public class Ej13 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(7);
        pila.add(7);
        pila.add(-1);
        pila.add(1);
        pila.add(2);
        pila.add(-1);
        pila.add(-1);

        System.out.println(pila);
        System.out.println(secuenciaPositivos(pila));
        System.out.println(pila);
    }

    private static int secuenciaPositivos(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return 0;
        }

        return secuenciaPositivos(pila, true);
    }

    private static int secuenciaPositivos(Stack<Integer> pila, boolean primeraSecuencia) {
        if (pila.isEmpty()) {
            return 0;
        }

        int valor = pila.pop();

        int resultado = 0;
        if (valor > 0) {
            resultado = 1 + secuenciaPositivos(pila, false);
        } else if (primeraSecuencia) {
            resultado = secuenciaPositivos(pila, true);
        }

        pila.add(valor);

        return resultado;
    }

}
