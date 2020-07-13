import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EnvioEncomenda {

    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String formattedDate = myDateObj.format(myFormatObj);

    private int id;
    private int encomendaId;
    private int transportadoraId;
    private int funcionarioId;
    private String date;

    List<EnvioEncomenda> listEnviosEncomenda = new ArrayList<EnvioEncomenda>();
    int lastid=0;


    public EnvioEncomenda () {}

    public EnvioEncomenda(int id ,int encomendaId, int funcionarioId,int transportadoraId) {
        this.id = id;
        this.encomendaId = encomendaId;
        this.funcionarioId=funcionarioId;
        this.transportadoraId=transportadoraId;
        this.date = formattedDate;
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

    public int getTransportadoraId() {
        return transportadoraId;
    }

    public void setTransportadoraId(int transportadoraId) {
        this.transportadoraId = transportadoraId;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
