package missao;

/**
 * Entrada do ranking: identifica o piloto, a pontuação alcançada e as
 * informações da partida em que aquele recorde foi feito.
 */
public class RankingEntry {
    private String nome;
    private int pontuacao;
    private String dataHora;
    private int resgatados;
    private Dificuldade dificuldade;

    /**
     * Cria uma entrada de ranking.
     *
     * @param nome nome do piloto
     * @param pontuacao pontuação final da partida
     * @param dataHora momento da partida, no formato dd/MM/yyyy HH:mm
     * @param resgatados quantidade de passageiros embarcados
     * @param dificuldade nível em que a partida foi jogada
     */
    public RankingEntry(
        String nome,
        int pontuacao,
        String dataHora,
        int resgatados,
        Dificuldade dificuldade
    ) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.dataHora = dataHora;
        this.resgatados = resgatados;
        this.dificuldade = dificuldade;
    }

    public String getNome() { return nome; }

    public int getPontuacao() { return pontuacao; }

    public String getDataHora() { return dataHora; }

    public int getResgatados() { return resgatados; }

    public Dificuldade getDificuldade() { return dificuldade; }
}
