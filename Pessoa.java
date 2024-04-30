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

static void inicializarAdmin(Biblioteca biblioteca)
	{
		Admin.novoAdmin(biblioteca);
	}

int removerConta(Biblioteca biblioteca, Scanner scan)
	{
		return 1;
	}


private static class Admin extends Pessoa 
{	
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

	int removerConta(ArrayList<Pessoa> pessoas, Scanner scan)
	{
		scan.nextLine();
		String id; int retorno; 
		System.out.print("\nID a ser removido : "); id = scan.nextLine(); 
		retorno = Pessoa.Busca(pessoas, id);
		if (retorno == -1) 
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

					  case 4 :
					  removerConta(biblioteca.pessoas, scan);
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
