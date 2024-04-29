import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente extends Pessoa{
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private int cor;
    
    void EmprestarLivro(Livro livro){
        livrosEmprestados.add(livro);
    }

    public Cliente()
    {
        this.SetInfo("0", "0", "0");
        this.setId("0");
        this.setSenha("0");
    }

    void print_Livros(){
        int i = 1;
        System.out.println("\t Livros \t");
        System.out.println("-------------------------------");
        for(Livro j: livrosEmprestados){
            System.out.printf("%d. %5s | %5s | %5s|%n", i++, j.getId(), j.getTitulo(), j.getAutor());
        }
        System.out.printf("-------------------------------%n");
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

    void navegarLivros(Scanner scan, ArrayList<Livro> livros)
    {
        
        int menu = 10;
        do 
	{
		verLivros(livros);
        Livro livro;
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
        do 
        {
            Visual.infoLivro(this, livro);
            try {menu = scan.nextInt(); } 
            catch (InputMismatchException e)
            { scan.next(); menu = 10; }
                    switch (menu)
                      {
                         case 1 :
                         System.out.print(">>> pegar emprestado!\n");
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
    

    void Menu(Scanner scan, ArrayList<Livro> livros)
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
                     System.out.print(">>> procurar livros!\n");
                     navegarLivros(scan, livros);
                     break;
	
					  case 2 :
					  System.out.print(">>> inventario!\n");
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
					  break;
	
					  case 0 :
					  break;
		  
					  default :
					  System.out.print(">>> Entrada invalida!\n");
				  }
		  
	
	} while (menu != 0);
    }
}
