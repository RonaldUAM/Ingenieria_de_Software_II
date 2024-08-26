package Taller2SRP.repository;


import Taller2SRP.model.Factura;

public class FacturaDao {
    public void guardarFactura(Factura factura){
        System.out.println("\n------------------Base de datos Facturas----------------------");
        System.out.println("Se guardo la informacion de la Factura: \n"+factura.toString());
    }
}
