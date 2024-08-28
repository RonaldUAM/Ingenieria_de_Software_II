package Taller5LSP.model;

import Taller5LSP.GestionCorreo;
import Taller5LSP.Producto;

public class ProductoMixto extends Producto implements GestionCorreo {
    private final double peso;
    private final int tamaño;

    public ProductoMixto(String nombre, double precio, int cantidad, double peso, int tamaño) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamaño = tamaño;
    }

    @Override
    public double calcularCostoTotal() {
        return this.peso*this.getCantidad()*this.tamaño*this.getPrecio();
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Envio de correo del producto mixto");
    }
}
