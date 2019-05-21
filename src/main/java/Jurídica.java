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

    public void adicionarSocio(Pessoa socio, double percentualDeParticipacao){
        CotaSociedade novaCota = new CotaSociedade();
        novaCota.socio = socio;
        novaCota.percentualDeParticipacao = percentualDeParticipacao;
    }

    public void removerSocio(Pessoa sócio, double PercentualDeParticipação){

    }

    private class CotaSociedade {
        private double percentualDeParticipacao;
        private Pessoa socio;

    }
}
