package T4;

public class Ej2 {
    public static void main(String[] args) {
        Arbol subArbolIzq = new Arbol(2, new Arbol(4), new Arbol(5));
        Arbol subArbolDer = new Arbol(3, new Arbol(6), new Arbol(7));
        Arbol arbol = new Arbol(1, subArbolIzq, subArbolDer);

        System.out.println(arbol.sumarHojas());
    }

    public static class Arbol {
        private NodoArbol raiz;

        public Arbol() {
            raiz = null;
        }

        public Arbol(int dato) {
            raiz = new NodoArbol(dato);
        }

        public Arbol(int dato, Arbol izquierdo, Arbol derecho) {
            NodoArbol nodoIzq = null;
            NodoArbol nodoDer = null;
            if (izquierdo != null) {
                nodoIzq = izquierdo.raiz;
            }
            if (derecho != null) {
                nodoDer = derecho.raiz;
            }
            raiz = new NodoArbol(dato, nodoIzq, nodoDer);
        }

        public int sumarHojas() {
            return sumarHojas(raiz);
        }

        private int sumarHojas(NodoArbol nodo) {
            if (nodo == null) {
                return 0;
            }

            if (nodo.getDerecho() == null && nodo.getIzquierdo() == null) {
                return 1;
            }

            return sumarHojas(nodo.getIzquierdo()) + sumarHojas(nodo.getDerecho());
        }
    }

    static class NodoArbol {
        private int dato;
        private NodoArbol izquierdo, derecho;

        public NodoArbol(int dato) {
            this.dato = dato;
            this.izquierdo = this.derecho = null;
        }

        public NodoArbol(int dato, NodoArbol izquierdo, NodoArbol derecho) {
            this.dato = dato;
            this.izquierdo = izquierdo;
            this.derecho = derecho;
        }

        public int getDato() {
            return dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }

        public NodoArbol getIzquierdo() {
            return izquierdo;
        }

        public void setIzquierdo(NodoArbol izquierdo) {
            this.izquierdo = izquierdo;
        }

        public NodoArbol getDerecho() {
            return derecho;
        }

        public void setDerecho(NodoArbol derecho) {
            this.derecho = derecho;
        }
    }
}
