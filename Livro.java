public class Livro{
    String titulo;
    String autor;
    String idLivro;
    String status;

    void setInfo(String nomeLivro, String nomeAutor, String idLivro){
        this.titulo = nomeLivro;
        this.autor = nomeAutor;
        this.idLivro = idLivro;
        this.status = "Sim";
    }

    String getTitulo(){
        return titulo;
    }

    String getAutor(){
        return autor;
    }

    String getId(){
        return idLivro;
    }

    String getStatus(){
        return status;
    }
}