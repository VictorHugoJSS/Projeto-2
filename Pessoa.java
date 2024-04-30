import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pessoa{
	private String nome;
	private String endereco;
	private String telefone;
	private String ID;
    private String Senha;

	void setId (String id){
        this.ID = id;
    }

    String getId(){
        return ID;
    }

	
    void setSenha(String Senha){
        this.Senha = Senha;
    }

    String getSenha(){
        return Senha;
    }

    int verificarSenha(String Senha)
    {
        if ( this.Senha.equals(Senha) ) { return 1; }
        else { return 0; }
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

	void SetInfo(String nome, String end, String tel){
		this.nome = nome;
		this.endereco = end;
		this.telefone = tel;
	}

	void setNome(String nome){
		this.nome = nome;
	}

	String GetNome(){
		return nome;
	}

	void setEndereco(String endereco){
		this.endereco = endereco;
	}

	String GetEndereco(){
		return endereco;
	}

	void setTelefone(String telefone){
		this.telefone = telefone;
	}

	String GetTelefone(){
		return telefone;
	}

	void get_info(){
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
	}

	void verLivros(ArrayList<Livro> livros)
	{
		int qtd = livros.size();
		Visual.displayLivrosInicio(this);
		for (int i = 0; i<qtd; i++)
		{
			Visual.printLivro(this, livros.get(i), i);
		}
		Visual.fimBorda(this);
	}

	void Menu(Scanner scan, Biblioteca biblioteca)
	{
		
	}

int removerConta(Biblioteca biblioteca, Scanner scan)
	{
		return 1;
	}

static void inicializarAdmin(Biblioteca biblioteca)
	{
		Admin.novoAdmin(biblioteca);
	}

static void enviarFeedback(Feedback feedback)
	{
		Admin.receberFeedback(feedback);
	}


private static class Admin extends Pessoa 
{	

private static ArrayList<Feedback> feedback = new ArrayList<>();

	static void novoAdmin(Biblioteca biblioteca)
	{
		Admin admin = new Admin();
		admin.setId("admin");
		admin.setSenha("SenhaMuitoSegura");
		biblioteca.pessoas.add(admin);
	}

	void menuAdmin()
    {
    System.out.print("-----------------------------------------------\n");
    System.out.print("[1] - Novo funcionario\n");
    System.out.print("[2] - Lista de usuarios\n");
    System.out.print("[3] - Ver feedback\n");
    System.out.print("[4] - Remover usuario\n");
    System.out.print("[5] - Estatisticas\n");
	System.out.print("[0] - Sair\n");
    }

	static void receberFeedback(Feedback novoFeedback)
	{
		feedback.add(novoFeedback);
	}

	void verFeedback()
	{
		System.out.print("Entradas de feedback :\n-----------------------------------------------\n");
		for (int i = 0; i < feedback.size(); i++)
		{
		System.out.print("Entrada " + (i+1) + ":\n\n ");
		System.out.print(feedback.get(i).getConteudo());
		System.out.print("\n\nAutor : " + feedback.get(i).getID());
		System.out.print("\n-----------------------------------------------\n");
		}
	}

	void listaCadastros(ArrayList<Pessoa> pessoas)
	{
		int qtd = pessoas.size();
		Pessoa copia;
		System.out.print("-----------------------------------------------\n");
		for (int i = 0; i < qtd; i++)
		{
			copia = pessoas.get(i);
			if (copia instanceof Cliente)
			{
				System.out.print("Cliente - " + copia.nome + "\n\n");
				System.out.println("ID : " +copia.ID);
				System.out.println("Senha : " +copia.Senha);
				System.out.println("Endereco : " +copia.endereco);
				System.out.println("Telefone : " +copia.telefone);
				System.out.print("-----------------------------------------------\n");
			}

			if (copia instanceof Funcionario)
			{
				System.out.print("Funcionario - " + copia.nome + "\n\n");
				System.out.println("Salario : " + ((Funcionario) copia).getSalario());
				System.out.println("ID : " +copia.ID);
				System.out.println("Senha : " +copia.Senha);
				System.out.println("Endereco : " +copia.endereco);
				System.out.println("Telefone : " +copia.telefone + "\n");
				System.out.print("-----------------------------------------------\n");
			}
		}
	}

	int removerConta(ArrayList<Pessoa> pessoas, Scanner scan)
	{
		scan.nextLine();
		String id; int retorno; 
		System.out.print("\nID a ser removido : "); id = scan.nextLine(); 
		retorno = Pessoa.Busca(pessoas, id);
		if (retorno == -1) 
		{System.out.print("\nConta nao encontrada.\n"); return 0;}
		if (id.equals("admin")) 
		{System.out.print("\nConta nao encontrada.\n"); return 0;}
		pessoas.remove(pessoas.get(retorno));
		System.out.print("\nConta removida com sucesso.\n");
		return 1;
	}

	void novoFuncionario(Biblioteca biblioteca, Scanner scan)
	{
		scan.nextLine();
		String id; String nome; String endereco; String telefone; String senha; Double salario;
		System.out.print("\nNovo funcionario\n-----------------------------------------------\n");
		while (true)
		{ 
			System.out.print("\nID : "); id = scan.nextLine(); 
			if (Pessoa.Busca(biblioteca.pessoas, id) == -1) {break;}
		}
		System.out.print("\nNome : "); nome = scan.nextLine();
		System.out.print("\nEndereco : "); endereco = scan.nextLine();
		System.out.print("\nTelefone : "); telefone = scan.nextLine();
		System.out.print("\nSenha : "); senha = scan.nextLine();
		System.out.print("\nSalario : "); salario = scan.nextDouble();
		Funcionario foo = new Funcionario();
		foo.setId(id); foo.setNome(nome); foo.setEndereco(endereco); foo.setTelefone(telefone); foo.setSenha(senha); foo.setSalario(salario);
		biblioteca.pessoas.add(foo);
	}

	void estatisticas(Biblioteca biblioteca)
	{
		int contadorLivros = 0; double contadorSalario = 0; int tam = biblioteca.livros.size();
		int contadorClientes = 0; int contadorFuncionarios = 0; int contadorEmprestados = 0;
		Pessoa copia;
		System.out.print("Estatisticas:\n-----------------------------------------------\n");
		System.out.println("Livros registrados: " + biblioteca.livros.size());
		for (int i = 0; i<tam; i++)
		{
			contadorLivros = contadorLivros + biblioteca.livros.get(i).qtd;
		}
		System.out.println("Unidades de livros disponiveis no total: " + contadorLivros);
		tam = biblioteca.pessoas.size();
		for (int i = 0; i<tam; i++)
		{
			copia = biblioteca.pessoas.get(i);
			if (copia instanceof Cliente) { contadorClientes++; contadorEmprestados = contadorEmprestados + ((Cliente) copia).getEmprestadosSize();}
			if (copia instanceof Funcionario) {contadorFuncionarios++; contadorSalario = contadorSalario + ((Funcionario) copia).getSalario(); }
		}
		System.out.println("\nNumero de clientes : " + contadorClientes);
		System.out.println("Total de livros emprestados : " + contadorEmprestados);
		System.out.println("\nTotal de funcionarios : " + contadorFuncionarios);
		System.out.println("Salario total dos funcionarios : R$" + contadorSalario);
	}
	
    void Menu(Scanner scan, Biblioteca biblioteca)
	{
		System.out.print("\u001B[32m");
		int menu = 10;
		System.out.print("Logado como o administrador.\n");
		do 
		{
		menuAdmin();
		try {menu = scan.nextInt(); } 
		catch (InputMismatchException e)
		{ scan.next(); menu = 10; }
	
				switch (menu)
				  {
					  case 1 :
					  novoFuncionario(biblioteca, scan);
					  break;

					  case 2:
					  listaCadastros(biblioteca.pessoas);
					  break;
					  
					  case 3:
					  verFeedback();
					  break;

					  case 4 :
					  removerConta(biblioteca.pessoas, scan);
					  break;

					  case 5 :
					  estatisticas(biblioteca);
					  break;

					  case 0 :
					  System.out.print("\u001B[0m"); 
			
					  default :
					  System.out.print(">>> invalido!\n");
				  }
		  
	
		} while (menu != 0);
	}

}

}
