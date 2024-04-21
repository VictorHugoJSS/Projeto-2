import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{
    private Scanner scanner = new Scanner(System.in);
    ArrayList <Cliente> clientes = new ArrayList<>();
    ArrayList <Livro> livros = new ArrayList<>();

    void adicionar_cliente(String nome, String endereco, String tel, String id){
        Cliente associado = new Cliente();
        associado.SetInfo(nome, endereco, tel);
        associado.setId(id);
        clientes.add(associado);
    }

    void remover_cliente(int ind){
        System.out.printf("Id | Nome | Tel.");
        for (Cliente i : clientes){
            System.out.printf("1. %s | %s | %s%n", i.getId(), i.GetNome(), i.GetTelefone());
        }
    }
}