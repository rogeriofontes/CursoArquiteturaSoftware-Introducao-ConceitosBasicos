package DependencyInversionPrincipleDIP.AplicandoDIP;

public class Notificacao {
    private ServicoNotificacao servicoNotificacao;

    public Notificacao(ServicoNotificacao servicoNotificacao) {
        this.servicoNotificacao = servicoNotificacao;
    }

    public void enviarNotificacao(String mensagem) {
        servicoNotificacao.enviar(mensagem);
    }
}
