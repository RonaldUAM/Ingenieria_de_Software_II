package Taller1.model;

public class Login {
    private final String mail;
    private final String password;

    public Login(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    //Validate
    public void validatePassword(){
        System.out.println("------------------ Validación contraseña-------------------");
        if (this.password.length() > 5){
            System.out.println("| [Correcta] -> La contraseña es correcta |");
        }else {
            System.out.println("| [Error] -> La contraseña debe tener mas de 5 caracteres |");
        };
        System.out.println("-----------------------------------------------------------");
    }
}
