package OpenClosedPrincipleOCP.AplicandoOCP;

public class Pix implements MetodoPagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado com Pix no valor de R$ " + valor);
    }
}
