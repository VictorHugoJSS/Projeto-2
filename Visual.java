public class Visual {

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
        System.out.print("\n                 Entrar:\n\n");
        System.out.print("       	     [1] Realizar login\n");
        System.out.print("       	     [2] Cadastrar nova conta\n");
        System.out.print("             ________________________________________________\n\n");
        System.out.print("       	     [3] Sobre\n");
        System.out.print("       	     [4] Termos de uso\n");
        System.out.print("       	     [5] Mudar cor do texto\n");
        System.out.print("       	     [0] Sair\n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }

    public static void displayLoginID()
    {
        System.out.print("\n\n\n                                 ~LOGIN~                                 \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("\n                 Digite o ID de usuario, ou 0 para voltar. \n\n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }
    
    public static void displayLoginSenha(String nome)
    {
        System.out.print("\n\n\n                                 ~LOGIN~                                 \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("\n                 Tentando entrar com o ID: " + nome + "\n\n ");
        System.out.print("\n                 Digite sua senha, ou 0 para voltar : \n\n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("              ");
    }

    public static void displayCliente(Cliente cliente)
    {   
        switch (cliente.getCor())
        {
            case 0 : System.out.print(ANSI_RESET); break;
            case 1 : System.out.print(ANSI_RED); break;
            case 2 : System.out.print(ANSI_GREEN); break;
            case 3 : System.out.print(ANSI_YELLOW); break;
            case 4 : System.out.print(ANSI_BLUE); break;
            case 5 : System.out.print(ANSI_CYAN); break;
            case 6 : System.out.print(ANSI_PURPLE); break;
            case 7 : System.out.print(ANSI_BLACK); break;
            case 8 : System.out.print(ANSI_WHITE); break;
        }

        System.out.print("\n\n\n                               ~BEM VINDO~                               \n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print("                 Voce esta logado como " + cliente.GetNome() + ".\n");
        System.out.print("             ________________________________________________\n");
        System.out.print("\n                 Livros:\n\n");
        System.out.print("       	     [1] Procurar livros\n");
        System.out.print("       	     [2] Ver seu inventario\n");
        System.out.print("       	     [3] Notificaçoes de livros seguidos\n");
        System.out.print("             ________________________________________________\n\n");
        System.out.print("       	     [4] Dados da conta\n");
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
        

        System.out.print("\n\n\n                                 ~INVENTARIO~                               \n");
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
        System.out.print("\n\n                 ID  : " + livro.idLivro + " | Autor : " + livro.autor);
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
        System.out.print("\n\n\n                             ~" +livro.getTitulo()+ "~                               \n");
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

    public static void IdNaoDisponivel()
    {
        System.out.print(ANSI_GREEN + "\n        >>>Esse ID nao esta disponivel, tente outro.\n" + ANSI_RESET);
    }

    public static void EscolhaLivro()
    {
        System.out.print(ANSI_GREEN + "\n        >>>Digite o numero do livro que voce quer consultar, ou digite [0] para voltar.\n" + ANSI_RESET);
    }

    public static void JaTemoLivro()
    {
        System.out.print(ANSI_RED + "\n        >>>Voce ja tem esse livro!.\n" + ANSI_RESET);
    }

    public static void SemLivro()
    {
        System.out.print(ANSI_RED + "\n        >>>Nao ha copias disponiveis do livro!.\n" + ANSI_RESET);
    }

    public static void EmprestadoComSucesso()
    {
        System.out.print(ANSI_GREEN + "\n        >>>LIvro adquirido com sucesso, confira seu inventario!.\n" + ANSI_RESET);
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

    
}
