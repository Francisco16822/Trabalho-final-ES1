import java.util.ArrayList;
import java.util.List;

public class Livro {

    private int id ;
    private String Nome = "";
    private int QtdStk;
    List<Livro> listLivro = new ArrayList<Livro>();
    int lastId = 0;


    public Livro () {}

    public Livro(int id, String Nome, int QtdStk) {
        this.id = id;
        this.Nome = Nome;
        this.QtdStk = QtdStk;

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


    public int addLivro(String Nome, int QtdStk){


        for (int index = 0; index < listLivro.size(); index ++){

            if(listLivro.get(index).getNome() == Nome){

                System.out.println("Livro Já criado");
                return 1;

            }

        }

        Livro Livrotemp = new Livro();
        lastId = lastId + 1;

        Livrotemp.setId(lastId);
        Livrotemp.setNome(Nome);
        Livrotemp.setQtdStk(QtdStk);

        System.out.println("Livro: "+ Nome + "created with Sucess");

        listLivro.add(Livrotemp);
        return 0;
    }



    public void listallLivros(){

        for (int index =0; index < listLivro.size(); index ++){
            System.out.println("/------------------- Lista de livros disponiveis-------------------//");
            System.out.println(listLivro.get(index).getId());
            System.out.println(listLivro.get(index).getNome());
            System.out.println(listLivro.get(index).getQtdStk());
            System.out.println("/------------------------------------------------------------------//");

        }


    }



}
