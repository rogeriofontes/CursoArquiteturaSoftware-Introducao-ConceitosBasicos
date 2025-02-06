O Facebook tem interfaces separadas para diferentes tipos de usuários: 
um usuário comum, um administrador e um moderador têm diferentes permissões.

# Interface Segregation Principle (ISP)
A interface obriga todos a implementarem programar(), mesmo que nem todos precisem.

🛑 O que está errado?
Se um usuário comum não precisa programar, ele terá que implementar um método vazio.
A interface obriga todos a implementarem programar(), mesmo que nem todos precisem.

🔧 Como corrigir?
Crie interfaces específicas para cada tipo de usuário.
Agora, cada classe implementa apenas os métodos necessários.
