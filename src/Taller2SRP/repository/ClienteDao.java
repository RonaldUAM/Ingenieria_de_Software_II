package Taller2SRP.repository;


import Taller2SRP.model.Cliente;

public class ClienteDao {
    public void guardarCliente(Cliente cliente){
        System.out.println("\n------------------Base de datos cliente----------------------");
        System.out.println("Se guardo la informacion del cliente: \n"+cliente.toString());
    }
}
