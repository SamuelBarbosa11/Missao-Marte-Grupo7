package missao;

/**
 * Obstáculo especializado: Asteroide. Subclasse de `Obstaculo` que mantém o
 * comportamento padrão de permanecer estático no mapa.
 */
public class Asteroide extends Obstaculo {
    public Asteroide(int x, int y) {
        super("Asteroide", x, y);
    }
}
