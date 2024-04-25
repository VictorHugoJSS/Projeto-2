public class Visual {

public static final String ANSI_GREEN = "\u001B[32m";

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


    public static void limparTela() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}   
