package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej9 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(3);
        pila.add(4);
        pila.add(1);
        pila.add(6);

        System.out.println(pila);
        System.out.println(eliminarPosPares(pila));
        System.out.println(pila);
    }

    private static Stack<Integer> eliminarPosPares(Stack<Integer> pila) {
        Stack<Integer> pila2 = new Stack<>();

        if (pila.isEmpty()) {
            return pila2;
        }

        eliminarPosPares(pila, pila2, true);
        return pila2;
    }

    private static void eliminarPosPares(Stack<Integer> pila, Stack<Integer> pila2 , boolean posImpar) {
        if (pila.isEmpty()) {
            return;
        }

        int valor = pila.pop();
        eliminarPosPares(pila, pila2, !posImpar);

        if (posImpar) {
            pila.add(valor);
        } else {
            pila2.add(valor);
        }
    }
}
