package Taller5LSP;

import Taller5LSP.model.Inventario;
import Taller5LSP.model.ProductoDigital;
import Taller5LSP.model.ProductoFisico;
import Taller5LSP.model.ProductoMixto;

public class Main {
    public static void main(String[] args) {
        ProductoFisico productoFisico = new ProductoFisico("hola",2000,2,12.4);
        ProductoMixto productoMixto = new ProductoMixto("hola",2000,2,12.4,12);
        Producto productoDigital = new ProductoDigital("a",12000,12,10);
        Inventario inventario = new Inventario();
        System.out.println(inventario.calcular(productoFisico));
        System.out.println(inventario.calcular(productoDigital));
        productoFisico.enviarPorCorreo();
        productoMixto.enviarPorCorreo();
    }
}
