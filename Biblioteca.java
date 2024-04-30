import java.util.Scanner;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.ArrayList;
 



@SuppressWarnings({"unused"})  

public class Biblioteca{
    ArrayList <Livro> livros = new ArrayList<>(); //
	ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();

void adicionar_cliente(String nome, String endereco, String tel, String id, String senha)
{
	Cliente associado = new Cliente();
	associado.SetInfo(nome, endereco, tel);
	associado.setId(id);
	associado.setSenha(senha);
	associado.setCor(0);
	pessoas.add(associado);
}

int qtdClientes() // Retorna quantidade de pessoas no array pessoas que sao apenas clientes
{
	Pessoa copia;
	int contador = 0;
	int tam = pessoas.size();
	for (int i = 0; i < tam; i++)
	{
		copia = pessoas.get(i);
		if (copia instanceof Cliente) { contador++; }
	}
	return contador;
}

void NovoLivro(String titulo, String autor, String id, int qtd)
{
	Livro livro = new Livro();
	livro.setInfo(titulo, autor, id, qtd);
	livros.add(livro);
}



    
void cadastro(Scanner scan) // Novo cadastro especificamente para clientes.
{
	scan.nextLine();
	String input;
	Cliente novo = new Cliente();
	int atual;
	
	for (atual = 0; atual <= 5; atual++)
	{
		Visual.displayCadastro(atual, novo); 
		if (atual == -1) { atual++; }
		input = scan.nextLine(); if (input.equals("0")) { return; } 
		switch (atual)
		{


			case 0: if (Pessoa.Busca(pessoas, input) != -1) { atual = -2; break; }
					novo.setId(input);
					break;

			case 1: novo.setNome(input); break;
			case 2: novo.setEndereco(input); break;
			case 3: novo.setTelefone(input); break;
			case 4: novo.setSenha(input); break;
			case 5: break;
		}
	}

	pessoas.add(novo);
}

void acervoInicial()
{
	NovoLivro("titulo primario", "autor vanguarda", "11111", 11);
	NovoLivro("O ultimate guia de desastre de interface e unusabilidade", "Augusto", "22222", 0);
	NovoLivro("Enciclopedia de listas encadeadas", "Gibson", "33333", 5);
	NovoLivro("Frases em ingles pretenciosas", "Diogo Braga PHD", "44444", 3);
	NovoLivro("Livro", "Autor", "55555", 4);
	NovoLivro("Coisas a evitar em um projeto de livraria em POO", "Verissimo e Vitor Hugo", "66666", 1);
}


void login(Scanner scanner)
{		
int num = pessoas.size();
int check = -1;
String input;
Pessoa copia = null;

Visual.displayLoginID();
do	
{	
	input = scanner.nextLine();
	if (input.equals("0")) { return; }
	check = Pessoa.Busca(pessoas, input);
	if (check == -1) {System.out.print(">>> Conta não encontrada, tente novamente!\n              "); }
	else {copia = pessoas.get(check);}

} while (check == -1);

check = 0;
Visual.displayLoginSenha(input);
do
{
	input = scanner.nextLine();
	if (input.equals("0")) { return; }
		{ num = copia.verificarSenha(input); }
	if (num == 1) { 
					System.out.print(">>> Login efetuado com sucesso!\n"); 
					copia.Menu(scanner, this); return; }
	else { System.out.print(">>> Senha incorreta, tente novamente!\n              "); }

} while (check == 0);

}

public void menu() // A tela de login do programa
	{
		acervoInicial(); // Inicia os livros com qual o programa começa
		Pessoa.inicializarAdmin(this); // Cria os dados da conta admin, sem deixar as outras classes verem os parametros.
		int main = 1;
		int menu = 10;
		Scanner scanner = new Scanner(System.in);
	do 
	{
		Visual.displayInicio();
		try {menu = scanner.nextInt(); } 
		catch (InputMismatchException e)
		{ scanner.next(); menu = 10; }
	
				switch (menu)
				  {
					  case 1 :
					  scanner.nextLine();
					  login(scanner); 
					  break;
	
					  case 2 :
					  cadastro(scanner);
					  break;
	
					  case 3 :
					  scanner.nextLine();
					  Visual.sobreNos(this);
					  Visual.EnterParaContinuar();
					  scanner.nextLine();
					  break;
	
					  case 4 :
					  scanner.nextLine();
					  Visual.termosDeUso();
					  Visual.EnterParaContinuar();
					  scanner.nextLine();
					  break;
	
					  case 0 :
					  System.out.print(">>> :(\n"); scanner.close(); return;
					  
					  default :
					  System.out.print(">>> invalido!\n");
				  }
		  
	
	} while (main != 0);
	}
}
