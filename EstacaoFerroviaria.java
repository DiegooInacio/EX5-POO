import java.util.List;

public class EstacaoFerroviaria {
    private String sigla;
    private String descricao;
    private List<LinhaFerroviaria> linhasFerroviarias;

    public EstacaoFerroviaria(String sigla, String descricao, List<LinhaFerroviaria> linhasFerroviarias) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.linhasFerroviarias = linhasFerroviarias;
    }
}
