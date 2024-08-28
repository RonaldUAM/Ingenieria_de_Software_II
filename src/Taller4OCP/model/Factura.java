package Taller4OCP.model;

import Taller4OCP.abstractModel.Calculo;

public class Factura {

    public void calcularImpuesto(Calculo calculo){
        System.out.println("Calculo del producto: "+calculo.getProducto());
        System.out.println("Valor del producto sin Impuesto: "+calculo.getCantidad());
        System.out.println("Valor del impuesto: "+calculo.calcularImpuesto()+ "\n");
    }
}
