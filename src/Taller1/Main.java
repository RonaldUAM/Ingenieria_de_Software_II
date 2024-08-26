package Taller1;

import Taller1.model.Login;
import Taller1.model.Salary;
import Taller1.model.SendingEmail;
import Taller1.model.Usuario;

public class Main {
    public static void main(String[] args) {
        //Creación del Usuario y Salario
        Usuario usuario = new Usuario("ronald@gmail.com","12345678");
        Salary salary = new Salary(30,50000);

        //Se agrega el salario calculado al usuario
        usuario.setSalary(usuario.getSalary());

        //Datos del usuario
        System.out.println(usuario.getInformation());

        //Se valida la contraseña
        Login login = new Login(usuario.getEmail(), usuario.getPassword());
        login.validatePassword();

        //Se ingresa los valores para el envio del mensaje
        SendingEmail managmentEmail = new SendingEmail(usuario.getEmail(),"ron@mail.com","Hola mundo");
        managmentEmail.validateEmails();



    }
}