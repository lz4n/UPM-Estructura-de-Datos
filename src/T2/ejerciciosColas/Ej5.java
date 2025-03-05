package T2.ejerciciosColas;

import java.util.ArrayDeque;

public class Ej5 {
    public static void main(String[] args) {
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        cola.add(1);
        cola.add(3);
        cola.add(7);

        ArrayDeque<Integer> cola2 = new ArrayDeque<>();
        cola2.add(2);
        cola2.add(4);
        cola2.add(6);
        cola2.add(0);
        cola2.add(0);

        System.out.println(cola);
        System.out.println(cola2);
        System.out.println(colaMenores(cola, cola2));
        System.out.println(cola);
        System.out.println(cola2);
    }

    public static ArrayDeque<Integer> colaMenores(ArrayDeque<Integer> cola1, ArrayDeque<Integer> cola2) {
        if (cola1.isEmpty() || cola2.isEmpty()) {
            return new ArrayDeque<>();
        }

        ArrayDeque<Integer> colaMenores = new ArrayDeque<>();

        int size1 = cola1.size(), size2 = cola2.size();
        int minSize = Math.min(size1, size2), maxSize = Math.max(size1, size2);
        for (int i = 0; i < maxSize; i++) {
            if (i < minSize) {
                int val1 = cola1.pop(), val2 = cola2.pop();
                if (val1 <= val2) {
                    colaMenores.add(val1);
                    cola2.add(val2);
                } else {
                    colaMenores.add(val2);
                    cola1.add(val1);
                }
            } else {
                if (i < size1) {
                    cola1.add(cola1.pop());
                } else {
                    cola2.add(cola2.pop());
                }
            }
        }

        return colaMenores;
    }
}
