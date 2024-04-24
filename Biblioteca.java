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

    void funcionario_test(){

    }
    /*void add_livro(Scanner scanner){
        Livro test = new Livro();
        
        while(){
            System.out.print("Digite o Titulo do livro: ");
            test.setTitulo(scanner.nextLine());
            System.out.print("Digite o Autor do livro: ");
            test.setAutor(scanner.nextLine());
            test.setId();
        }
    }*/
}