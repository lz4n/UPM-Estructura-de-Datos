package T3.ejercicosListas;

public class Ej3Extra {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(7);

        System.out.println(lista);
        lista.imagenEspecular();
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

        public void imagenEspecular() {
            if (vacia()) {
                return;
            }

            Nodo actual = inicio, nuevoNodo = inicio;

            int elemento;
            while (actual != null) {
                elemento = actual.getDato();

                nuevoNodo = new Nodo(elemento, nuevoNodo);

                actual = actual.getSiguiente();
            }

            inicio = nuevoNodo;
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
