import java.util.ArrayList;
import java.util.List;

public class LinhaFerroviaria {
    private int numero;
    private float extensaoMetros;
    private String descricao;
    private List<RecursoFerroviario> recursosFerroviarios = new ArrayList<>();

    public LinhaFerroviaria(int numero, float extensaoMetros, String descricao) {
        this.numero = numero;
        this.extensaoMetros = extensaoMetros;
        this.descricao = descricao;
    }

    public void adicionaRecurso(RecursoFerroviario recurso) {
        recursosFerroviarios.add(recurso);
    }
}
