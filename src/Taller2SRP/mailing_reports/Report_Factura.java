package Taller2SRP.mailing_reports;


import Taller2SRP.model.Factura;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

public class Report_Factura {
    public void generarReporteFacturas(List<Factura> facturas){

        List<Factura> facturas1 = facturas.stream()
                                                .filter(factura -> factura.getDate().getValue().getMonthValue() == LocalDate.now().getMonthValue() &&
                                                        factura.getDate().getValue().getYear() == LocalDate.now().getYear() ).toList();

        System.out.println("__________________Reportes__________________________");
        if (!facturas1.isEmpty()){
            int totalValorFacturas = facturas1.stream().flatMapToInt(factura -> IntStream.of(factura.getTotal())).sum();
            System.out.println("\nEste es el reporte para el mes: "+LocalDate.now().getMonthValue());
            System.out.println("Este es el numero total de facturas que hubo en el mes: "+facturas1.size());
            System.out.println("Este es la sumatoria del valor de las facturas: "+totalValorFacturas);
            System.out.println("Estas son las facturas del mes actual: \n[");
            facturas1.forEach(factura -> {
                System.out.println(factura.toString());
            });
            System.out.println("]");
        }else {
            System.out.println("[ERROR] --> No hay ninguna factura con el mes actual, por favor revisar");
        }


    }
}
