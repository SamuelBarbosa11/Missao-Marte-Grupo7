package missao;

/**
 * Obstáculo especializado: Inimigo. Subclasse de `Obstaculo` que se desloca
 * aleatoriamente pelo mapa a cada turno.
 */
public class Inimigo extends Obstaculo {
    public Inimigo(int x, int y) {
        super("Inimigo", x, y);
    }

    @Override
    public boolean isMovel() {
        return true;
    }
}
