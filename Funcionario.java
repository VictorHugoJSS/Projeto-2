public class Funcionario extends Pessoa{
    String idFuncionario;
    String turno;

    void setInfo(String nome, String end, String tel, String Turno){
        setInfo(nome, end, tel, Turno);
        this.turno = Turno;
    }

    void get_info(){
        get_info();
        System.out.println("Id: " + idFuncionario);
        System.out.println("Turno: " + turno);
    }
}
