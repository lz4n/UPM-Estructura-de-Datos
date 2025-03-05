package T2;

import java.util.Stack;

public class CopiarPila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < 5; i++) {
            pila.add(i);
        }

        System.out.println(pila);
        System.out.println(copiar(pila));

    }

    private static Stack<Integer> copiar(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return new Stack<>();
        }

        int elemento = pila.pop();

        Stack<Integer> copiada = copiar(pila);
        copiada.add(elemento);
        pila.add(elemento);

        return copiada;
    }
}
