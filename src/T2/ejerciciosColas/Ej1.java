package T2.ejerciciosColas;

import java.util.ArrayDeque;

public class Ej1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        cola.add(7);
        cola.add(2);
        cola.add(5);

        System.out.println(cola);
        invertirCola(cola);
        System.out.println(cola);
    }

    public static void invertirCola(ArrayDeque<Integer> cola) {
        if (cola.isEmpty()) {
            return;
        }

        int valor = cola.pop();
        invertirCola(cola);
        cola.add(valor);
    }
}
