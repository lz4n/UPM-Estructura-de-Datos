package T2.ejerciciosColas;

import java.util.ArrayDeque;
import java.util.Stack;

public class Ej7 {
    public static void main(String[] args) {
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        cola.add(1);
        cola.add(3);
        cola.add(2);
        cola.add(4);
        cola.add(5);
        cola.add(1);

        Stack<Integer> pila = new Stack<>();

        System.out.println(cola);
        invertirCola(cola, pila);
        System.out.println(cola);
        System.out.println(pila);
    }

    public static void invertirCola(ArrayDeque<Integer> cola, Stack<Integer> pila) {
        if (cola.isEmpty()) {
            return;
        }

        for (int i = 0, sizeCola = cola.size(); i < sizeCola; i++) {
            if (i % 2 == 0) {
                pila.add(cola.pop());
            } else {
                cola.add(cola.pop());
            }
        }
    }
}
