public class Livro{
    String titulo;
    String autor;
    String idLivro;
    String status;

    void setTitulo (String nomeLivro){
        this.titulo = nomeLivro;
    }

    void setAutor (String nomeAutor){
        this.autor = nomeAutor;
    }

    void setId (String idLivro){
        this.idLivro = idLivro;
    }

    void setStatus (String status){
        this.status = status;
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