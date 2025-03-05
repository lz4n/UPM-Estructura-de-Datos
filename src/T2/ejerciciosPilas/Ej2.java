package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej2 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(8);
        pila.add(10);
        pila.add(15);
        pila.add(9);
        pila.add(7);
        pila.add(12);
        pila.add(3);

        System.out.println(pila);
        reorganizar(pila, 7);
        System.out.println(pila);
    }

    private static void eliminarElemento(Stack<Integer> pila, int elemento) {
        if (pila.isEmpty()) {
            return;
        }

        int i = pila.pop();
        eliminarElemento(pila, elemento);
        if (i != elemento) {
            pila.add(i);
        }
    }

    private static void reorganizar(Stack<Integer> pila, int dato) {
        eliminarElemento(pila, dato);
        pila.add(dato);
    }

}
