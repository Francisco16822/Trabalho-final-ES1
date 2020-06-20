import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private int id;
    private String nome = "";
    List<Funcionario> listFunc = new ArrayList<Funcionario>();
    int lastid=0;


    public Funcionario () {}

    public Funcionario(int id ,String nome) {
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

    public Funcionario CreateFuncionario(String nome){


        for (int index =0; index < listFunc.size(); index ++){

            if(listFunc.get(index).getNome() == nome){

                System.out.println("Funcionario Repetido");
                return null;

            }

        }

        Funcionario functemp = new Funcionario();
        lastid = lastid +1;
        functemp.setId(lastid);
        functemp.setNome(nome);
        System.out.println("Funcionario " + "with SUCESS com Id" + lastid );
        listFunc.add(functemp);
        return functemp;
    }

}
