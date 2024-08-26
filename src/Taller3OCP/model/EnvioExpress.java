package Taller3OCP.model;


import Taller3OCP.interfac.Envios;

public class EnvioExpress extends Envio implements Envios {

    public EnvioExpress(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularEnvio() {
        return peso * 1.0 + distancia * 0.2;
    }
}
