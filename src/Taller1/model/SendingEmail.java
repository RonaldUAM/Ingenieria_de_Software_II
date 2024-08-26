package Taller1.model;

public class SendingEmail {
    private final String remitente;
    private final String destinatario;
    private final String message;

    public SendingEmail(String remitente, String destinatario, String message) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.message = message;
    }

    public void validateEmails(){
        System.out.println("\n----------------------- Sending... ------------------");
        if (!remitente.contains("@") || !destinatario.contains("@")){
            System.out.println(" [Error] -> Los correos deben tener un ( @ ) ");
        } else if (message.isEmpty()) {
            System.out.println(" [Error] -> El mensaje no debe estar vacío ");
        }else {
            System.out.println(sendMessageEmail());
        }
        System.out.println("--------------------------------------------------");
    }

    private String sendMessageEmail(){
        return "Se envio el mensaje del correo: ["+this.remitente +"]\n"
                +"al correo destino: ["+this.destinatario +"]\n"
                +"con el mensaje : {"+this.message+"}";
    }
}
