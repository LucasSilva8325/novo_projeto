package entity;

public class UserTest {


    private String nome;
    private String end;

    public UserTest(String nome, String end) {
        this.nome = nome;
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Inserted dates end=" + end + ", nome=" + nome;
    }
}