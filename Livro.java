public class Livro{
    String titulo;
    String autor;
    String idLivro;
    int qtd;

    void setInfo(String nomeLivro, String nomeAutor, String idLivro, int qtd){
        this.titulo = nomeLivro;
        this.autor = nomeAutor;
        this.idLivro = idLivro;
        this.qtd = qtd;
    }

    void setQtd (int qtd){
        this.qtd = qtd;
    }

    int getQtd(){
        return qtd;
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


}
