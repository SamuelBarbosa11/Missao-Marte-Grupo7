package missao;

/**
 * Níveis de dificuldade da missão.
 * <p>
 * Cada nível define os recursos entregues ao jogador e a quantidade de
 * obstáculos espalhados pelo mapa. A capacidade da nave acompanha o número de
 * passageiros, de modo que toda dificuldade seja possível de vencer.
 */
public enum Dificuldade {
    FACIL("Fácil", 3, 2, 1, 30),
    MEDIO("Médio", 4, 3, 1, 20),
    DIFICIL("Difícil", 5, 5, 2, 15);

    private String nome;
    private int passageiros;
    private int asteroides;
    private int inimigos;
    private int pontosIniciais;

    Dificuldade(
        String nome,
        int passageiros,
        int asteroides,
        int inimigos,
        int pontosIniciais
    ) {
        this.nome = nome;
        this.passageiros = passageiros;
        this.asteroides = asteroides;
        this.inimigos = inimigos;
        this.pontosIniciais = pontosIniciais;
    }

    public String getNome() { return nome; }

    public int getPassageiros() { return passageiros; }

    public int getAsteroides() { return asteroides; }

    public int getInimigos() { return inimigos; }

    public int getPontosIniciais() { return pontosIniciais; }
}
