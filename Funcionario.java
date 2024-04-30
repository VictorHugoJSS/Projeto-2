import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcionario extends Pessoa{
    String turno;
    Double salario;

    void setSalario(double salario)
    {
        this.salario = salario;
    }

    double getSalario()
    {
        return salario;
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
        foo.setInfo(titulo, autor, idLivro, qtd);
        biblioteca.livros.add(foo);
	}
    

    void Menu(Scanner scan, Biblioteca biblioteca)
	{
		int menu = 10;
		do 
		{
		Visual.funcionarioMenu(this);
		try {menu = scan.nextInt(); } 
		catch (InputMismatchException e)
		{ scan.next(); menu = 10; }
	
				switch (menu)
				  {
					  case 2 :
                      novoLivro(biblioteca, scan);
					  break;

					  case 0 :
					  break;

					  default :
					  System.out.print(">>> invalido!\n");
				  }
		  
	
		} while (menu != 0);
	}


    //void setInfo(String nome, String end, String tel, String Turno){
    //    setInfo(nome, end, tel, Turno);
    //    this.turno = Turno;
    //}

   // void get_info(){
   //    get_info();
   //     System.out.println("Id: " + getId());
   //    System.out.println("Turno: " + turno);
   // }
}
