Um sistema de e-commerce, como a Amazon, separa as responsabilidades de cada serviço. 
Há um serviço específico para pedidos, outro para pagamentos e outro para envio. 
Isso evita um código monolítico difícil de manter.

# Single Responsibility Principle (SRP)

No Pacote ViolandoSRP, temos a classe Pedido que viola o princípio SRP.

🛑 O que está errado?
Essa classe faz muitas coisas: gerencia o pedido, acessa o banco de dados e envia e-mails.]
Se algo precisar mudar no envio de e-mails, a classe Pedido será afetada, o que não faz sentido.

🔧 Como corrigir?
Separe as responsabilidades. Crie uma classe para gerenciar o pedido, outra para acessar o banco de dados e outra para enviar e-mails.

# Conclusão
AplicandoSRP, você terá um código mais organizado e fácil de manter.
E cada classe tem apenas uma responsabilidade, facilitando a manutenção.