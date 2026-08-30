package missao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Representa o estado da missão: nave, passageiros e obstáculos.
 * Fornece operações para detectar colisões, localizar passageiros na posição
 * da nave e embarcar passageiros.
 */
public class Missao {
    private Nave nave;
    private List<Passageiro> passageiros = new ArrayList<>();
    private List<Obstaculo> obstaculos = new ArrayList<>();

    public Missao(Nave nave) {
        this.nave = nave;
    }

    public Nave getNave() {
        return nave;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public List<Obstaculo> getObstaculos() {
        return obstaculos;
    }

    /**
     * Adiciona um passageiro ao mapa da missão.
     *
     * @param p passageiro a adicionar
     */
    public void addPassageiro(Passageiro p) { passageiros.add(p); }

    /**
     * Adiciona um obstáculo ao mapa da missão.
     *
     * @param o obstáculo a adicionar
     */
    public void addObstaculo(Obstaculo o) { obstaculos.add(o); }

    /**
     * Retorna o primeiro obstáculo encontrado na mesma posição da nave,
     * ou `null` se não houver nenhum.
     *
     * @return `Obstaculo` na posição da nave ou `null`
     */
    public Obstaculo obstaculoNaPosicao() {
        // Percorre todos os obstáculos e devolve o que coincidir com a posição
        // da nave. Uso de método em Obstaculo encapsula a checagem.
        for (Obstaculo o : obstaculos) {
            if (o.colideCom(nave)) return o;
        }
        return null;
    }

    public boolean verificaColisao() {
        // Reaproveita a busca do obstáculo para não repetir o laço de colisão.
        return obstaculoNaPosicao() != null;
    }

    /**
     * Desloca os obstáculos móveis do mapa. Obstáculos estáticos ignoram a
     * chamada, então o método pode ser invocado a cada turno sem verificação.
     *
     * @param random gerador aleatório reutilizável
     */
    public void moverInimigos(Random random) {
        for (Obstaculo o : obstaculos) {
            o.mover(random, nave.getLimite());
        }
    }

    /**
     * Processa uma colisão: reduz uma vida da nave, reposiciona a nave no centro
     * do mapa e retorna true se a colisão foi registrada.
     */
    public boolean processarColisao() {
        if (!verificaColisao()) {
            return false;
        }
        nave.perderVida();
        nave.resetarPosicao();
        return true;
    }

    /**
     * Retorna o primeiro passageiro encontrado na mesma posição da nave,
     * ou `null` se não houver nenhum.
     *
     * @return `Passageiro` na posição da nave ou `null`
     */
    public Passageiro passagemNaPosicao() {
        // Retorna o primeiro passageiro encontrado na mesma posição da nave.
        for (Passageiro p : passageiros) {
            if (p.getX() == nave.getX() && p.getY() == nave.getY()) return p;
        }
        return null;
    }

    public boolean embarcarPassageiroNaPosicao() {
        // Itera usando Iterator para permitir remoção segura durante iteração.
        Iterator<Passageiro> it = passageiros.iterator();
        while (it.hasNext()) {
            Passageiro p = it.next();
            if (p.getX() == nave.getX() && p.getY() == nave.getY()) {
                // Tenta embarcar na nave; se bem-sucedido, remove do solo
                boolean ok = nave.embarcar(p);
                if (ok) it.remove();
                return ok;
            }
        }
        return false;
    }

    /**
     * Indica se todos os passageiros já foram embarcados.
     *
     * @return true se não restarem passageiros no solo
     */
    public boolean todosEmbarcados() { return passageiros.isEmpty(); }
}
