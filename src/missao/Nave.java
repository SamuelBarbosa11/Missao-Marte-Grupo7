package missao;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a nave do jogador, responsável pela posição e pelos passageiros
 * embarcados.
 */
public class Nave {
    private String id;
    private int x;
    private int y;
    private int capacidade;
    private int vidas;
    private int limite;
    private List<Passageiro> passageiros = new ArrayList<>();

    /**
     * Cria uma nova nave com identificador, capacidade, vidas e limite de mapa.
     *
     * @param id identificador da nave
     * @param capacidade número máximo de passageiros que podem ser embarcados
     * @param vidas número inicial de vidas da nave
     * @param limite coordenada máxima que a nave pode alcançar em qualquer direção
     */
    public Nave(String id, int capacidade, int vidas, int limite) {
        this.id = id;
        this.capacidade = capacidade;
        this.vidas = vidas;
        this.limite = limite;
        this.x = 0;
        this.y = 0;
    }

    /**
     * Cria uma nave sem restrição prática de mapa, usando o limite 10 que
     * corresponde ao maior mapa aceito pelo jogo.
     *
     * @param id identificador da nave
     * @param capacidade número máximo de passageiros que podem ser embarcados
     * @param vidas número inicial de vidas da nave
     */
    public Nave(String id, int capacidade, int vidas) {
        this(id, capacidade, vidas, 10);
    }

    /**
     * Cria uma nova nave com identificador e capacidade.
     *
     * @param id identificador da nave
     * @param capacidade número máximo de passageiros que podem ser embarcados
     */
    public Nave(String id, int capacidade) {
        this(id, capacidade, 3);
    }

    /**
     * Cria uma nave com a capacidade padrão de 4 passageiros e 3 vidas.
     */
    public Nave(String id) {
        this(id, 4, 3);
    }

    public String getId() { return id; }

    public int getX() { return x; }

    public int getY() { return y; }

    public int getCapacidade() { return capacidade; }

    public int getVidas() { return vidas; }

    public int getLimite() { return limite; }

    public List<Passageiro> getPassageiros() { return passageiros; }

    public void resetarPosicao() {
        this.x = 0;
        this.y = 0;
    }

    public boolean perderVida() {
        if (vidas > 0) {
            vidas--;
            return true;
        }
        return false;
    }

    /**
     * Move a nave uma posição para cima (y--), respeitando a borda do mapa.
     *
     * @return true se a nave se moveu, false caso contrário
     */
    public boolean moveUp() {
        if (y > -limite) {
            y--;
            return true;
        }
        return false;
    }

    /**
     * Move a nave uma posição para baixo (y++), respeitando a borda do mapa.
     *
     * @return true se a nave se moveu, false caso contrário
     */
    public boolean moveDown() {
        if (y < limite) {
            y++;
            return true;
        }
        return false;
    }

    /**
     * Move a nave uma posição para a esquerda (x--), respeitando a borda do mapa.
     *
     * @return true se a nave se moveu, false caso contrário
     */
    public boolean moveLeft() {
        if (x > -limite) {
            x--;
            return true;
        }
        return false;
    }

    /**
     * Move a nave uma posição para a direita (x++), respeitando a borda do mapa.
     *
     * @return true se a nave se moveu, false caso contrário
     */
    public boolean moveRight() {
        if (x < limite) {
            x++;
            return true;
        }
        return false;
    }

    /**
     * Tenta embarcar um passageiro na nave.
     *
     * @param p passageiro a embarcar
     * @return true se houve espaço e o embarque foi bem-sucedido
     */
    public boolean embarcar(Passageiro p) {
        // Verifica se há espaço disponível e adiciona o passageiro à lista
        if (passageiros.size() < capacidade) {
            passageiros.add(p);
            return true;
        }
        return false;
    }
}
