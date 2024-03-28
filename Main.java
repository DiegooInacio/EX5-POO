import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
      
        Vagao vagao1 = new Vagao("V123", 10.5f, "Carga", 20000f, 9.5f, 1.0f);
        Locomotiva locomotiva1 = new Locomotiva("L456", 14f, 50000f);

        LinhaFerroviaria linha1 = new LinhaFerroviaria(1, 5000, "Principal");
        linha1.adicionaRecurso(vagao1);
        linha1.adicionaRecurso(locomotiva1);

        EstacaoFerroviaria estacaoOrigem = new EstacaoFerroviaria("ESTO", "Estação Origem", Collections.singletonList(linha1));
        EstacaoFerroviaria estacaoDestino = new EstacaoFerroviaria("ESTD", "Estação Destino", Collections.emptyList());

        Trem trem1 = new Trem("NAG1010", new Date(), estacaoOrigem, estacaoDestino, Arrays.asList(vagao1, locomotiva1));

        System.out.println("Trem criado com sucesso!");
    }
}
