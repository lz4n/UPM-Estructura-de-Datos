package parcial1;

import T3.Ej2Extra;

import java.util.ArrayDeque;
import java.util.Stack;

public class EjListas {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.insertar(7);
        lista.insertar(8);
        lista.insertar(10);
        lista.insertar(12);

        System.out.println(lista);
        lista.insertarExamen(10);
        System.out.println(lista);
    }

    public static class Lista {
        private Nodo inicio, fin;
        private int numElementos;

        public Lista() {
            inicio = null;
            fin = null;
        }

        /* SOLO PARA TESTING */
        public void insertar(int dato) {

            Nodo nuevo = new Nodo(dato, null);

            if (inicio == null) {
                inicio = nuevo;
            } else {
                fin.setSiguiente(nuevo);
            }
            fin = nuevo;
            numElementos++;
        }

        public void insertarExamen(int valor) {
            if (inicio == null) {
                insertarExamenVacio();
            } else {
                insertarExamenNoVacio(valor);
            }
        }

        private void insertarExamenVacio() {
            inicio = new Nodo(0, null);
            fin = inicio;
        }

        private void insertarExamenNoVacio(int valor) {
            Nodo actual = inicio;
            boolean insertado = false;

            while (actual != null && !insertado) {
                int dato = actual.getDato();
                if (dato == valor && actual != fin) {
                    Nodo nuevo = new Nodo(dato, actual.getSiguiente());
                    actual.setSiguiente(nuevo);

                    insertado = true;
                }
                actual = actual.getSiguiente();
            }

            if (!insertado) {
                Nodo nuevo = new Nodo(valor, null);
                fin.setSiguiente(nuevo);
                fin = nuevo;
            }
        }

        @Override
        public String toString() {
            String resultado = "[";
            if (inicio != null) {
                Nodo actual = inicio;
                while (actual != null) {
                    resultado += "," + actual.getDato();
                    actual = actual.getSiguiente();
                }
                resultado += "]";
            }
            return resultado;
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
