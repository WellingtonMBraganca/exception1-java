package entities;

import java.util.Objects;

public class Client {
    private String email;
    private String nome;

    public Client(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(email, client.email) && Objects.equals(nome, client.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, nome);
    }
}
