# Projeto 2 - Sistema de livraria
### Matheus Veríssimo /// Victor Hugo

## Estrutura central do projeto :
- Tres classes para pessoas :
  1. Clientes que emprestam e navegam pelos livros, e podem cadastrar e remover suas contas, alem de ter um menu interativo mais bonito
  2. Funcionarios, que tem suas contas criadas pelo administrador
  3. Administrador, que cria funcionarios, recebe feedback, e pode ver algumas informações que os outros não podem
 
- Biblioteca contendo a logica de login para tanto clientes quanto funcionarios/administrador, tambem servindo como o cadastro de clientes :
  - Contem o array de todas as pessoas envolvidas, e um array para armazenar os objetos Livros e seus parametros
 
  ![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/22c1b0ff-2d6f-4bd4-8124-e97833e372f2)
  
  ![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/b9676140-a7db-4226-8937-4bdfa273dd05)

  ![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/e1260fed-73bb-4e8d-b914-333fbd3568ab) 
![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/82050224-a514-413f-8348-0c7f323a586d)




## Requisitos adicionais :
- Ao inves de livros apenas estarem disponiveis ou indisponiveis, eles tem uma certa quantidade de copias disponiveis que podem ser atualizadas por funcionarios.
![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/14095d31-bbfe-46bc-b1a2-c52d253d7acd)

- Usuarios podem optar por "seguir" um livro para ser notificado sobre suas mudanças de quantidade. Por exemplo, caso outro cliente pegue um livro emprestado ou devolva um livro
  ![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/10993778-7b32-481c-8f7b-d7199335e6cc)

  ![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/6ab4cc04-61d7-4674-adba-d144ee305e6f)

- Usuarios podem enviar feedback para o administrador
![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/664709b4-928d-40be-a8a2-271033cad987)
![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/337091c9-5bf6-454d-800a-092ffdba63ef)

Alem de outros departamentos maiores, como a maioria da classe Administrador, enfeites, etc.

## Requisitos de avaliação :
### Polimorfismo 
Esse projeto faz uso de polimorfismo de diversas formas : 
- Todos os tres tipos de usuarios usam o mesmo metodo de login, todos indo para um metodo Menu(), com esse menu sendo completamente diferente para cada.
- Casos de downcasting para tratar casos de classes diferentes usando um mesmo array para pessoas
- Funçao de remover contas tem comportamento completamente diferente de clientes para administradores
![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/1f6666a9-6081-476b-b42a-2a64c489d6ff)

![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/0e1f825a-5d3b-4311-a890-02da7aec9ec0)

### Arraylist
Existem usos de arraylist não apenas para atender o minimo, mas tambem foi usado para alguns requisitios adicionais, como
- Um arraylist de livros do cliente separado para livros que ele apenas seguiu
- O feedback com a string é armazenado por meio de um arraylist
Toda a logica faz grande uso desse recurso, as vezes fazendo extensivo uso de varios apontadores em seguida para ter que declarar menos variaveis, ou comparando dois arrays
![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/e5898a68-b10c-4153-81af-97679b652ecd)
![image](https://github.com/nodemi-alt/Projeto-2/assets/163960947/ac131365-b8f3-42d1-857d-6c0e0bcaec30)

### Encapsulamento
Sempres tentamos tratar o encapsulamento da forma que nem imaginamos as coisas funcionando na pratica.
- O atributo "Senha" nunca deve ser passado para o ambiente do fluxo de interaçao de um usuario, e ao inves disso eles apenas chamam um metodo separado para comparar entradas e verificar se a senha esta correta
- O administrador deve ser uma classe privada, e mesmo para enviar algo simples como uma string de feedback para ele, deve ser por um meio indireto
- Os livros sao relativamente publicos e soltos, logo os atributos deles podem ser acessados mesmo sem getters/setters
- 

### Abstração
Nem todos os arquivos são "classes" em si, mas sim algo feito uma estrutura. Mas as classes apropriadamente ditas são os tipos diferentes de usuarios, que tem suas ações bem distintas das outras. 
O administrador cria funcionarios e consegue ver detalhes privados das informações.
Funcionarios são encarregados de gerenciar, adicionar e remover livros
Usuarios querem adiquirir or visualizar os livros, querem um menu visual melhor, querem mais avisos e outputs do proprio programa, mais dinamismo de interação, e poder controlar coisas como as cores e suas notificações.

### Easter Egg ao cliente :
Existe uma opção escondida no menu do cliente para poder alterar as cores dos seus menus.
Cada cliente tem seu proprio campo da configuração da cor que é persistente. A cor escolhida não afeta padrões especificos como mensagems genericas do sistema serem verdes, ou vermelho para mostrar que algo está indisponivel ou foi reduzido, assim o usuario pode trocar suas cores sem afetar a usabilidade/intuitividade

### Entrega : (((esse arquivo)))


