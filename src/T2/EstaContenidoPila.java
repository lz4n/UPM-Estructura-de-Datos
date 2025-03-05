package T2;

import java.util.Stack;

public class EstaContenidoPila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < 5; i++) {
            pila.add(i);
        }

        System.out.println(pila);
        System.out.println(estaContenido(pila, 7));
        System.out.println(pila);
    }

    private static boolean estaContenido(Stack<Integer> pila, int buscar) {
        if (pila.isEmpty()) {
            return false;
        }

        int elemento = pila.pop();

        boolean resultado;
        if (buscar == elemento) {
            resultado = true;
        } else {
            resultado = estaContenido(pila, buscar);
        }

        pila.add(elemento);

        return resultado;
    }
}
