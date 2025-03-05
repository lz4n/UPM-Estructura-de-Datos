package T2;

import java.util.Stack;

public class CopiarInversaPila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < 5; i++) {
            pila.add(i);
        }

        System.out.println(pila);
        System.out.println(copiarInversa(pila));

    }

    private static Stack<Integer> copiarInversa(Stack<Integer> pila) {
        Stack<Integer> otraPila = new Stack<>();
        copiarInversa(pila, otraPila);

        return otraPila;
    }

    private static void copiarInversa(Stack<Integer> pila, Stack<Integer> otraPila) {
        if (pila.isEmpty()) {
            return;
        }

        int elemento = pila.pop();

        otraPila.add(elemento);
        copiarInversa(pila, otraPila);
        pila.add(elemento);
    }
}
