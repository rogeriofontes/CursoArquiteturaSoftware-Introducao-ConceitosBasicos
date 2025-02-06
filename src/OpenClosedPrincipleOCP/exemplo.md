O Netflix adiciona novos métodos de pagamento sem modificar o código existente. 
Quando lançaram Pix no Brasil, a arquitetura foi preparada para expandir sem alterar funcionalidades anteriores.

# Open/Closed Principle (OCP)

No Pacote ViolandoOCP, temos a classe Pagamento que viola o princípio OCP.

🛑 O que está errado?
Essa classe precisa ser modificada toda vez que um novo método de pagamento é adicionado.
Aumento a complexidade e o risco de bugs no sistema.

🔧 Como corrigir?
Crie uma interface Pagamento e classes concretas para cada método de pagamento.
Assim, você pode adicionar novos métodos sem alterar o código existente.

# Conclusão
AplicandoOCP, você terá um sistema mais flexível e menos propenso a erros.