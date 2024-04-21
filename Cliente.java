import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String IdCliente;
    ArrayList<String> livros = new ArrayList<String>();

    void setId (String id){
        this.IdCliente = id;
    }

    String getId(){
        return IdCliente;
    }
    
    void EmprestarLivro (String NomeLivro){
        this.livros.add(NomeLivro);
    }

    void print_Livros(){
        int i = 1;
        System.out.println("\t Livros \t");
        System.out.println("-------------------------------");
        for(String j: livros){
            System.out.println(i + ". " + j);
        }
        System.out.printf("-------------------------------%n");
    }
    void DevolverLivro(int number){
        livros.remove(number-1);
    }
}