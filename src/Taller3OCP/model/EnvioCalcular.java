package Taller3OCP.model;

import Taller3OCP.interfac.Envios;

public class EnvioCalcular {
    public double calcularCostoEnvio(Envios envios){
        return envios.calcularEnvio();
    }
}
