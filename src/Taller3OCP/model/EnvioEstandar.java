package Taller3OCP.model;


import Taller3OCP.interfac.Envios;

public class EnvioEstandar extends Envio implements Envios {
    public EnvioEstandar(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularEnvio() {
        return this.peso * 0.5 + this.distancia * 0.1;
    }
}
