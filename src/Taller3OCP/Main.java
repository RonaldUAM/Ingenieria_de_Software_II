package Taller3OCP;


import Taller3OCP.model.EnvioCalcular;
import Taller3OCP.model.EnvioEstandar;
import Taller3OCP.model.EnvioExpress;

public class Main {
    public static void main(String[] args) {
        EnvioEstandar envioEstandar = new EnvioEstandar(12,120);
        EnvioExpress envioExpress = new EnvioExpress(36,390);

        EnvioCalcular envioCalcular = new EnvioCalcular();
        System.out.println(envioCalcular.calcularCostoEnvio(envioEstandar));
        System.out.println(envioCalcular.calcularCostoEnvio(envioExpress));


    }
}