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

    public Voucher(int id, int desconto, String Nome) {
        this.id = id;
        this.desconto = desconto;
        this.Nome=Nome;

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

/*
    public void aplicarVoucher(Encomenda enc, String nomeVoucher){

        for(int index =0; index < listaVoucher.size(); index ++) {
            if (nomeVoucher.matches(listaVoucher.get(index).getNome())) {
                enc.setDesconto(listaVoucher.get(index).getDesconto());
            }
        }
    }*/
}



