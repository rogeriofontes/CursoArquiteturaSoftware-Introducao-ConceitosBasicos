package OpenClosedPrincipleOCP.AplicandoOCP;

public class Pagamento {
    //@Autoride ou @Inject
    private MetodoPagamento metodoPagamento;

    public Pagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void efetuarPagamento(double valor) {
        metodoPagamento.pagar(valor);
    }
}
