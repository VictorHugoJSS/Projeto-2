import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcionario extends Pessoa{
    private Double salario;

    // Funcionarios so podem ser criados e removidos pela classe admin.//

    void setSalario(double salario)
    {
        this.salario = salario;
    }

    double getSalario()
    {
        return salario;
    }

    static int BuscaLivro(ArrayList<Livro> livros, String input) // Retorna a posição de um livro no arraylist
	{
		int num = livros.size();
		for (int i = 0; i < num; i++)
    	{
			if ((livros.get(i)).idLivro.equals(input)) { return i; } 
		}
		return -1;
	}

    void verLivros(ArrayList<Livro> livros) // Mostra todos os livros, sem o inicio e fim enfeitado
	{
        System.out.print("\n             ________________________________________________\n");
		int qtd = livros.size();
		for (int i = 0; i<qtd; i++)
		{
			Visual.printLivro(this, livros.get(i), i);
		}
        System.out.print("\n");
	}

    void removerLivro(ArrayList<Livro> livros, Scanner scan)
    {
        String id;
        scan.nextLine();
        System.out.print("\nRemover livro\n-----------------------------------------------\n");
        System.out.print("\nID do livro que voce quer remover : "); id = scan.nextLine();
        int retorno = BuscaLivro(livros, id);
        if (retorno == -1) { System.out.print("\nLivro não encontrado!\n\n"); return; } 
        livros.remove(retorno);
        System.out.print("\nLivro removido com sucesso!\n\n");

    }

    void atualizarQtd(ArrayList<Livro> livros, Scanner scan) // Atualizar a quantidade disponivel de um certo livro para ser pego emprestado
    {
        String id; int qtd;
        scan.nextLine();
        System.out.print("\nAtualizar quantidade\n-----------------------------------------------\n");
        System.out.print("\nID do livro que voce quer atualizar : "); id = scan.nextLine();
        int retorno = BuscaLivro(livros, id); // Encontra a posiçao do livro no array
        if (retorno == -1) { System.out.print("\nLivro não encontrado!\n\n"); return; }
        System.out.print("\nInsira a nova quantidade : ");
        try {qtd = scan.nextInt(); } catch (InputMismatchException e){ scan.next(); qtd = 0; }
        if (qtd < 0) { qtd = 0; }
        livros.get(retorno).qtd = qtd;
    }

    void novoLivro(Biblioteca biblioteca, Scanner scan)
    {
        scan.nextLine();
        String titulo; String autor; String idLivro; int qtd;
        System.out.print("\nNovo Livro\n-----------------------------------------------\n");
		System.out.print("\nTitulo : "); titulo = scan.nextLine(); 
        System.out.print("\nAutor : "); autor = scan.nextLine(); 
        System.out.print("\nID : "); idLivro = scan.nextLine(); 
        System.out.print("\nQuantidade : ");
        try {qtd = scan.nextInt(); } catch (InputMismatchException e){ scan.next(); qtd = 0; }
        Livro foo = new Livro();
        if (qtd < 0) { qtd = 0; }
        foo.setInfo(titulo, autor, idLivro, qtd);
        biblioteca.livros.add(foo);
	}
    

    void Menu(Scanner scan, Biblioteca biblioteca) // O menu especifico para os funcionarios, nao e enfeitado que nem os dos clientes.
	{
		int menu = 10;
        System.out.print("Bem vindo, " + this.GetNome() + ".\n");
		do 
		{
		Visual.funcionarioMenu(this);
		try {menu = scan.nextInt(); } 
		catch (InputMismatchException e)
		{ scan.next(); menu = 10; }
	
				switch (menu)
				  {
                      case 1 :
                      verLivros(biblioteca.livros);
                      break;

					  case 2 :
                      novoLivro(biblioteca, scan);
					  break;

                      case 3 :
                      removerLivro(biblioteca.livros, scan);
                      break;

                      case 4:
                      atualizarQtd(biblioteca.livros, scan);

					  case 0 :
					  break;

					  default :
					  System.out.print(">>> invalido!\n");
				  }
		  
	
		} while (menu != 0);
	}
}
