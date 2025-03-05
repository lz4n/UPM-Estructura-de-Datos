package T2;

import java.util.Stack;

public class MostrarPila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < 5; i++) {
            pila.add(i);
        }
        
        mostar(pila);
    }

    private static void mostar(Stack<Integer> pila) {
        if (!pila.isEmpty()) {
            int elemento = pila.pop();
            System.out.print(elemento);
            mostar(pila);
            pila.add(elemento);
        }
    }
}
