import java.util.*;

public class Biblioteca{
    private Scanner scanner = new Scanner(System.in);
    ArrayList <Cliente> clientes = new ArrayList<>();
    ArrayList <Funcionario> proletariado = new ArrayList<>();
    ArrayList <Livro> livros = new ArrayList<>();

    void adicionar_cliente(String nome, String endereco, String tel, String id){
        Cliente associado = new Cliente();
        associado.SetInfo(nome, endereco, tel);
        associado.setId(id);
        clientes.add(associado);
    }

    void remover_cliente(Scanner scanner){
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
        int add;

        while(true){
            System.out.print("Digite o Titulo do livro: ");
            titulo = scanner.nextLine();
            System.out.print("Digite o Autor do livro: ");
            autor = scanner.nextLine();
            System.out.print("Digite o Id do livro: ");
            id = scanner.nextLine();
            test.setInfo(titulo, autor, id);
            livros.add(test);
            System.out.print("Deseja adicionar um novo livro? (Digite 1 para adicionar ou 0 para sair)");
            add = scanner.nextInt();
            while (add != 1 || add != 0){
                System.out.print("Deseja adicionar um novo livro? (Digite 1 para adicionar ou 0 para sair)");
                add = scanner.nextInt();
            }
            if (add == 0){
                break;
            }
        }
    }

    void remove_livro(Scanner scanner){
        int j = 1;
        while (true){
            System.out.println("Id | Titulo | Autor | Status");
            for(Livro i : livros){
                System.out.println(j++ + " " + i.getId() + " " + i.getTitulo() + " " + i.getAutor() + i.getStatus());
            }
        }
    }
}