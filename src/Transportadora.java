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

    public Transportadora CreateTransportadora(String nome){


        for (int index =0; index < Transportadora.size(); index ++){

            if(Transportadora.get(index).getNome() == nome){

                System.out.println("Transportadora já criada");
                return null;

            }

        }

        Transportadora transportadoratemp = new Transportadora();
        lastid = lastid +1;
        transportadoratemp.setId(lastid);
        transportadoratemp.setNome(nome);
        System.out.println("Funcionario " + "with SUCESS com Id" + lastid );
        Transportadora.add(transportadoratemp);
        return transportadoratemp;
    }

}

