package DependencyInversionPrincipleDIP.ViolandoDIP;

public class Notificacao {
    private EmailServico emailServico = new EmailServico(); // DEPENDÊNCIA DIRETA

    public void enviarNotificacao(String mensagem) {
        emailServico.enviarEmail(mensagem);
    }
}
