package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej10 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(9);
        pila.add(4);
        pila.add(1);

        System.out.println(pila);
        ponerFondoDiferencia(pila);
        System.out.println(pila);
    }

    private static void ponerFondoDiferencia(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return;
        }

        ponerFondoDiferencia(pila, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private static void ponerFondoDiferencia(Stack<Integer> pila, int min, int max) {
        if (pila.isEmpty()) {
            pila.add(max -min);
            return;
        }

        int valor = pila.pop();

        min = Math.min(min, valor);
        max = Math.max(max, valor);
        ponerFondoDiferencia(pila, min, max);

        pila.add(valor);
    }
}
