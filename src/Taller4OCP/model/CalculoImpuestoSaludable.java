package Taller4OCP.model;

import Taller4OCP.abstractModel.Calculo;

public class CalculoImpuestoSaludable extends Calculo {
    private final static double VALORDELIMPUESTOSALUDABLE =0.05;
    public CalculoImpuestoSaludable(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getCantidad()*getPrecio()*VALORDELIMPUESTOSALUDABLE;
    }
}
