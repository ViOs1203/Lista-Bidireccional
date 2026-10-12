// Piña Becerra Victor Osvaldo

package back_end;

public class ListaBidireccional {
    private Nodo primero;
    private Nodo ultimo;
    private int tamano;

    public ListaBidireccional() {
        primero = null;
        ultimo = null;
        tamano = 0;
    }

    public boolean estaVacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getTamano() {
        return tamano;
    }

    public void vaciar() {
        primero = null;
        ultimo = null;
        tamano = 0;
    }


    public void insertarAlPrincipio(Producto p) {
        Nodo nuevo = new Nodo(p);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
        tamano++;
    }

    public void insertarAlFinal(Producto p) {
        Nodo nuevo = new Nodo(p);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
        tamano++;
    }

    public void insertarPorPosicion(Producto p, int pos) {
        if (pos < 0 || pos > tamano) {
            throw new IndexOutOfBoundsException("Posicion fuera de rango: " + pos);
        }

        if (pos == 0) {
            insertarAlPrincipio(p);
        } else if (pos == tamano) {
            insertarAlFinal(p);
        } else {
            Nodo nuevo = new Nodo(p);
            Nodo aux = obtenerNodoEnPosicion(pos);
            Nodo prev = aux.getAnterior();

            prev.setSiguiente(nuevo);
            nuevo.setAnterior(prev);
            nuevo.setSiguiente(aux);
            aux.setAnterior(nuevo);

            tamano++;
        }
    }


    public Producto removerAlPrincipio() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista esta vacia");
        }

        Producto borrado = primero.getDato();

        if (tamano == 1) {
            primero = null;
            ultimo = null;
        } else {
            primero = primero.getSiguiente();
            primero.setAnterior(null);
        }

        tamano--;
        return borrado;
    }

    public Producto removerAlFinal() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista esta vacia");
        }

        if (tamano == 1) {
            return removerAlPrincipio();
        }

        Producto borrado = ultimo.getDato();
        ultimo = ultimo.getAnterior();
        ultimo.setSiguiente(null);
        tamano--;
        return borrado;
    }

    public Producto removerPorPosicion(int pos) {
        if (estaVacia()) {
            throw new IllegalStateException("Lista vacia");
        }
        if (pos < 0 || pos >= tamano) {
            throw new IndexOutOfBoundsException("Posicion fuera de rango: " + pos);
        }

        if (pos == 0) {
            return removerAlPrincipio();
        }
        if (pos == tamano - 1) {
            return removerAlFinal();
        }

        Nodo elim = obtenerNodoEnPosicion(pos);
        Nodo prev = elim.getAnterior();
        Nodo sig = elim.getSiguiente();

        prev.setSiguiente(sig);
        sig.setAnterior(prev);

        tamano--;
        return elim.getDato();
    }


    public Producto mostrarAlPrincipio() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista esta vacia");
        }
        return primero.getDato();
    }

    public Producto mostrarAlFinal() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista esta vacia");
        }
        return ultimo.getDato();
    }

    public Producto mostrarPorPosicion(int pos) {
        if (estaVacia()) {
            throw new IllegalStateException("La lista esta vacia");
        }
        if (pos < 0 || pos >= tamano) {
            throw new IndexOutOfBoundsException("Posicion fuera de rango: " + pos);
        }
        return obtenerNodoEnPosicion(pos).getDato();
    }


    public String buscarPorCodigo(int cod) {
        if (estaVacia()) {
            return null;
        }

        Nodo aux = primero;
        int pos = 0;

        while (aux != null) {
            if (aux.getDato().codigo() == cod) {
                return "Encontrado: " + aux.getDato().toString() + " en la posicion: " + pos;
            }
            aux = aux.getSiguiente();
            pos++;
        }

        return null;
    }

    public String buscarPorPosicion(int pos) {
        if (estaVacia()) {
            throw new IllegalStateException("Lista vacia");
        }
        if (pos < 0 || pos >= tamano) {
            throw new IndexOutOfBoundsException("Posicion invalida: " + pos);
        }

        Producto p = obtenerNodoEnPosicion(pos).getDato();
        return "Elemento en posicion " + pos + ": " + p.toString();
    }

    private Nodo obtenerNodoEnPosicion(int pos) {
        Nodo aux;
        if (pos < tamano / 2) {
            aux = primero;
            for (int i = 0; i < pos; i++) {
                aux = aux.getSiguiente();
            }
        } else {
            aux = ultimo;
            for (int i = tamano - 1; i > pos; i--) {
                aux = aux.getAnterior();
            }
        }
        return aux;
    }
}
