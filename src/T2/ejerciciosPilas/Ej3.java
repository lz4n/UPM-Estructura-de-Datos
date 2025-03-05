package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej3 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(9);
        pila.add(7);
        pila.add(2);
        pila.add(8);
        pila.add(2);
        pila.add(3);
        pila.add(2);
        pila.add(9);
        pila.add(9);

        System.out.println(pila);
        System.out.println(ej3(pila));
        System.out.println(pila);
    }

    private static int ultimo(Stack<Integer> pila, int numElementos) {
        if (pila.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int i = pila.pop(), valorReturn;
        if (pila.isEmpty()) {
            numElementos++;

            if (i < numElementos) {
                valorReturn = -1;
            } else if (i > numElementos) {
                valorReturn = 1;
            } else {
                valorReturn = 0;
            }
        } else {
            valorReturn = ultimo(pila, ++numElementos);
        }

        pila.add(i);

        return valorReturn;
    }

    private static int ej3(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return 0;
        }

        return ultimo(pila, 0);
    }
}
