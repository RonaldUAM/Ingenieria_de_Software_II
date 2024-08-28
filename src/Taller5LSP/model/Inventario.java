package Taller5LSP.model;

import Taller5LSP.Producto;

public class Inventario{
    public Double calcular(Producto producto){
        return producto.calcularCostoTotal();
    }
}
