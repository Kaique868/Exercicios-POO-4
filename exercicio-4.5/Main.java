import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um grupo de personagens sob a referência da superclasse Personagem
        List<Personagem> grupo = new ArrayList<>();

        grupo.add(new Guerreiro("Thorin", 15));
        grupo.add(new Mago("Gandalf", 20));
        grupo.add(new Arqueiro("Legolas", 12));

        System.out.println("=== TURNO DE COMBATE POLIMÓRFICO ===");

        
        for (Personagem p : grupo) {
            p.atacar();
        }
    }
}