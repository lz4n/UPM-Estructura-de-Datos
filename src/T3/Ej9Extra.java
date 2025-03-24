package T3;

public class Ej9Extra {
    public static void main(String[] args) {
        Lista lista = new Lista(new int[]{1, 2, 4, 2, 3, 2});

        System.out.println(lista);
        lista.borrarDuplicar(2);
        System.out.println(lista);
    }

    public static class Lista {
        private Nodo inicio, fin;
        private int numElementos;

        public Lista() {
            inicio = null;
            fin = null;
            numElementos = 0;
        }

        public Lista(int[] datos) {
            this();

            if (datos == null || datos.length == 0) {
                return;
            }

            Nodo anterior = new Nodo(datos[0], null);
            inicio = anterior;

            Nodo nuveoNodo;
            for (int i = 1; i < datos.length; i++) {
                nuveoNodo = new Nodo(datos[i], null);

                anterior.setSiguiente(nuveoNodo);
                anterior = nuveoNodo;
            }

            fin = anterior;

            numElementos = datos.length;
        }

        public boolean vacia() {
            return inicio == null;
        }

        public void insertar(int dato) {

            Nodo nuevo = new Nodo(dato, null);

            if (this.vacia()) {
                inicio = nuevo;
            } else {
                fin.setSiguiente(nuevo);
            }
            fin = nuevo;
            numElementos++;
        }

        @Override
        public String toString() {
            String resultado = "[";
            if (!this.vacia()) {
                Nodo actual = inicio;
                while (actual != null) {
                    resultado += "," + actual.getDato();
                    actual = actual.getSiguiente();
                }
                resultado += "]";
            }
            return resultado;
        }

        public void borrarDuplicar(int dato) {
            Nodo anterior = null, actual = inicio, siguiente;

            boolean primeraAparicion = true;
            while (actual != null) {
                int valorActual = actual.getDato();
                siguiente = actual.getSiguiente();

                if (valorActual == dato) {
                    if (primeraAparicion) {
                        if (anterior == null) {
                            inicio = actual.getSiguiente();
                        } else {
                            anterior.setSiguiente(actual.getSiguiente());
                        }

                        numElementos--;
                    } else {
                        Nodo nuevoNodo = new Nodo(valorActual, siguiente);
                        actual.setSiguiente(nuevoNodo);

                        numElementos++;
                    }

                    primeraAparicion = false;
                }

                anterior = actual;
                actual = siguiente;
            }
        }
    }

    public static class Nodo {

        private int dato;
        private Nodo siguiente;

        public Nodo(int dato, Nodo siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public int getDato() {
            return dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }
    }
}
