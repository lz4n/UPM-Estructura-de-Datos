package T3.ejercicosListas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ej8 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 4), lista2 = Arrays.asList(4, 4, 1);

        System.out.println(lista1);
        System.out.println(identicas(lista1, lista2));
    }

    public static boolean identicas(List<Integer> lista1, List<Integer> lista2) {
        if (lista1 == lista2) {
            return true;
        }

        if (lista1 == null || lista2 == null) {
            return false;
        }

        if (lista1.size() != lista2.size()) {
            return false;
        }

        List<Integer> copiaLista2 = new ArrayList<>();
        Iterator<Integer> iterator2 = lista2.iterator();
        while (iterator2.hasNext()) {
            copiaLista2.add(iterator2.next());
        }

        Iterator<Integer> iterator = lista1.iterator();
        boolean mismoContenido = true;
        while (iterator.hasNext() && mismoContenido) {
            mismoContenido = copiaLista2.remove(iterator.next());
        }

        return mismoContenido;
    }
}
