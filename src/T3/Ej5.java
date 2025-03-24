package T3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ej5 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 7, 14, 2);

        System.out.println(lista);
        System.out.println(mayorDeTres(lista));
    }

    public static int mayorDeTres(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return 0;
        }

        int numElementos = lista.size();

        int primero = lista.get(0), ultimo = lista.get(numElementos -1), medio = lista.get((numElementos -1) /2);

        return Math.max(primero, Math.max(medio, ultimo));
    }
}
