// Piña Becerra Victor Osvaldo
package back_end;


public record Producto(int codigo, String nombre, double precio) {
    
    public Producto {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El codigo debe ser mayor a cero");
        }
        if (nombre == null || nombre.equals("")) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " | Nombre: " + nombre + " | Precio: $" + precio;
    }
}
