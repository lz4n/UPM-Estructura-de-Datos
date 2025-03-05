package T2.ejerciciosPilas;

import java.util.Stack;

public class Ej11 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.add(1);
        pila.add(2);
        pila.add(3);

        System.out.println(pila);
        System.out.println(comprobarOrden(pila));
        System.out.println(pila);
    }

    private static boolean comprobarOrden(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return true;
        }

        return comprobarOrden(pila, Integer.MAX_VALUE);
    }

    private static boolean comprobarOrden(Stack<Integer> pila, int anterior) {
        if (pila.isEmpty()) {
            return true;
        }

        int valor = pila.pop();

        if (valor > anterior) {
            pila.add(valor);
            return false;
        }

        boolean resultado = comprobarOrden(pila, valor);

        pila.add(valor);

        return resultado;
    }
}
