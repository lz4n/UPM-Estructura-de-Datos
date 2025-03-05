package T2.ejerciciosColas;

import java.util.ArrayDeque;

public class Ej4 {
    public static void main(String[] args) {
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        cola.add(1);
        cola.add(3);
        cola.add(2);

        System.out.println(cola);
        sustituirSegmentoImpares(cola);
        System.out.println(cola);
    }

    public static void sustituirSegmentoImpares(ArrayDeque<Integer> cola) {
        if (cola.isEmpty()) {
            return;
        }

        boolean segmentoInicialImpares = true;
        for (int i = 0, sizeCola = cola.size(), suma = 0, valor; i < sizeCola; i++) {
            valor = cola.pop();

            if (segmentoInicialImpares) {
                if (valor % 2 == 1) {
                    suma += valor;
                } else if (valor % 2 == 0) {
                    if (suma != 0) {
                        cola.add(suma);
                    }
                    cola.add(valor);
                    segmentoInicialImpares = false;
                }
            } else {
                cola.add(valor);
            }

            if (i == sizeCola -1 && cola.isEmpty()) {
                cola.add(suma);
            }
        }
    }
}
