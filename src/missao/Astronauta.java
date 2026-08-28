package missao;

/**
 * Passageiro especializado: Astronauta.
 * <p>
 * Representa um tripulante com foco em operações espaciais e exploração.
 */
public class Astronauta extends Passageiro {

  public Astronauta(String nome, int x, int y) {
    super(nome, "Astronauta", x, y);
  }

  @Override
  public int getPontuacaoEmbarque() {
    return 20;
  }
}
