public class Pessoa{
	String nome;
	String endereco;
	String telefone;

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
}
