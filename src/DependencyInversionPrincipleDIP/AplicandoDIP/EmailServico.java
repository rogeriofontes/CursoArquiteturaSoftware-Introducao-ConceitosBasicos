package DependencyInversionPrincipleDIP.AplicandoDIP;

public class EmailServico implements ServicoNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}
