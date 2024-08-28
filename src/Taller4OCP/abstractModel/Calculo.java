package Taller4OCP.abstractModel;

public abstract class Calculo {
    final String producto;
    final int cantidad;
    final int precio;

    public Calculo(String producto, int cantidad, int precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public abstract double calcularImpuesto();

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }
}
