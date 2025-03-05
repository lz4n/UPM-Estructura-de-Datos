package T2.ejerciciosColas;

import java.util.ArrayDeque;

public class Ej3 {
    public static void main(String[] args) {
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        cola.add(1);
        cola.add(3);
        cola.add(5);

        ArrayDeque<Integer> cola2 = new ArrayDeque<>();
        cola2.add(2);
        cola2.add(4);
        cola2.add(6);
        cola2.add(0);
        cola2.add(0);

        System.out.println(cola);
        System.out.println(cola2);
        System.out.println(mezclar(cola, cola2));
    }

    public static ArrayDeque<Integer> mezclar(ArrayDeque<Integer> cola1, ArrayDeque<Integer> cola2) {
        if (cola1.isEmpty() || cola2.isEmpty()) {
            return new ArrayDeque<>();
        }

        ArrayDeque<Integer> colaMezclada = new ArrayDeque<>();

        int size1 = cola1.size(), size2 = cola2.size();
        for (int i = 0; i < Math.max(size1, size2); i++) {
            if (!cola1.isEmpty()) {
                colaMezclada.add(cola1.pop());
            }

            if (!cola2.isEmpty()) {
                colaMezclada.add(cola2.pop());
            }

        }

        return colaMezclada;
    }
}
