import java.util.ArrayList;

public class Cliente extends Pessoa{
    ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    
    void EmprestarLivro(Livro livro){
        livrosEmprestados.add(livro);
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
    
