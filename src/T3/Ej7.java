package T3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ej7 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 4, 5, 4, 8, 12, 3), lista2 = Arrays.asList(4, 1, 7, 2, 4);

        System.out.println(lista1);
        System.out.println(interseccion(lista1, lista2));
    }

    public static List<Integer> interseccion(List<Integer> lista1, List<Integer> lista2) {
        if (lista1 == null || lista1.isEmpty() || lista2 == null || lista2.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> interseccion = new ArrayList<>();

        Iterator<Integer> iterator = lista1.iterator();
        while (iterator.hasNext()) {
            int elemento = iterator.next();

            if (lista2.contains(elemento) && !interseccion.contains(elemento)) {
                interseccion.add(elemento);
            }
        }

        return interseccion;
    }
}
