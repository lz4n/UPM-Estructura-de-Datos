package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej6 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(2);
        pila.add(3);
        pila.add(1);

        System.out.println(pila);
        hacerCapicua(pila);
        System.out.println(pila);
    }


    private static void insertarAlFinal(Stack<Integer> pila, int elemento) {
        if (pila.isEmpty()) {
            pila.add(elemento);

            return;
        }

        int i = pila.pop();
        if (pila.isEmpty()) {
           pila.add(elemento);
        } else {
            insertarAlFinal(pila, elemento);
        }

        pila.add(i);
    }

    private static void hacerCapicua(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return;
        }

        int i = pila.pop();

        hacerCapicua(pila);

        insertarAlFinal(pila, i);
        pila.add(i);
    }

}
