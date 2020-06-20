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


    public Livro addLivro(String Nome, int QtdStk,int preco){


        for (int index = 0; index < listLivro.size(); index ++){

            if(listLivro.get(index).getNome() == Nome){

                System.out.println("Livro Já criado");
                return null;

            }

        }

        Livro Livrotemp = new Livro();
        lastId = lastId + 1;
        Livrotemp.setId(lastId);
        Livrotemp.setNome(Nome);
        Livrotemp.setQtdStk(QtdStk);
        Livrotemp.setPreco(preco);
        System.out.println("Livro: "+ Nome + " created with Sucess");
        listLivro.add(Livrotemp);
        return Livrotemp;
    }

    public void addstocklivro(int idlivro, int qtd){
        int temp;
        for (int index =0; index < listLivro.size(); index ++) {
            if (listLivro.get(index).getNome() == Nome) {
                  temp = listLivro.get(index).getQtdStk();
                  temp =temp + qtd;
                  listLivro.get(index).setQtdStk(temp);
            }
        }
    }

    List<Livro> getalllivros(){
        return listLivro;
    }


    public void listallLivros(){
        System.out.println("/------------------- Lista de livros disponiveis-------------------//");
        for (int index =0; index < listLivro.size(); index ++){

            System.out.println("id," + listLivro.get(index).getId() + ", Nome:"+ listLivro.get(index).getNome() + " , Quantidade Stock:" +listLivro.get(index).getQtdStk() );


        }
        System.out.println("/------------------------------------------------------------------//");

    }



}
