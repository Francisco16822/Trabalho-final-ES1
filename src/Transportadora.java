import java.util.ArrayList;
import java.util.List;

public class Transportadora {

    private int id;
    private String nome = "";
    List<Transportadora> Transportadora = new ArrayList<Transportadora>();
    int lastid=0;


    public Transportadora () {}

    public Transportadora(int id ,String nome) {
        this.id = id;
        this.nome = nome;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

