import java.util.ArrayList;
import java.util.List;

abstract class Pagamento {
    private String titular;

    public Pagamento(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }


    public abstract void processar(double valor);
}

class CartaoCredito extends Pagamento {
    private static final double TAXA = 0.05;

    public CartaoCredito(String titular) {
        super(titular);
    }

    @Override
    public void processar(double valor) {
        double valorFinal = valor * (1 + TAXA);
        System.out.printf("[Cartão de Crédito] Titular: %s | Valor original: R$ %.2f | Taxa (5%%): R$ %.2f | Total: R$ %.2f%n",
                getTitular(), valor, valor * TAXA, valorFinal);
    }
}


class Boleto extends Pagamento {
    private static final double TAXA_FIXA = 2.50;

    public Boleto(String titular) {
        super(titular);
    }

    @Override
    public void processar(double valor) {
        double valorFinal = valor + TAXA_FIXA;
        System.out.printf("[Boleto BCP] Titular: %s | Valor original: R$ %.2f | Taxa bancária: R$ %.2f | Total: R$ %.2f%n",
                getTitular(), valor, TAXA_FIXA, valorFinal);
    }
}

class Pix extends Pagamento {
    private static final double DESCONTO = 0.10;

    public Pix(String titular) {
        super(titular);
    }

    @Override
    public void processar(double valor) {
        double valorFinal = valor * (1 - DESCONTO);
        System.out.printf("[Pix] Titular: %s | Valor original: R$ %.2f | Desconto (10%%): R$ %.2f | Total: R$ %.2f%n",
                getTitular(), valor, valor * DESCONTO, valorFinal);
    }
}

