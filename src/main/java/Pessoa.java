import java.util.UUID;

public abstract class Pessoa {
    private UUID id;
    private String nome;
    private CotaSociedade sócio;

    public Pessoa(String nome){
        this.id = UUID.randomUUID();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public UUID getId() {
        return id;
    }
}
