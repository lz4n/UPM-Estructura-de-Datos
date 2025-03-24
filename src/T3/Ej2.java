package T3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 7, 4 ,9, 4);

        System.out.println(lista);
        System.out.println(sonDistintos(lista));
    }

    public static boolean sonDistintos(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return true;
        }

        ArrayList<Integer> aux = new ArrayList<>();


        Iterator<Integer> iterator = lista.iterator();
        boolean diferentes = true;
        while (iterator.hasNext() && diferentes) {
            int elemento = iterator.next();

            if (aux.contains(elemento)) {
                diferentes = false;
            } else {
                aux.add(elemento);
            }
        }

        return diferentes;
    }
}
