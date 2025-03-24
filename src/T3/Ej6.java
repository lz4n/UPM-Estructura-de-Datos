package T3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ej6 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 4), lista2 = Arrays.asList(1, 4);

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

        Iterator<Integer> iterator1 = lista1.iterator(), iterator2 = lista2.iterator();
        boolean iguales = true;
        while (iterator1.hasNext() && iterator2.hasNext() && iguales) {
            iguales = iterator1.next().equals(iterator2.next());
        }

        return iguales;
    }
}
