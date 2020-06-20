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
    private  String destinatario;
    private String morada;
    private int estado = 1; //1-por entregar 2- parcialmnente entregue 3- entregue
    private int preco;
    int desconto;

    List<Encomenda> listEncomenda = new ArrayList<Encomenda>();
    List<Livro> listLivronaencomenda = new ArrayList<Livro>();



    public Encomenda () {}

    public Encomenda(int id, String date, ArrayList<Livro> listLivronaencomenda, String destinatario, String morada, int estado, int preco,int deconto) {
        estado = 1; //1-por entregar 2- parcialmnente entregue 3- entregue
        this.idEncomenda = id;
        this.date = formattedDate;
        this.listLivronaencomenda=listLivronaencomenda;
        this.destinatario=destinatario;
        this.morada =morada;
        this.estado=estado;
        this.preco = preco;
        this.desconto = deconto;
    }


    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
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

    public void setlistLivronaencomenda(ArrayList<Livro> listLivronaencomenda) {this.listLivronaencomenda = listLivronaencomenda; }



    public Encomenda createOrder(int idEncomenda, String destinatario, String morada){

        Encomenda encomendatemp = new Encomenda();
        List<Livro> listTemp = new ArrayList<Livro>();
        encomendatemp.setIdEncomenda(idEncomenda);
        encomendatemp.setdate();
        System.out.println("Encomenda com id " + idEncomenda+ " adicionada À lista de encomendas");
        encomendatemp.setlistLivronaencomenda((ArrayList<Livro>) listTemp);
        encomendatemp.setDestinatario(destinatario);
        encomendatemp.setMorada(morada);
        listEncomenda.add(encomendatemp);
        return encomendatemp;
    }


    public Encomenda updateestadoencomenda(int id, int estado){

        for(int index = 0; index < listEncomenda.size(); index ++){
            if(listEncomenda.get(index).getIdEncomenda()==id){
                return listEncomenda.get(index);
            }
        }
        return null;
    }


    public List<Encomenda> returnallencomenda(){return listEncomenda;}


    public void listitensOrder(Encomenda enc){
        for(int index = 0; index < enc.getlistLivronaencomenda().size(); index++){
            System.out.println(enc.getlistLivronaencomenda().get(index).getNome());
        }

    }

    public void emailnotificacaoencomendax(int id){

        int estado = 0;
        String morada = "";
        String nome = "";
        preco =0;

        System.out.println("Livros Pertencentes À encomenda com id: "+id);
        for(int index =0;index < listEncomenda.size();index++){
            if(listEncomenda.get(index).getIdEncomenda() == id){
                for(int index2 = 0; index2 < listEncomenda.get(index).getlistLivronaencomenda().size(); index2++){
                    System.out.println(listEncomenda.get(index).getlistLivronaencomenda().get(index2).getNome());
                    preco = preco + listEncomenda.get(index).getlistLivronaencomenda().get(index2).getPreco();
                    estado = listEncomenda.get(index).getEstado();
                    morada = listEncomenda.get(index).getMorada();
                    nome = listEncomenda.get(index).getDestinatario();
                }
            }

        }
        System.out.println("/---------------- Fatura da encomenda enviada para o email "+ nome +"@gmail.com-----------------------------------/");
        System.out.println("Livros Pertencentes À encomenda com id: "+id);
        System.out.println("PREÇO DA ENCOMENDA: " + preco);
        System.out.println("Morada da encomenda: " + morada);
        System.out.println("Estado encomenda: " + estado + "sendo que 1- por entregar 2- parcialmente entregue 3- entregue");
        System.out.println("/------------------------------------------/ \n \n \n \n \n \n \n \n ");
    }







    public int additensOrder(int idEncomenda, Livro livro, String nomelivro){

        for (int index =0; index < listEncomenda.size(); index ++) {
            if (idEncomenda == listEncomenda.get(index).getIdEncomenda()) {
                for (int index2 = 0; index2 < livro.getalllivros().size(); index2++)
                    if (livro.getalllivros().get(index2).getNome().matches(nomelivro)) {
                        listEncomenda.get(index).getlistLivronaencomenda().add(livro.getalllivros().get(index2));
                    }
            }
        }
        return 1;
    }


    public void enviarencomenda(int id){

        for(int index =0;index < listEncomenda.size();index++) {
            if (listEncomenda.get(index).getIdEncomenda() == id) {
                for (int index2 = 0; index2 < listEncomenda.get(index).getlistLivronaencomenda().size(); index2++) {
                    System.out.println(listEncomenda.get(index).getlistLivronaencomenda().get(index2).getNome());
                }
            }

        }
    }



    public void listallOrder(){

        int idtemp = 1;
        System.out.println("/------------------- Lista de Encomendas feitas -------------------//");
        for (int index =0; index < listEncomenda.size(); index ++){

            System.out.println("Id Encomenda:" + listEncomenda.get(index).getIdEncomenda() + ", Data Encomenda:" + listEncomenda.get(index).getdate() + ", Destinatario:" +listEncomenda.get(index).getDestinatario() + ", Morada Entrega: " +listEncomenda.get(index).getMorada());
            System.out.println("Lista de livros na encomenda:");
            listitensOrder(listEncomenda.get(index));
            System.out.println("/------------------------------------------------------------------//");
        }


    }


}
