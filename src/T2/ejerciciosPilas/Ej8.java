package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej8 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(3);
        pila.add(4);
        pila.add(1);

        System.out.println(pila);
        System.out.println(mayor(pila));
        System.out.println(pila);
    }

    private static int mayor(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return -1;
        }

        int valor = pila.pop(), valorMayor = mayor(pila);

        pila.add(valor);

        return Math.max(valor, valorMayor);
    }
}
