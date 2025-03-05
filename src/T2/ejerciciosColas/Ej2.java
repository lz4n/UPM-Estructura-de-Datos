package T2.ejerciciosColas;

import java.util.ArrayDeque;

public class Ej2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        cola.add(7);
        cola.add(2);
        cola.add(5);
        cola.add(2);

        System.out.println(cola);
        System.out.println(buscarEnCola(cola, 1));
        System.out.println(buscarEnCola(cola, 2));
        System.out.println(cola);
    }

    public static int buscarEnCola(ArrayDeque<Integer> cola, int busucar) {
        if (cola.isEmpty()) {
            return -1;
        }

        int pos = -1;
        for (int i = 0, valor; i < cola.size(); i++) {
            valor = cola.pop();
            if (valor == busucar && pos == -1) {
                pos = i;
            }
            cola.add(valor);
        }

        return pos;
    }
}
