package Taller4OCP.model;


import Taller4OCP.abstractModel.Calculo;

public class CalculoImpuestoIva extends Calculo {

    private static final double VALORDELIMPUESTO = 0.19;

    public CalculoImpuestoIva(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio()*getCantidad()*VALORDELIMPUESTO;
    }
}
