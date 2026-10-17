import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de pagamentos genéricos (Polimorfismo)
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito("Ana Silva"));
        pagamentos.add(new Boleto("Carlos Oliveira"));
        pagamentos.add(new Pix("Beatriz Souza"));

        double valorCompra = 100.00;

        System.out.println("=== PROCESSANDO PAGAMENTOS ===");

        for (Pagamento p : pagamentos) {
            p.processar(valorCompra);
        }
    }
}
