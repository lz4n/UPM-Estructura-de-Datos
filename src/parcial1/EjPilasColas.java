package parcial1;

import java.util.ArrayDeque;
import java.util.Stack;

public class EjPilasColas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        pila.push(3);
        pila.push(4);
        pila.push(1);
        pila.push(5);
        pila.push(2);

        System.out.println(pila);
        System.out.println(encolarMitad(pila));
        System.out.println(pila);
    }

    public static ArrayDeque<Integer> encolarMitad(Stack<Integer> pila) {
        return encolarMitad(pila, pila.size() /2);
    }

    private static ArrayDeque<Integer> encolarMitad(Stack<Integer> pila, int elementosApilar) {
        if (pila.isEmpty()) {
            return new ArrayDeque<>();
        }

        int dato = pila.pop();
        ArrayDeque<Integer> cola = encolarMitad(pila, elementosApilar -1);

        if (elementosApilar > 0) {
            pila.add(dato);
        } else {
            cola.add(dato);
        }

        return cola;
    }
}
