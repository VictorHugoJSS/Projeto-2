public class Visual {

    // Essa classe inteira e apenas uma forma de conter os prints mais bagunçados e repetitivos da historia. //

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void displayInicio()
    {
        System.out.print("\n\n\n                               ~BIBLIOTECA~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("                          Bem vindo a biblioteca.\n");
        System.out.print("             ________________________________________________\n");
        System.out.print(ANSI_GREEN + "\n                 Entrar:\n\n" + ANSI_RESET);
        System.out.print("       	     [1] Realizar login\n");
        System.out.print("       	     [2] Cadastrar nova conta\n");
        System.out.print("             ________________________________________________\n\n");
        System.out.print("       	     [3] Sobre\n");
        System.out.print("       	     [4] Termos de uso\n");
        System.out.print("       	     [0] Sair\n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }

    public static void sobreNos(Biblioteca biblioteca)
    {
        int qtdLivros = biblioteca.livros.size();
        System.out.print("\n\n\n                               ~SOBRE NOS~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("               Tentamos trazer um sistema de livraria que \n              alcança eficiencia, estabilidade e segurança.\n\n");
        System.out.print("                O nosso sistema ja tem : \n\n              - ");
        System.out.print( qtdLivros + " livros registrados\n              - ");
        System.out.print( biblioteca.qtdClientes() + " clientes ativos. \n");
        System.out.print("             ________________________________________________\n\n");
        System.out.print("                Trabalho feito por :\n\n");
        System.out.print("       	      - Matheus Verissimo\n");
        System.out.print("       	      - Vitor Hugo\n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }

    public static void termosDeUso()
    {
        System.out.print("\n\n\n                             ~TERMOS DE USO~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("       	- O cliente se compromete a nao roubar os livros.\n");
        System.out.print("       	- O cliente se compromete a nao rasgar os livros.\n");
        System.out.print("       	- Nao jogue fogo, acido ou similares nos livros.\n");
        System.out.print("       	- Nao rasgue os livros.\n");
        System.out.print("       	- Terminantemente proibido escrever, desenhar ou de\n          qualquer forma aplicar sua liberdade artistica nos livros.\n");
        System.out.print("       	- Por favor nao denuncie os livros.\n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }

    public static void mudarCor()
    {
        System.out.print("\n\n\n                               ~MUDAR COR~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("                         Voce achou a opçao secreta!\n");
        System.out.print("             ________________________________________________\n");
        System.out.print("\n                 Cores:\n\n");
        System.out.print("       	     [0] Cor normal\n");
        System.out.print(ANSI_RED + "       	     [1] Vermelho\n" + ANSI_RESET);
        System.out.print(ANSI_GREEN + "       	     [2] Verde\n" + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "       	     [3] Amarelo\n" + ANSI_RESET);
        System.out.print(ANSI_BLUE + "       	     [4] Azul\n" + ANSI_RESET);
        System.out.print(ANSI_CYAN + "       	     [5] Ciano\n" + ANSI_RESET);
        System.out.print(ANSI_PURPLE + "       	     [6] Roxo\n" + ANSI_RESET);
        System.out.print(ANSI_BLACK + "       	     [7] Preto\n" + ANSI_RESET);
        System.out.print(ANSI_WHITE + "       	     [8] Branco\n" + ANSI_RESET);
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }

    public static void displayLoginID()
    {
        System.out.print("\n\n\n                                 ~LOGIN~                                 \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print(ANSI_GREEN + "\n              >>>Digite o ID de usuario, ou 0 para voltar. \n\n" + ANSI_RESET);
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }
    
    public static void displayLoginSenha(String nome)
    {
        System.out.print("\n\n\n                                 ~LOGIN~                                 \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print(ANSI_GREEN + "\n              >>>Tentando entrar com o ID: " + ANSI_RESET + nome + "\n\n ");
        System.out.print(ANSI_GREEN + "\n              >>>Digite sua senha, ou 0 para voltar : \n\n" + ANSI_RESET);
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }

    public static void displayCliente(Cliente cliente, int check)
    {   
        String cor;
        switch ( cliente.getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        System.out.print(cor);

        System.out.print("\n\n\n                               ~BEM VINDO~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("                 Voce esta logado como " + cliente.GetNome() + ".\n");
        System.out.print("             ________________________________________________\n");
        System.out.print("\n                 Livros:\n\n");
        System.out.print("       	     [1] Procurar livros\n");
        System.out.print("       	     [2] Ver seu inventario\n");
        if (check == 0) { System.out.print("       	     [3] Notificaçoes de livros seguidos\n"); }
        else {System.out.print(ANSI_GREEN + "       	     [3] Notificaçoes de livros seguidos\n" + cor); }
        System.out.print("             ________________________________________________\n\n");
        System.out.print("       	     [4] Remover conta\n");
        System.out.print("       	     [5] Enviar feedback\n");
      //System.out.print("       	     [6] Mudar cor do texto\n");
        System.out.print("       	     [0] Sair\n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print(ANSI_RESET + "              ");
    }

    public static void displayLivrosInicio(Pessoa pessoa)
    {   
        if (pessoa instanceof Cliente)
        {
        String cor;
        switch ( ((Cliente) pessoa).getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        System.out.print(cor);
        }

        System.out.print("\n\n\n                                 ~LIVROS~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("\n                 Livros disponiveis:\n\n");
        System.out.print("             ________________________________________________\n");
        System.out.print(ANSI_RESET);
    }

    public static void displaySeguidosInicio(Cliente pessoa)
    {   

        String cor;
        switch ( ((Cliente) pessoa).getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        System.out.print(cor);
        

        System.out.print("\n\n\n                                ~SEGUIDOS~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("                 Livros que voce segue:\n");
        System.out.print("             ________________________________________________\n");
        System.out.print(ANSI_RESET);
    }

    public static void displayInventarioInicio(Cliente pessoa)
    {   

        String cor;
        switch ( ((Cliente) pessoa).getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        System.out.print(cor);
        

        System.out.print("\n\n\n                                ~INVENTARIO~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("                 Livros que voce tem:\n");
        System.out.print(ANSI_RESET);
    }

    public static void printEmprestado(Pessoa pessoa, Livro livro, int i)
    {   
        String cor = ANSI_RESET;
        if (pessoa instanceof Cliente)
        {
        switch ( ((Cliente) pessoa).getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        System.out.print(cor);
        }

       
        System.out.print("\n                 [" + (i+1) + "] - " + livro.titulo);
        System.out.print("\n\n                 ID  : " + livro.idLivro + " | Autor : " + livro.autor);
        System.out.print("\n             ________________________________________________\n");
        System.out.print(ANSI_RESET);
    }

    public static void printSeguido(Pessoa pessoa, Livro livro, int i)
    {   
        String cor = ANSI_RESET;
        if (pessoa instanceof Cliente)
        {
        switch ( ((Cliente) pessoa).getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        System.out.print(cor);
        }

       
        System.out.print("\n                 [" + (i+1) + "] - " + livro.titulo);
        if (livro.qtd != livro.last) { System.out.print(ANSI_GREEN + "  < ----- ATUALIZADO!" + cor); }
        System.out.print("\n\n                 ID  : " + livro.idLivro + " | Autor : " + livro.autor);
        if (livro.qtd > livro.last) { System.out.print("\n\n                 QTD : " + ANSI_GREEN + livro.qtd + cor ); }
        if (livro.qtd < livro.last) { System.out.print("\n\n                 QTD : " + ANSI_RED + livro.qtd + cor ); }
        System.out.print("\n             ________________________________________________\n");
        System.out.print(ANSI_RESET);
    }

    
    public static void printLivro(Pessoa pessoa, Livro livro, int i)
    {   
        String cor = ANSI_RESET;
        if (pessoa instanceof Cliente)
        {
        switch ( ((Cliente) pessoa).getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        System.out.print(cor);
        }

       
        System.out.print("\n                 [" + (i+1) + "] - " + livro.titulo);
        System.out.print("\n\n                 ID  : " + livro.idLivro + "\n                 Autor : " + livro.autor);
        if (livro.getQtd() == 0){ System.out.print("\n                 QTD : " + ANSI_RED + livro.qtd + cor); }
        else{ System.out.print("\n" + "                 QTD : " + livro.qtd); }
        System.out.print("\n             ________________________________________________\n");
        System.out.print(ANSI_RESET);
    }

    public static void infoLivro(Cliente cliente, Livro livro)
    {   
        String cor;
        switch ( cliente.getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        System.out.print(cor);
        int qtd = livro.getQtd();
        System.out.print("\n\n\n                     ~" +livro.getTitulo()+ "~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("             ________________________________________________\n");
        System.out.print("       	     Autor: " + livro.getAutor() + "\n");
        System.out.print("       	     Quantidade disponivel: " + qtd + "\n");
        System.out.print("             ________________________________________________\n\n");
        if (qtd > 0) {System.out.print("       	     [1] Pegar livro emprestado\n");}
        else {System.out.print(ANSI_RED + "       	     [1] Pegar livro emprestado\n" + cor);}
        System.out.print("       	     [2] Adicionar na lista de livros seguidos\n");
        System.out.print("       	     [0] Voltar\n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print(ANSI_RESET + "              ");
    }
    

    public static void displayCadastro(int num, Cliente cliente)
    {
        System.out.print("\n\n\n                                 ~CADASTRO~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("             ________________________________________________\n");

        if (num == -1){
            System.out.print(ANSI_GREEN + "\n        >>>Esse ID nao esta disponivel, tente outro.\n" + ANSI_RESET);
            System.out.print("       ____________________________________________________________       \n\n              "); return;
                        }

        if (num == 0){
        System.out.print(ANSI_GREEN + "\n        >>>Digite seu novo ID de login, ou [0] para voltar :\n" + ANSI_RESET); 
        System.out.print("       ____________________________________________________________       \n\n              "); return;
                     }
        System.out.print("\n                 ID: " + cliente.getId() + "\n");
        System.out.print("             ________________________________________________\n");

        if (num == 1){
            System.out.print(ANSI_GREEN + "\n        >>>Digite seu nome, ou [0] para voltar :\n" + ANSI_RESET); 
            System.out.print("       ____________________________________________________________       \n\n              "); return;
                         }
            System.out.print("\n                 Nome: " + cliente.GetNome() + "\n");
            System.out.print("             ________________________________________________\n");

        if (num == 2){
            System.out.print(ANSI_GREEN + "\n        >>>Digite seu endereço, ou [0] para voltar :\n" + ANSI_RESET); 
            System.out.print("       ____________________________________________________________       \n\n              "); return;
                     }
        System.out.print("\n                 Endereço: " + cliente.GetEndereco() + "\n");
        System.out.print("             ________________________________________________\n");

        if (num == 3){
            System.out.print(ANSI_GREEN + "\n        >>>Digite seu telefone, ou [0] para voltar :\n" + ANSI_RESET); 
            System.out.print("       ____________________________________________________________       \n\n              "); return;
                     }
        System.out.print("\n                 Telefone: " + cliente.GetTelefone() + "\n");
        System.out.print("             ________________________________________________\n");

        if (num == 4){
            System.out.print(ANSI_GREEN + "\n        >>>Por ultimo, digite sua senha, ou [0] para voltar :\n" + ANSI_RESET); 
            System.out.print("       ____________________________________________________________       \n\n              "); return;
                     }
        System.out.print("\n                 Senha : " + cliente.getSenha() + "\n");
        System.out.print("             ________________________________________________\n");

        System.out.print(ANSI_GREEN + "\n        >>>Tudo certo! Aperte \"Enter\" para continuar.\n" + ANSI_RESET);


        System.out.print("       ____________________________________________________________       \n\n");
    }

    public static void removerConta(int i, Cliente cliente)
    {
        String cor;
        switch ( cliente.getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }

        System.out.print(cor);
        System.out.print("\n\n\n                             ~DELETAR CONTA~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        if (i > 0)
         { System.out.print(ANSI_RED + "       	   >>>Erro, voce so pode remover a conta caso nao tenha nenhum livro a devolver! " + cor + "\n           Aperte enter para continuar.\n"); }
        else 
         { System.out.print("       >>> Digite sua senha para confirmar remoçao de conta.\n       [0] para cancelar. \n"); }
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }

    public static void feedback(Cliente pessoa)
    {   

        String cor;
        switch ( ((Cliente) pessoa).getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        System.out.print(cor);
        

        System.out.print("\n\n\n                                 ~FEEDBACK~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("             O que voce nos tem a dizer? O seu feedback e valioso.       \n\n");
        System.out.print("              ________________________________________________\n");
        System.out.print(ANSI_GREEN + "             >>> Digite seu feedback a seguir : " + cor + "\n\n             ");
        System.out.print(ANSI_RESET);
    }

    public static void IdNaoDisponivel()
    {
        System.out.print(ANSI_GREEN + "\n        >>>Esse ID nao esta disponivel, tente outro.\n" + ANSI_RESET);
    }

    public static void EnterParaContinuar()
    {
        System.out.print(ANSI_GREEN + "\n            >>>Aperte enter para continuar.\n" + ANSI_RESET);
    }

    public static void EscolhaLivro()
    {
        System.out.print(ANSI_GREEN + "\n        >>>Digite o numero do livro que voce quer consultar, ou digite [0] para voltar.\n" + ANSI_RESET);
    }

    public static void JaTemoLivro()
    {
        System.out.print(ANSI_RED + "\n        >>>Voce ja tem esse livro!.\n" + ANSI_RESET);
    }

    public static void senhaIncorreta()
    {
        System.out.print(ANSI_RED + "\n        >>>Senha incorreta!\n        " + ANSI_RESET);
    }

    public static void SemLivro()
    {
        System.out.print(ANSI_RED + "\n            >>>Nao ha copias disponiveis do livro!.\n" + ANSI_RESET);
    }

    public static void EmprestadoComSucesso()
    {
        System.out.print(ANSI_GREEN + "\n            >>>LIvro adquirido com sucesso, confira seu inventario!.\n" + ANSI_RESET);
    }

    public static void feedbackEnviado()
    {
        System.out.print(ANSI_GREEN + "\n             >>>Seu feedback foi enviado! Aperte enter para continuar.\n" + ANSI_RESET);
    }

    public static void JaSeguindo()
    {
        System.out.print(ANSI_GREEN + "\n            >>>Voce ja esta seguindo esse livro!.\n" + ANSI_RESET);
    }

    public static void Seguiu()
    {
        System.out.print(ANSI_GREEN + "\n            >>>Livro seguido com sucesso!.\n" + ANSI_RESET);
    }

    public static void DevolverTooltip()
    {
        System.out.print(ANSI_GREEN + "\n            >>>Selecione o numero de um livro para o devolver, ou [0] para voltar.\n" + ANSI_RESET);
    }

    public static void SeguirTooltip()
    {
        System.out.print(ANSI_GREEN + "\n            >>>Selecione o numero de um livro para parar de seguir, ou [0] para voltar.\n" + ANSI_RESET);
    }

    public static void fimBorda(Pessoa pessoa)
    {   
        String cor = ANSI_RESET;
        if (pessoa instanceof Cliente)
        {
        switch ( ((Cliente) pessoa).getCor() )
        {
            case 0 : cor = ANSI_RESET;  break;
            case 1 : cor = ANSI_RED; break;
            case 2 : cor = ANSI_GREEN; break;
            case 3 : cor = ANSI_YELLOW; break;
            case 4 : cor = ANSI_BLUE; break;
            case 5 : cor = ANSI_CYAN; break;
            case 6 : cor = ANSI_PURPLE; break;
            case 7 : cor = ANSI_BLACK; break;
            case 8 : cor = ANSI_WHITE; break;
            default : cor = ANSI_RESET; break;
        }
        }
        System.out.print(cor);
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print(ANSI_RESET + "              ");
    }

    public static void funcionarioMenu(Funcionario funcionario)
    {
    System.out.print("-----------------------------------------------\n");
    System.out.print("[1] - Lista de livros\n");
    System.out.print("[2] - Novo livro\n");
    System.out.print("[3] - Remover livro\n");
    System.out.print("[4] - Alterar quantidade de um livro\n");
	System.out.print("[0] - Sair\n");
    }

}
