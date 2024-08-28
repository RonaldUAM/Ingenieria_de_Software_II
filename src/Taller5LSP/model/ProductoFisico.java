package Taller5LSP.model;

import Taller5LSP.Producto;
import Taller5LSP.GestionCorreo;

public class ProductoFisico extends Producto implements GestionCorreo {
    private final double peso;

    public ProductoFisico(String nombre, double precio, int cantidad, double peso) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    @Override
    public double calcularCostoTotal() {
        return this.getCantidad()*this.getPrecio()*this.peso;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Envio de correo del producto fisico");
    }
}
