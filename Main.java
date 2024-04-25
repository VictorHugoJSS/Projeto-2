/* Cadeira: Programação Orientada a objeto
   Projeto: Sistema de Gerenciamento de Biblioteca
   Aluno: Victor Hugo José Sales da Silva
   Data da ultima Atualização: 14/04/24 - 18:59*/ 
import java.util.*;
public class Main{
	
	public static void main (String[] args){
      Scanner scanner = new Scanner(System.in);
      Biblioteca teste = new Biblioteca();

      teste.add_livro(scanner);
      teste.add_livro(scanner);
      teste.remover_livro(scanner);
	}
}
