public class Locomotiva extends RecursoFerroviario {
  private float capacidadeTracao;

  public Locomotiva(String numeroDeSerie, float comprimento, float capacidadeTracao) {
      super(numeroDeSerie, comprimento);
      this.capacidadeTracao = capacidadeTracao;
  }
}
