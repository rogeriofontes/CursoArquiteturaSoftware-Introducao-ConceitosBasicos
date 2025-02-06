A Amazon usa injeção de dependência para desacoplar serviços. 
Por exemplo, o serviço de e-mail pode ser trocado de Amazon SES para 
SendGrid sem alterar a aplicação.

# Dependency Inversion Principle (DIP)

No Pacote ViolandoDIP, temos a classe Pedido que viola o princípio DIP.

🛑 O que está errado?
O Notificacao está fortemente acoplado ao EmailServico. 
Se quisermos trocar para outro serviço, precisaremos modificar o código.

🔧 Como corrigir?
Crie uma interface ServicoNotificacao e faça EmailServico implementá-la.
Assim, você pode trocar o serviço de e-mail sem alterar a classe Pedido.

Agora, podemos mudar o serviço de notificação sem alterar a classe Notificacao.