import java.util.*;

public class Biblioteca{
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
}