import java.util.Date;
import java.util.List;

public class Trem {
    private String prefixo;
    private Date dataFormacao;
    private EstacaoFerroviaria estacaoOrigem;
    private EstacaoFerroviaria estacaoDestino;
    private List<RecursoFerroviario> recursos;

    public Trem(String prefixo, Date dataFormacao, EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino, List<RecursoFerroviario> recursos) {
        if(estacaoOrigem.equals(estacaoDestino)) {
            throw new IllegalArgumentException("A estação de origem não pode ser igual à estação de destino.");
        }
        if(recursos.size() > 150) {
            throw new IllegalArgumentException("Um trem não pode ter mais de 150 recursos.");
        }
        this.prefixo = prefixo;
        this.dataFormacao = dataFormacao;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;
        this.recursos = recursos;
    }
}
