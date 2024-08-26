package Taller1.model;

public class Usuario {
    private final String email;
    private final String password;
    private long salary;

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public long getSalary(){
        return this.salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getInformation() {
        return "\n--------------- Información Del Usuario----------------\n"
                +"Usuario{" +
                "email='" + email + '\'' +
                ", password=" + password +
                ", Salary="+salary+
                '}'+
                "\n-------------------------------------------------------\n";
    }
}
