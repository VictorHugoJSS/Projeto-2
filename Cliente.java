import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String IdCliente;
    private String Senha;
    ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    void setId (String id){
        this.IdCliente = id;
    }

    String getId(){
        return IdCliente;
    }

    void setSenha(String Senha){
        this.Senha = Senha;
    }

    String getSenha(){
        return Senha;
    }

    int verificarSenha(String Senha)
    {
        if ( this.Senha.equals(Senha) ) { return 1; }
        else { return 0; }
    }
    
    void EmprestarLivro(Livro livro){
        livrosEmprestados.add(livro);
    }

    void get_info(){
        get_info();
        System.out.println("Id: " + IdCliente);
    }
    void print_Livros(){
        int i = 1;
        System.out.println("\t Livros \t");
        System.out.println("-------------------------------");
        for(Livro j: livrosEmprestados){
            System.out.printf("%d. %5s | %5s | %5s|%n", i++, j.getId(), j.getTitulo(), j.getAutor());
        }
        System.out.printf("-------------------------------%n");
    }
    void DevolverLivro(int number){
        livrosEmprestados.remove(number-1);
    }
}
