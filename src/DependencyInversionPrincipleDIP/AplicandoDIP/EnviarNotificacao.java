package DependencyInversionPrincipleDIP.AplicandoDIP;

public class EnviarNotificacao {
    public static void main(String[] args) {
        ServicoNotificacao emailServico = new EmailServico();
        Notificacao notificacaoEmail = new Notificacao(emailServico);
        notificacaoEmail.enviarNotificacao("Olá! Seu pedido foi confirmado.");

        ServicoNotificacao smsServico = new SMSServico();
        Notificacao notificacaoSMS = new Notificacao(smsServico);
        notificacaoSMS.enviarNotificacao("Olá! Seu pedido foi confirmado.");
    }
}
