import java.util.ArrayList;
import java.util.List;

public class Feedback {

    private int id;
    private int encomendaId;
    private int avaliacao;
    List<Feedback> listFeedback = new ArrayList<Feedback>();
    int lastid=0;


    public Feedback () {}

    public Feedback(int id ,int encomendaId, int avaliacao) { //avaliacao 0-100
        this.id = id;
        this.encomendaId = encomendaId;
        this.avaliacao=avaliacao;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEncomendaId() {
        return encomendaId;
    }

    public void setEncomendaId(int encomendaId) {
        this.encomendaId = encomendaId;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }



}
