import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente extends Pessoa{
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private ArrayList<Livro> livrosSeguidos = new ArrayList<>();
    private int cor;
    

    public Cliente()
    {
        this.SetInfo("0", "0", "0");
        this.setId("0");
        this.setSenha("0");
    }

    void DevolverLivro(int number){
        livrosEmprestados.remove(number-1);
    }

    int getCor(){
        return cor;
    }

    void setCor(int cor){
        this.cor = cor;   
    }

    public int getEmprestadosSize() // Determina o tamanho de array de livros emprestados do cliente
    {
        return livrosEmprestados.size();
    }

    
    int seguir(Livro livro) // Adiciona o livro para uma lista separada do usuario, que te notifica caso algum livro seja atualizado.
    {
        int tam = livrosSeguidos.size();
        Livro copia;
        for (int i = 0; i < tam; i++)
    	{
            copia = livrosSeguidos.get(i);
            if (livro.idLivro == copia.idLivro) { return 0; }
        }
        livro.last = livro.qtd;
        livrosSeguidos.add(livro);
        return 1;
    }

    int pegarEmprestado(Livro livro)
    {
        int tam = livrosEmprestados.size();
        Livro copia;
        for (int i = 0; i < tam; i++)
    	{
			copia = livrosEmprestados.get(i);
            if (livro.idLivro == copia.idLivro) { return 0; }
		}

        if (livro.qtd <= 0) { return -1; }

        livrosEmprestados.add(livro);
        livro.qtd--;
        return 1;
    }

    void DevolverLivro(Livro livro, ArrayList<Livro> livros)
    {
        Livro copia;
        int tam = livros.size();
        for (int i = 0; i < tam; i++)
    	{
			copia = livros.get(i);
            if (livro.idLivro == copia.idLivro) { livros.get(i).qtd++; break; }
		}
        livrosEmprestados.remove(livro);
    }

    void Inventario(Scanner scan, ArrayList<Livro> livros) // Visualiza e devolve os livros que voce tem emprestado
    {
        int menu = 10;
        int tam;
        do{
            tam = livrosEmprestados.size();
            Visual.displayInventarioInicio(this);
            for (int i = 0; i < tam; i++)
    	    {Visual.printEmprestado(this, livrosEmprestados.get(i), i);}
            Visual.fimBorda(this);
            Visual.DevolverTooltip();
            try {menu = scan.nextInt(); } 
		    catch (InputMismatchException e)
		    { scan.next(); menu = 10; }

            if (menu <= 0) {return;}
            else if (menu <= tam) {
                DevolverLivro(livrosEmprestados.get(menu-1), livros); // Devolve o livro que voce selecionar com o numero mostrado
            }


        } while ( menu != 0);
    }

    void Seguidos(Scanner scan, ArrayList<Livro> livros)
    {
        int menu = 10;
        int tam;
        do{
            tam = livrosSeguidos.size();
            Visual.displaySeguidosInicio(this);
            for (int i = 0; i < tam; i++)
    	    {
                Visual.printSeguido(this, livrosSeguidos.get(i), i);
                livrosSeguidos.get(i).last = livrosSeguidos.get(i).qtd;
            }
            Visual.fimBorda(this);
            Visual.SeguirTooltip();
            try {menu = scan.nextInt(); } 
		    catch (InputMismatchException e)
		    { scan.next(); menu = 10; }

            if (menu <= 0) {return;}
            else if (menu <= tam) {
                livrosSeguidos.remove(livrosSeguidos.get(menu-1)); // Esqueçe o livro que voce selecionar com o numero mostrado
            }


        } while ( menu != 0);
    }

    void navegarLivros(Scanner scan, ArrayList<Livro> livros) // A funçao para ver o catalogo de livros disponiveis e suas informaçoes
    {
        
        int menu = 10;
        Livro livro;
        do 
	{
		verLivros(livros);
        Visual.EscolhaLivro();
		try {menu = scan.nextInt(); } 
		catch (InputMismatchException e)
		{ scan.next(); menu = 10; }
				
        if (menu <= 0) {return;}
        if (menu > livros.size()) {} // prevente acessar array fora de bounds
        else 
        {
            livro = livros.get(menu-1);
            infoLivro(scan, livro);
        }
		
	} while (menu != 0);
    }

    void infoLivro(Scanner scan, Livro livro) // Quando voce escolhe um livro da lista em navegarLivros, te permitindo emprestar ou seguir
    {
        int menu = 10;
        int retorno;
        do 
        {
            Visual.infoLivro(this, livro);
            try {menu = scan.nextInt(); } 
            catch (InputMismatchException e)
            { scan.next(); menu = 10; }
                    switch (menu)
                      {
                         case 1 :
                         retorno = pegarEmprestado(livro);
                         if (retorno == 1) { Visual.EmprestadoComSucesso();}
                         else if (retorno == -1) { Visual.SemLivro(); }
                         else if (retorno == 0) { Visual.JaTemoLivro(); }
                        scan.nextLine();
                        Visual.EnterParaContinuar();
                        scan.nextLine();
                         break;
        
                          case 2 :
                          retorno = seguir(livro);
                          if (retorno == 0) {Visual.JaSeguindo();}
                          if (retorno == 1) {Visual.Seguiu();}
                          scan.nextLine();
                          Visual.EnterParaContinuar();
                          scan.nextLine();
                          break;
        
                          case 0 :
                          break;
              
                          default :
                          System.out.print(">>> Entrada invalida!\n");
                      }
              
        } while (menu != 0);
    }

    int verificarMudança(ArrayList<Livro> livros) // Verifica se algum dos livros seguidos do cliente teve sua quantidade alterada, e se sim, retorna a flag positiva
    {
        Livro copia; Livro copiaseg;
        int i; int j;
        for (i = 0; i < livrosSeguidos.size(); i++)
        {
            copiaseg = livrosSeguidos.get(i);
            for (j = 0; j < livros.size(); j++)
            {
                copia = livros.get(j);
                if (copia.idLivro.equals(copiaseg.idLivro))
                {
                    if (copia.qtd != copiaseg.last)
                    {return 1;}
                }

            }
        }
        return 0;
    }
    
    void mudarCor(Scanner scanner){  // easter egg : deixa voce mudar as cores dos prints do usuario
        Visual.mudarCor();
        int value = scanner.nextInt();
        
        switch(value){
            case 1: setCor(1); break;
            case 2: setCor(2); break;
            case 3: setCor(3); break;
            case 4: setCor(4); break;
            case 5: setCor(5); break;
            case 6: setCor(6); break;
            case 7: setCor(7); break;
            case 8: setCor(8); break;
            default: setCor(0); break;
        }
    }

    void feedback(Scanner scan) // Deixa voce enviar uma string para a conta administradora poder ler.
    {
        scan.nextLine();
        String feed;
        Visual.feedback(this);
        feed = scan.nextLine();
        Feedback feedback = new Feedback();
        feedback.setID(this.GetNome());
        feedback.setConteudo(feed);
        Pessoa.enviarFeedback(feedback);
        Visual.feedbackEnviado();
        feed = scan.nextLine();
    }

    int removerConta(Scanner scan, ArrayList<Pessoa> pessoas) // Apenas permite remoçao caso nao tenha nenhum livro a ser devolvido. Pede verificaçao de senha.
	{
        scan.nextLine();
        String input;
		int qtd = livrosEmprestados.size();
        Visual.removerConta(qtd, this);
        if (qtd > 0) { input = scan.nextLine(); return 0; }
        while (true)
        {
            input = scan.nextLine();
            if (input.equals("0")) { return 0; }
            if ( verificarSenha(input) == 1) { pessoas.remove(this); return 1; }
            else {Visual.senhaIncorreta();}
        }
	}
    
    void Menu(Scanner scan, Biblioteca biblioteca) // O menu do cliente.
    {
        int menu = 10;
        int retorno;
        int mudança;
        do 
	{
        mudança = verificarMudança(biblioteca.livros); // Verifica se algum dos livros seguidos foi atualizados
		Visual.displayCliente(this, mudança); // A flag "mudança" e pra poder printar a cor alterada do case 3, como uma notificaçao.
		try {menu = scan.nextInt(); } 
		catch (InputMismatchException e)
		{ scan.next(); menu = 10; }
				switch (menu)
				  {
                     case 1 :
                     navegarLivros(scan, biblioteca.livros);
                     break;
	
					  case 2 :
					  Inventario(scan, biblioteca.livros);
					  break;
	
					  case 3 :
					  Seguidos(scan, livrosEmprestados);
					  break;
	
                      case 4 :
					  retorno = removerConta(scan, biblioteca.pessoas);
                      if (retorno == 1) { return; } // Caso a conta tenha sido removida, manda o cliente de volta para a tela de login
					  break;
	
					  case 5 :
					  feedback(scan); // Escrever feedback ao admin
					  break;

                      case 6 :
                      mudarCor(scan); // Easter egg
					  break;
	
					  case 0 :
					  break;
		  
					  default :
					  System.out.print(">>> Entrada invalida!\n");
				  }
		  
	
	} while (menu != 0);
    }
}
