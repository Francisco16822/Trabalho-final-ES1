import java.util.ArrayList;
import java.util.List;

public class Voucher {

    private int desconto;
    private int id ;
    private String Nome = "";
    int lastId = 1;
    List<Voucher> listaVoucher = new ArrayList<Voucher>();
    Voucher temp;

    public Voucher () {}

    public Voucher(int id, int desconto) {
        this.id = id;
        this.desconto = desconto;


    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addvoucher(String nome, int desconto){

        Voucher teste= new Voucher();
        for(int index = 0; index < listaVoucher.size(); index ++) {
            if (listaVoucher.get(index).getNome().matches(nome)) {
                System.out.println("Voucher com mesmo nome já criado.");
                return;
            }
        }

        teste.setId(lastId);
        teste.setNome(nome);
        teste.setDesconto(desconto);
        listaVoucher.add(teste);
        lastId = lastId + 1;
    }

    public void listallVouchers() {

        System.out.println("Lista de Vouchers:");
        for (int index = 0; index < listaVoucher.size(); index++) {
            System.out.println("Id:" + listaVoucher.get(index).getId()+", Nome:" + listaVoucher.get(index).getNome()+", " + listaVoucher.get(index).getDesconto());
        }
    }
}



