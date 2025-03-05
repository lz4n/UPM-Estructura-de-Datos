package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej4 {
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
        ej4(pila);
        System.out.println(pila);
    }

    private static int ultimo(Stack<Integer> pila, int numElementos) {
        if (pila.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int i = pila.pop(), valorReturn;
        if (pila.isEmpty()) {
            valorReturn = i;
        } else {
            valorReturn = ultimo(pila, ++numElementos);
        }

        if (valorReturn != numElementos) {
            pila.add(i);
        }


        return valorReturn;
    }

    private static void ej4(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return;
        }

        ultimo(pila, 0);
    }

}
