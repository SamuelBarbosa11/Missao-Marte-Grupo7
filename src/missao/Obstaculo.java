package missao;

import java.util.Random;

/**
 * Entidade básica que representa um obstáculo no mapa com tipo e
 * coordenadas (x,y).
 * <p>
 * A implementação padrão descreve um obstáculo estático; as subclasses que se
 * deslocam sobrescrevem `isMovel()` para passar a andar a cada turno.
 */
public class Obstaculo {
    private String tipo;
    private int x;
    private int y;

    public Obstaculo(String tipo, int x, int y) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
    }

    public String getTipo() { return tipo; }

    public int getX() { return x; }

    public int getY() { return y; }

    /**
     * Verifica colisão simples por coincidência de coordenadas entre obstáculo
     * e `Nave`.
     *
     * @param n nave a comparar
     * @return true se as coordenadas coincidirem
     */
    public boolean colideCom(Nave n) {
        return n.getX() == x && n.getY() == y;
    }

    /**
     * Indica se o obstáculo se desloca a cada turno. A implementação padrão
     * vale false e as subclasses sobrescrevem esse comportamento.
     *
     * @return true se o obstáculo anda pelo mapa
     */
    public boolean isMovel() {
        return false;
    }

    /**
     * Sorteia uma das quatro direções e desloca o obstáculo, respeitando a
     * borda do mapa e a base em (0,0). Obstáculos estáticos ignoram a chamada.
     *
     * @param random gerador aleatório reutilizável
     * @param limite coordenada máxima alcançável em qualquer direção
     */
    public void mover(Random random, int limite) {
        if (!isMovel()) return;
        int novoX = x;
        int novoY = y;
        switch (random.nextInt(4)) {
            case 0:
                novoY--;
                break;
            case 1:
                novoY++;
                break;
            case 2:
                novoX--;
                break;
            default:
                novoX++;
                break;
        }
        // fora do mapa o obstáculo simplesmente não anda naquele turno
        if (novoX < -limite || novoX > limite) return;
        if (novoY < -limite || novoY > limite) return;
        // (0,0) é a base para onde a nave volta após colidir; deixar um
        // obstáculo ocupá-la faria a nave colidir de novo sem poder reagir
        if (novoX == 0 && novoY == 0) return;
        x = novoX;
        y = novoY;
    }
}
