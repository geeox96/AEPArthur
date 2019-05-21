import java.util.HashSet;
import java.util.Set;

public class Jurídica extends Pessoa     {
    private String cnpj;
    private double capitalSocial;
    private Set<CotaSociedade> cotaSociedade = new HashSet<>();

    public Jurídica(String nome, String cnpj, double capitalSocial){
        super(nome);
        this.capitalSocial = capitalSocial;
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getCapitalSocial() {
        return capitalSocial;
    }

    public void adicionarSocio(Pessoa sócio){
        CotaSociedade novaCota = new CotaSociedade();
        novacCota.socio = sócio;
        novaCota.percentualDeParticipação = percentualDeParticiação;
    }

    public void removerSocio(Pessoa sócio, double PercentualDeParticipação){

    }

    private class CotaSociedade {
        private double percentualDeParticipação;
        private Pessoa sócio;

    }
}
