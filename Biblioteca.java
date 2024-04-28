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

void add_livro(Scanner scanner){
        Livro test = new Livro();
        String titulo, autor, id;
        System.out.println("Digite o Titulo do livro: ");
        titulo = scanner.nextLine();
        System.out.println("Digite o Autor do livro: ");
        autor = scanner.nextLine();
        System.out.println("Digite o Id do livro: ");
        id = scanner.nextLine();
        test.setInfo(titulo, autor, id);
        livros.add(test);
    }

    void remover_livro(Scanner scanner){
        int r, conf;
        while (true){
            int j = 1;
            System.out.println("-----------------------------------------------");
            System.out.println("Id | Titulo | Autor | Status");
            for(Livro i : livros){
                System.out.println(j++ + " |" + i.getId() + " |" + i.getTitulo() + " |" + i.getAutor() + " |"+ i.getStatus());
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


static void login(ArrayList<Pessoa> pessoas, Scanner scanner)
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
	if (num == 1) { System.out.print(">>> Login efetuado com sucesso!\n"); copia.Menu(); return; }
	else { System.out.print(">>> Senha incorreta, tente novamente!\n              "); }

} while (check == 0);

}

public static void main (String[] args)
	{
		ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa;
	
		int main = 1;
		int menu = 10;
		String id;
		String senha;
		Scanner scanner = new Scanner(System.in);
		adicionar_cliente("teste", "rua", "12345", "12345", "senha", pessoas); //
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
					  login(pessoas, scanner);
					  break;
	
					  case 2 :
					  System.out.print(">>> nova conta!\n");
					  break;
	
					  case 3 :
					  System.out.print(">>> sobre!\n");
					  break;
	
					  case 4 :
					  System.out.print(">>> termos de uso!\n");
					  break;
	
					  case 5 :
					  System.out.print(">>> mudar cor!\n");
					  break;
	
					  case 0 :
					  System.out.print(">>> sair!\n");
					  break;
		  
					  default :
					  System.out.print(">>> invalido!\n");
				  }
		  
	
	} while (main != 0);
	scanner.close();
	
	}

}
