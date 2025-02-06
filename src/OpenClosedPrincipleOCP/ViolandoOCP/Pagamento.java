package OpenClosedPrincipleOCP.ViolandoOCP;

public class Pagamento {
    public void pagar(String metodo, double valor) {
        if (metodo.equals("CartaoCredito")) {
            System.out.println("Pagando com cartão de crédito...");
        } else if (metodo.equals("Pix")) {
            System.out.println("Pagando com Pix...");
        }
    }
}
