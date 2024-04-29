import java.util.ArrayList;
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

	void Menu(Scanner scan, ArrayList<Livro> livros)
	{
		
	}

} 
