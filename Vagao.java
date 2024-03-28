public class Vagao extends RecursoFerroviario {
  private String tipo;
  private float capacidadeCarga;
  private float comprimentoTesteiras;
  private float comprimentoEngates;

  public Vagao(String numeroDeSerie, float comprimento, String tipo, float capacidadeCarga, float comprimentoTesteiras, float comprimentoEngates) {
      super(numeroDeSerie, comprimento);
      this.tipo = tipo;
      this.capacidadeCarga = capacidadeCarga;
      this.comprimentoTesteiras = comprimentoTesteiras;
      this.comprimentoEngates = comprimentoEngates;
  }
}
