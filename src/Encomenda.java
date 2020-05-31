import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Encomenda extends Livro{

    //Variable to set the actual date when we create an order
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String formattedDate = myDateObj.format(myFormatObj);
    ////////////////////


    private int idEncomenda;
    private String date;


    List<Encomenda> listEncomenda = new ArrayList<Encomenda>();
    List<Livro> listLivronaencomenda = new ArrayList<Livro>();



    public Encomenda () {}

    public Encomenda(int id, String date, ArrayList<Livro> listLivronaencomenda) {
        this.idEncomenda = id;
        this.date = formattedDate;
        this.listLivronaencomenda=listLivronaencomenda;

    }

    public int getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    public String getdate() {
        return date;
    }

    public void setdate() {
        this.date = formattedDate;
    }

    public List<Livro> getlistLivronaencomenda() {
        return listLivronaencomenda;
    }

    public void setlistLivronaencomenda(ArrayList<Livro> listLivronaencomenda) {
        this.listLivronaencomenda = listLivronaencomenda;
    }






    public int createOrder(int idEncomenda){

        Encomenda encomendatemp = new Encomenda();
        List<Livro> listTemp = new ArrayList<Livro>();


        encomendatemp.setIdEncomenda(idEncomenda);
        encomendatemp.setdate();
        System.out.println("Encomenda com id " + idEncomenda+ " adicionada À lista de encomendas");
        encomendatemp.setlistLivronaencomenda((ArrayList<Livro>) listTemp);
        listEncomenda.add(encomendatemp);

        return 0;
    }


public void listitensOrder(){

        for(int index = 0; index < listLivronaencomenda.size();index++){



        }


}
    public int additensOrder(int idEncomenda, Livro livro){

        for (int index =0; index < listEncomenda.size(); index ++){

            if(idEncomenda == listEncomenda.get(index).getIdEncomenda()){
                for(int index2 = 0; index2 < listLivro.size();index2 ++) {
                    if (livro.getNome() == listLivro.get(index2).getNome()) {

                        listEncomenda.get(index).getlistLivronaencomenda().add(livro);

                    }
                }
            }}

        return 1;
    }

    public void listallitensinorder(){



    }

    public void listallOrder(){

        int idtemp = 1;
        Livro livrro =new Livro();
        livrro.setNome("lusiadas");

        for (int index =0; index < listEncomenda.size(); index ++){
            System.out.println("/------------------- Lista de Encomendas feitas -------------------//");
            idtemp = listEncomenda.get(index).getIdEncomenda();
            System.out.println(idtemp);
            System.out.println(listEncomenda.get(index).getdate());


            for(int index2 = 0; index2 < listEncomenda.get(index).getlistLivronaencomenda().size(); index2++){

                System.out.println(listEncomenda.get(index).getlistLivronaencomenda().get(index2).getNome());
            }

            System.out.println("/------------------------------------------------------------------//");

        }


    }


}
