package Taller2SRP;


import Taller2SRP.mailing_reports.Mail_Factura;
import Taller2SRP.mailing_reports.Report_Factura;
import Taller2SRP.model.Cliente;
import Taller2SRP.model.Factura;
import Taller2SRP.model.valueObjects.DateValue;
import Taller2SRP.repository.ClienteDao;
import Taller2SRP.repository.FacturaDao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ronald",23,"RonaldCardenas@gmail.com");
        Cliente cliente1 = new Cliente("pepe",34,"pepes@gmail.com");
        Cliente cliente2 = new Cliente("andres", 36,"Andres@gmail.com");

        Factura factura = new Factura(DateValue.of("2024-08-29"),30000,0.7);
        Factura factura1 = new Factura(DateValue.of("2024-08-01"),100000,0.7);
        Factura factura2 = new Factura(DateValue.of("2024-09-09"),14000,0.7);

        List<Factura> facturas = new ArrayList<>();
        facturas.add(factura);
        facturas.add(factura1);
        facturas.add(factura2);

        Mail_Factura mailFactura = new Mail_Factura();
        Report_Factura reportFactura = new Report_Factura();
        ClienteDao clienteDao = new ClienteDao();
        FacturaDao facturaDao = new FacturaDao();


        clienteDao.guardarCliente(cliente);
        clienteDao.guardarCliente(cliente1);
        clienteDao.guardarCliente(cliente2);

        facturaDao.guardarFactura(factura);
        facturaDao.guardarFactura(factura1);
        facturaDao.guardarFactura(factura2);

        mailFactura.enviarEmailFactura(factura,cliente);
        mailFactura.enviarEmailFactura(factura2,cliente2);

        mailFactura.enviarFacturaDIAN(factura1);

        reportFactura.generarReporteFacturas(facturas);
    }
}