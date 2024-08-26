package Taller2SRP.mailing_reports;

import Taller2SRP.model.Cliente;
import Taller2SRP.model.Factura;

public class Mail_Factura {
    public void enviarEmailFactura(Factura factura, Cliente cliente){
        System.out.println("\n**************Enviando Factura***************");
        System.out.println("Se envio la factura: \n["+factura.toString()+"]\n"+
                "Para el correo del cliente --> "+cliente.getEmail());
    }

    public void enviarFacturaDIAN(Factura factura){
        System.out.println("\n**************Enviando Factura a la DIAN***************");
        System.out.println("Se envio la factura: \n["+factura.toString()+"]\n"+
                "Para La DIAN ");
    }
}
