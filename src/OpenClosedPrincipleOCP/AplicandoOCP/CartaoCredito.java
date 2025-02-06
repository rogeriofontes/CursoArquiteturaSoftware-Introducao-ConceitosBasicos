package OpenClosedPrincipleOCP.AplicandoOCP;

public class CartaoCredito implements MetodoPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado com cartão de crédito no valor de R$ " + valor);
    }
}
