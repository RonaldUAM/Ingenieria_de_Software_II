package Taller4OCP;

import Taller4OCP.abstractModel.Calculo;
import Taller4OCP.model.CalculoImpuestoIva;
import Taller4OCP.model.CalculoImpuestoReteIva;
import Taller4OCP.model.CalculoImpuestoSaludable;
import Taller4OCP.model.Factura;

    public class Main {
    public static void main(String[] args) {
        CalculoImpuestoIva calculoImpuestoIva = new CalculoImpuestoIva("Pc",1,2000000);
        CalculoImpuestoReteIva calculoImpuestoReteIva = new CalculoImpuestoReteIva("Pc",1,2000000);
        CalculoImpuestoSaludable calculoImpuestoSaludable = new CalculoImpuestoSaludable("Agua",1,2000);
        Factura factura = new Factura();
        factura.calcularImpuesto(calculoImpuestoIva);
        factura.calcularImpuesto(calculoImpuestoReteIva);
        factura.calcularImpuesto(calculoImpuestoSaludable);
    }
}
