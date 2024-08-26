package Taller2SRP.model;

public class Cliente {
    private final String name;
    private final int age;
    private final String email;

    public Cliente(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
