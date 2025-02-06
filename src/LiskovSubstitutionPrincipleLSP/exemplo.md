A Uber tem diferentes tipos de veículos (UberX, Uber Black, Uber Moto). 
Um usuário pode chamar qualquer tipo de carro sem precisar saber os detalhes técnicos, 
pois todos seguem o mesmo contrato de transporte.

# Liskov Substitution Principle (LSP)

No Pacote ViolandoLSP, temos a classe Retângulo que viola o princípio LSP.

🛑 O que está errado?
A classe Bicicleta não pode ser usada como um Veiculo sem problemas, porque lança uma exceção.

🔧 Como corrigir?
Crie uma classe abstrata ou interface Veiculo e faça Bicicleta implementá-la.

# Conclusão
AplicandoLSP, você terá um sistema mais coeso e menos propenso a exceções inesperadas.