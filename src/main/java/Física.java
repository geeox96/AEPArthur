public class Física extends Pessoa {
    private String cpf;
    private String rg;

    public Física(String nome, String cpf, String rg){
        super(nome); // construtor da superclasse (Pessoa)
        this.rg = rg;
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}
