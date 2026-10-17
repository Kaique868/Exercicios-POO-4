import java.util.ArrayList;
import java.util.List;


abstract class Personagem {
    private String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public abstract void atacar();
}


class Guerreiro extends Personagem {
    private int força;

    public Guerreiro(String nome, int força) {
        super(nome);
        this.força = força;
    }

    @Override
    public void atacar() {
        int dano = força * 3;
        System.out.printf("[Guerreiro] %s avança com sua espada e desfere um golpe pesado! Dano Físico: %d HP%n",
                getNome(), dano);
    }
}


class Mago extends Personagem {
    private int poderMagico;

    public Mago(String nome, int poderMagico) {
        super(nome);
        this.poderMagico = poderMagico;
    }

    @Override
    public void atacar() {
        int dano = poderMagico * 4;
        System.out.printf("[Mago] %s canaliza energia arcana e lança uma bola de fogo! Dano Mágico: %d HP%n",
                getNome(), dano);
    }
}

class Arqueiro extends Personagem {
    private int precisao;

    public Arqueiro(String nome, int precisao) {
        super(nome);
        this.precisao = precisao;
    }

    @Override
    public void atacar() {
        int dano = precisao * 2 + 10; // Bônus fixo de precisão
        System.out.printf("[Arqueiro] %s dispara uma flecha certeira à distância! Dano Crítico: %d HP%n",
                getNome(), dano);
    }
}


