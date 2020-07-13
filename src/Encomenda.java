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
    private int preco=0;
    int desconto;
    Voucher voucher;

    List<Encomenda> listEncomenda = new ArrayList<Encomenda>();
    List<Livro> listLivronaencomenda = new ArrayList<Livro>();



    public Encomenda () {}

    public Encomenda(int id, String date, String destinatario, String morada, int estado,int deconto) {
        estado = 1; //1-por entregar 2- parcialmnente entregue 3- entregue
        this.idEncomenda = id;
        this.date = formattedDate;
        this.destinatario=destinatario;
        this.morada =morada;
        this.estado=estado;
        this.preco = preco;
        this.desconto = deconto;
        this.voucher = null;
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

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public void setlistLivronaencomenda(List<Livro> listLivronaencomenda) {this.listLivronaencomenda = listLivronaencomenda; }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
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
