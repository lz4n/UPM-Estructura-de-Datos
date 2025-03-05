package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej7 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(3);
        pila.add(3);
        pila.add(1);

        System.out.println(pila);
        System.out.println(eliminarDato(pila, 4));
        System.out.println(pila);
    }

    private static int eliminarDato(Stack<Integer> pila, int dato) {
        if (pila.isEmpty()) {
            return 0;
        }
        int i = pila.pop(), apariciones = eliminarDato(pila, dato);

        if (i == dato) {
            apariciones++;
        } else {
            pila.add(i);
        }

        return apariciones;
    }
}
