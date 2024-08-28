package Taller5LSP.model;

import Taller5LSP.Producto;

public class ProductoDigital extends Producto {
    private final int tamañoArchivo;

    public ProductoDigital(String nombre, double precio, int cantidad, int tamañoArchivo) {
        super(nombre, precio, cantidad);
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
        return tamañoArchivo*this.getCantidad()*this.getPrecio();
    }
}
