package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej5 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(9);
        pila.add(10);
        pila.add(15);
        pila.add(9);
        pila.add(7);
        pila.add(12);
        pila.add(3);

        System.out.println(pila);
        ej5(pila);
        System.out.println(pila);
    }

    private static int ultimo(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int i = pila.pop(), valorReturn;
        if (pila.isEmpty()) {
            valorReturn = i;
        } else {
            valorReturn = ultimo(pila);
            pila.add(i);
        }

        return valorReturn;
    }

    private static void ej5(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return;
        }

        pila.add(ultimo(pila));
    }

}
