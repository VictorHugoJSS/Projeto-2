import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente extends Pessoa{
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
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

    static int Busca(ArrayList<Pessoa> pessoas, String input)
	{
		int num = pessoas.size();
		for (int i = 0; i < num; i++)
    	{
			if ((pessoas.get(i)).getId().equals(input)) { return i; } 
		}
		return -1;
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

    void Inventario(Scanner scan, ArrayList<Livro> livros)
    {
        int menu = 10;
        int tam;
        do{
            tam = livrosEmprestados.size();
            Visual.displayInventarioInicio(this);
            for (int i = 0; i < tam; i++)
    	    {Visual.printEmprestado(this, livrosEmprestados.get(i), i);}
            Visual.fimBorda(this);
            try {menu = scan.nextInt(); } 
		    catch (InputMismatchException e)
		    { scan.next(); menu = 10; }

            if (menu <= 0) {return;}
            else if (menu <= tam) {
                DevolverLivro(livrosEmprestados.get(menu-1), livros);
            }


        } while ( menu != 0);
    }

    void navegarLivros(Scanner scan, ArrayList<Livro> livros)
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
        else 
        {
            livro = livros.get(menu-1);
            infoLivro(scan, livro);
        }
		
	} while (menu != 0);
    }

    void infoLivro(Scanner scan, Livro livro)
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
                         break;
        
                          case 2 :
                          System.out.print(">>> seguir!\n");
                          break;
        
                          case 0 :
                          break;
              
                          default :
                          System.out.print(">>> Entrada invalida!\n");
                      }
              
        } while (menu != 0);
    }
    
    void mudarCor(Scanner scanner){
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
    
    void Menu(Scanner scan, Biblioteca biblioteca)
    {
        int menu = 10;
        do 
	{
		Visual.displayCliente(this);
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
					  System.out.print(">>> notifs!\n");
					  break;
	
					  case 4 :
					  System.out.print(">>> gerenciar acc!\n");
					  break;
	
					  case 5 :
					  System.out.print(">>> feedback!\n");
					  break;

                      case 6 :
					  System.out.print(">>> mudar cor!\n");
                      mudarCor(scan);
					  break;
	
					  case 0 :
					  break;
		  
					  default :
					  System.out.print(">>> Entrada invalida!\n");
				  }
		  
	
	} while (menu != 0);
    }
}
