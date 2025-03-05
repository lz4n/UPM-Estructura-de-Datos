package T3.ejercicosListas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 4 ,9);

        System.out.println(lista);
        System.out.println(ordenada(lista));
    }

    public static boolean ordenada(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return false;
        }

        Iterator<Integer> iterator = lista.iterator();
        boolean ordenados = true;
        int anterior = Integer.MIN_VALUE;
        while (iterator.hasNext() && ordenados) {
            int elemento = iterator.next();

            if (anterior > elemento) {
                ordenados = false;
            }

            anterior = elemento;
        }

        return ordenados;
    }
}
