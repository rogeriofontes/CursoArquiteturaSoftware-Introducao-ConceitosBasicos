package DependencyInversionPrincipleDIP.AplicandoDIP;

public class SMSServico implements ServicoNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
