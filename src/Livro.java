import java.util.ArrayList;
import java.util.List;

public class Livro {

    private int id ;
    private String Nome = "";
    private int QtdStk;
    List<Livro> listLivro = new ArrayList<Livro>();
    int lastId = 0;
    int preco;


    public Livro () {}

    public Livro(int id, String Nome, int QtdStk,int preco) {
        this.id = id;
        this.Nome = Nome;
        this.QtdStk = QtdStk;
        this.preco = preco;

    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQtdStk() {
        return QtdStk;
    }

    public void setQtdStk(int QtdStk) {
        this.QtdStk = QtdStk;
    }






}
