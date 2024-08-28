package Taller4OCP.model;


import Taller4OCP.abstractModel.Calculo;

public class CalculoImpuestoReteIva extends Calculo {
    private final static double VALORDELIMPUESTORETEIVA = 0.15;
    public CalculoImpuestoReteIva(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getCantidad()*getPrecio()*VALORDELIMPUESTORETEIVA;
    }


}
