// Piña Becerra Victor Osvaldo

package back_end;

public class Nodo {
    private Producto dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Producto dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
