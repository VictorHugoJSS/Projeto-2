public class Pessoa{
	String nome;
	String endereco;
	String telefone;

	void SetName(String nome){
		this.nome = nome;
	}

	void SetEndereco (String end){
		this.endereco = end;
	}

	void SetTelefone(String tel){
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
