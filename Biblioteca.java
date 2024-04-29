import java.util.Scanner;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.ArrayList;
 



@SuppressWarnings({"unused"})  

public class Biblioteca{
    ArrayList <Cliente> clientes = new ArrayList<>(); // 
    ArrayList <Funcionario> proletariado = new ArrayList<>(); // Depois tira isso : e melhor usar um array do tipo Pessoa ao inves de 927458 arrays separados
    ArrayList <Livro> livros = new ArrayList<>(); //

static void adicionar_cliente(String nome, String endereco, String tel, String id, String senha, ArrayList<Pessoa> clientes)
{
	Cliente associado = new Cliente();
	associado.SetInfo(nome, endereco, tel);
	associado.setId(id);
	associado.setSenha(senha);
	associado.setCor(0);
	clientes.add(associado);
}

void remover_cliente(Scanner scanner)
	{
        int j = 1;
        System.out.printf("Id | Nome | Tel.");
        for (Cliente i : clientes){
            System.out.printf("%d. %s | %s | %s%n", j++,i.getId(), i.GetNome(), i.GetTelefone());
        }

        System.out.print("Digite o numero do cliente que quer remover: ");
        int num = scanner.nextInt();
        clientes.remove(num-1);
    }

static void temporarioNovoLivro(String titulo, String autor, String id, int qtd, ArrayList<Livro> livros)
{
	Livro livro = new Livro();
	livro.setInfo(titulo, autor, id, qtd);
	livros.add(livro);
}

void add_livro(Scanner scanner){
        Livro test = new Livro();
        String titulo, autor, id;
        System.out.println("Digite o Titulo do livro: ");
        titulo = scanner.nextLine();
        System.out.println("Digite o Autor do livro: ");
        autor = scanner.nextLine();
        System.out.println("Digite o Id do livro: ");
        id = scanner.nextLine();
        //test.setInfo(titulo, autor, id);
        livros.add(test);
    }

    void remover_livro(Scanner scanner){
        int r, conf;
        while (true){
            int j = 1;
            System.out.println("-----------------------------------------------");
            System.out.println("Id | Titulo | Autor | Status");
            for(Livro i : livros){
                System.out.println(j++ + " |" + i.getId() + " |" + i.getTitulo() + " |" + i.getAutor() + " |"+ i.getQtd());
            }
            System.out.println("-----------------------------------------------");
            System.out.print("Digite o numero do livro que você quer remover: ");
            r = scanner.nextInt();
            while (r < 0 || r > j){
                System.out.print("Digite o numero do livro que você quer remover: ");
                r = scanner.nextInt();
            }
            livros.remove(r-1);
            System.out.println("Deseja remover mais um livro? (Digite 1 para remover um novo livro ou 0 para sair)");
            conf = scanner.nextInt();
            while (conf != 1 && conf != 0){
                System.out.println("Deseja remover mais um livro? (Digite 1 para remover um novo livro ou 0 para sair)");
                conf = scanner.nextInt();
            }
            if (conf == 0){
                break;
            }
        }
    }
static void cadastro(ArrayList<Pessoa> pessoas, Scanner scan)
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


static void login(ArrayList<Pessoa> pessoas, Scanner scanner, ArrayList<Livro> livros)
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
	if (num == 1) { System.out.print(">>> Login efetuado com sucesso!\n"); copia.Menu(scanner, livros); return; }
	else { System.out.print(">>> Senha incorreta, tente novamente!\n              "); }

} while (check == 0);

}

public static void main (String[] args)
	{
		ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();
		ArrayList <Livro> livros = new ArrayList<>();
		Pessoa pessoa;
	
		int main = 1;
		int menu = 10;
		String id;
		String senha;
		Scanner scanner = new Scanner(System.in);
		adicionar_cliente("teste", "rua", "12345", "12345", "senha", pessoas); //
		temporarioNovoLivro("titulo1", "autor1", "11111", 5, livros);
		temporarioNovoLivro("titulo2", "autor2", "22222", 0, livros);
		temporarioNovoLivro("titulo3", "autor3", "33333", 3, livros);
		pessoa = pessoas.get(0); //
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
					  login(pessoas, scanner, livros);
					  break;
	
					  case 2 :
					  cadastro(pessoas, scanner);
					  break;
	
					  case 3 :
					  System.out.print(">>> sobre!\n");
					  break;
	
					  case 4 :
					  System.out.print(">>> termos de uso!\n");
					  break;
	
					  case 0 :
					  System.out.print(">>> :(\n"); scanner.close(); return;
					  
					  default :
					  System.out.print(">>> invalido!\n");
				  }
		  
	
	} while (main != 0);
	}
}
