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
        System.out.print("       	     [4] Gerenciar conta\n");
        System.out.print("       	     [5] Enviar feedback\n");
      //System.out.print("       	     [6] Mudar cor do texto\n");
        System.out.print("       	     [0] Sair\n");
        System.out.print("       ____________________________________________________________       \n\n");
        System.out.print(ANSI_RESET + "              ");
    }

}
