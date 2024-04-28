import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente extends Pessoa{
    ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    int cor;
    
    void EmprestarLivro(Livro livro){
        livrosEmprestados.add(livro);
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

    void Menu(Scanner scan)
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
					  System.out.print(">>> sair!\n");
					  break;
		  
					  default :
					  System.out.print(">>> Entrada invalida!\n");
				  }
		  
	
	} while (menu != 0);
    }
}
    
