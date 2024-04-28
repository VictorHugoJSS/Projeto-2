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

	void SetInfo(String nome, String end, String tel){
		this.nome = nome;
		this.endereco = end;
		this.telefone = tel;
	}
	
	String GetNome(){
		return nome;
	}

	String GetEndereco(){
		return endereco;
	}

	String GetTelefone(){
		return telefone;
	}

	void get_info(){
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
	}
} 
    
