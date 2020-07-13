import java.util.ArrayList;
import java.util.List;

public class Repositorio {


    private static ArrayList<Livro> listlivro = new ArrayList<>();
    private static ArrayList<Voucher> listVoucher = new ArrayList<>();
    private static ArrayList<Encomenda> listencomenda = new ArrayList<>();
    private static ArrayList<Funcionario> listFuncionarios = new ArrayList<>();
    private static ArrayList<Transportadora> listTransportadora = new ArrayList<>();
    private static ArrayList<Feedback> listFeedback = new ArrayList<>();
    private static ArrayList<EnvioEncomenda> listEnvioEncomenda = new ArrayList<>();
    private static ArrayList<EntregaEncomenda> listEntregaEncomenda = new ArrayList<>();

    public Repositorio(){}

    public void adicionarFuncionario(Funcionario user){this.listFuncionarios.add(user);}
    public void adicionarlivro(Livro livro){this.listlivro.add(livro);}
    public void adicionarVoucher(Voucher voucher){this.listVoucher.add(voucher);}
    public void adicionarencomenda(Encomenda encomenda){this.listencomenda.add(encomenda);}
    public void adicionarTransportadora(Transportadora transportadora){this.listTransportadora.add(transportadora);}
    public void adicionarFeedback(Feedback feedback){this.listFeedback.add(feedback);}
    public void adicionarEnvioEncomenda(EnvioEncomenda envioEncomenda){this.listEnvioEncomenda.add(envioEncomenda);};
    public void adicionarEntregaEncomenda(EntregaEncomenda entregaEncomenda){this.listEntregaEncomenda.add(entregaEncomenda);}



    public void listarEntregaEncomendaRepo() {
        for (int index = 0; index < listEntregaEncomenda.size(); index++) {
            System.out.println("********************************************************");
            System.out.println("Id Envio Encomenda: "+listEntregaEncomenda.get(index).getId());
            System.out.println("Id Transportadora: "+listEntregaEncomenda.get(index).getTransportadoraId());
            System.out.println("Id Funcionario: "+listEntregaEncomenda.get(index).getFuncionarioId());
            System.out.println("Id encomenda: "+listEntregaEncomenda.get(index).getEncomendaId());
            System.out.println("Data Entrega: "+listEntregaEncomenda.get(index).getDate());
            System.out.println("********************************************************");
        }
    }

    public void listarEnvioEncomendaRepo() {
        for (int index = 0; index < listEnvioEncomenda.size(); index++) {
            System.out.println("********************************************************");
            System.out.println("Id Envio Encomenda: "+listEnvioEncomenda.get(index).getId());
            System.out.println("Id Transportadora: "+listEnvioEncomenda.get(index).getTransportadoraId());
            System.out.println("Id Funcionario: "+listEnvioEncomenda.get(index).getFuncionarioId());
            System.out.println("Id encomenda: "+listEnvioEncomenda.get(index).getEncomendaId());
            System.out.println("Data Envio: "+listEnvioEncomenda.get(index).getDate());
            System.out.println("********************************************************");
        }
    }


    public void listarTransportadorarepo() {
        for (int index = 0; index < listTransportadora.size(); index++) {
            System.out.println("********************************************************");
            System.out.println("Id Transportadora: "+listTransportadora.get(index).getId());
            System.out.println("Nome Transportadora: "+listTransportadora.get(index).getNome());
            System.out.println("********************************************************");
        }
    }


    public void listarFeedbackrepo() {
        for (int index = 0; index < listFeedback.size(); index++) {
            System.out.println("********************************************************");
            System.out.println("Id Feedback: "+listFeedback.get(index).getId());
            System.out.println("Id Encomenda: "+listFeedback.get(index).getEncomendaId());
            System.out.println("Avaliacao: "+listFeedback.get(index).getAvaliacao());
            System.out.println("********************************************************");
        }
    }


    public void listarlivrorepo() {

        for (int index = 0; index < listlivro.size(); index++) {
            System.out.println("********************************************************");
            System.out.println("Id Livoro: "+listlivro.get(index).getId());
            System.out.println("Nome Livro: "+listlivro.get(index).getNome());
            System.out.println("Quantidade Stock Livro: "+listlivro.get(index).getQtdStk());
            System.out.println("********************************************************");

        }
    }

    int loginFuncionario(String username,String password){

        for (int index = 0; index < listFuncionarios.size(); index ++){
            if(username.matches(listFuncionarios.get(index).getUsername()) && password.matches(listFuncionarios.get(index).getPassword())){
                System.out.println("Login With Success");
                return 1;
            }
            System.out.println("Login Error....");
        }
        return 0;
    }




    public void listarFuncionario() {

        for (int index = 0; index < listFuncionarios.size(); index++) {
            System.out.println("********************************************************");
            System.out.println("Id Funcionario: "+listFuncionarios.get(index).getUsername());
            System.out.println("Nome Funcionario: "+listFuncionarios.get(index).getPassword());
            System.out.println("********************************************************");

        }
    }


    public void listarEncomendarepo() {
        System.out.println("Lista de encomendas dentro do repositório:");
        for (int index = 0; index < listencomenda.size(); index++) {
            System.out.println("********************************************************");
            System.out.println("Id Encomeda: "+listencomenda.get(index).getIdEncomenda());
            System.out.println("Data Criação: "+listencomenda.get(index).getdate());
            System.out.println("Destinatário: "+listencomenda.get(index).getDestinatario());
            System.out.println("Morada: "+listencomenda.get(index).getMorada());
            System.out.println("Preço Encomenda: "+  listencomenda.get(index).getPreco());
            System.out.println("Estado: "+listencomenda.get(index).getEstado() + " 1- por entregar  2- parcialmente entregue 3- entregue");
            System.out.println("********************************************************");
        }
    }

        public void listarVoucherrepo() {

            for (int index = 0; index < listVoucher.size(); index++) {
                System.out.println("********************************************************");
                System.out.println("Id Voucher: "+listVoucher.get(index).getId());
                System.out.println("Nome Voucher: "+listVoucher.get(index).getNome());
                System.out.println("Desconto Voucher: "+listVoucher.get(index).getDesconto());
                System.out.println("********************************************************");
            }
    }

    public void createOrder(Encomenda enco){
        listencomenda.add(enco);
    }


    public void emailnotificacaoencomendax(int id){

        int estado = 0;
        String morada = "";
        String nome = "";
        int preco =0;

        System.out.println("Livros Pertencentes À encomenda com id: "+id);
        for(int index =0;index < listencomenda.size();index++){
            if(listencomenda.get(index).getIdEncomenda() == id){
                estado = listencomenda.get(index).getEstado();
                morada = listencomenda.get(index).getMorada();
                nome = listencomenda.get(index).getDestinatario();
               for(int index2 = 0; index2 < listencomenda.get(index).getlistLivronaencomenda().size(); index2++){
                    System.out.println(listencomenda.get(index).getlistLivronaencomenda().get(index2).getNome());
                    preco = preco + listencomenda.get(index).getlistLivronaencomenda().get(index2).getPreco();

                }
            }
        }
        System.out.println("/---------------- Fatura da encomenda enviada para o email "+ nome +"@gmail.com-----------------------------------/");
        System.out.println("Livros Pertencentes À encomenda com id: "+id);
        System.out.println("Morada da encomenda: " + morada);
        System.out.println("Estado encomenda: " + estado + "sendo que 1- por entregar 2- parcialmente entregue 3- entregue");
        System.out.println("/------------------------------------------/ \n \n \n \n \n \n \n \n ");
    }


    public void listarencomendasporenviar(){

        int estado = 0;
        String morada = "";
        String nome = "";
        int preco =0;

        System.out.println("Encomenda por entregar: ");
        for(int index =0;index < listencomenda.size();index++){
            if(listencomenda.get(index).getEstado() == 1){
                estado = listencomenda.get(index).getEstado();
                morada = listencomenda.get(index).getMorada();
                nome = listencomenda.get(index).getDestinatario();
                System.out.println("Livros Pertencentes À encomenda com id: "+ listencomenda.get(index).getIdEncomenda());
                for(int index2 = 0; index2 < listencomenda.get(index).getlistLivronaencomenda().size(); index2++){
                    System.out.println(listencomenda.get(index).getlistLivronaencomenda().get(index2).getNome() + " com o preço de "+ listencomenda.get(index).getlistLivronaencomenda().get(index2).getPreco());
                    preco = preco + listencomenda.get(index).getlistLivronaencomenda().get(index2).getPreco();
                }
                System.out.println("Morada da encomenda: " + morada);
                System.out.println("Estado encomenda: " + estado + "sendo que 1- por entregar 2- parcialmente entregue 3- entregue");
                System.out.println("Preço encomenda: " + preco);
                System.out.println("/------------------------------------------/ \n \n \n \n \n \n \n \n ");
            }
        }

    }

    public void updateestadoencomenda(int id, int estado){

        for(int index = 0; index < listencomenda.size(); index ++){
            if(listencomenda.get(index).getIdEncomenda()==id){
                listencomenda.get(index).setEstado(estado);
            }
        }
    }

    public void adicionarvoucheraencomenda(int idencomenda, Voucher voucher){

        for(int index = 0; index < listencomenda.size(); index ++){
            if(listencomenda.get(index).getIdEncomenda()==idencomenda){
                listencomenda.get(index).setVoucher(voucher);
            }
        }

    }


    public void listarencomendas(){


        for(int index =0;index < listencomenda.size();index++){

                System.out.println("/---------------- Fatura da encomenda de "+ listencomenda.get(index).getDestinatario() +"@gmail.com-----------------------------------/");
                System.out.println("Livros Pertencentes À encomenda com id: "+listencomenda.get(index).getId());
                System.out.println("Morada da encomenda: " + listencomenda.get(index).getMorada());
                System.out.println("Estado encomenda: " + listencomenda.get(index).getEstado() + "sendo que 1- por entregar 2- parcialmente entregue 3- entregue");
                System.out.println("Voucher: " + listencomenda.get(index).getVoucher().getNome());
                System.out.println("/------------------------------------------/ \n \n \n \n \n \n \n \n ");


            }
        }


    public void retirarstocklivros(String nome, int stock){
     int valortemp;
        for(int index = 0; index < listlivro.size(); index ++){
            if(listlivro.get(index).getNome()==nome){
                valortemp = listlivro.get(index).getQtdStk();
                valortemp = valortemp - stock;
                listlivro.get(index).setQtdStk(valortemp);
            }
        }

    }

    public void adicionarlivroaencomenda(int id, String livro, int qtdstock){

        List<Livro> temp = new ArrayList<Livro>();
        for(int index =0;index < listencomenda.size();index++){
            if(listencomenda.get(index).getIdEncomenda() == id){
               temp = listencomenda.get(index).getlistLivronaencomenda();
              for(int index2 = 0; index2 < listlivro.size();index2++)
               if(listlivro.get(index).getNome().matches(livro))
                  temp.add(listlivro.get(index));
                  listencomenda.get(index).setlistLivronaencomenda(temp);
                  int temp1 =listencomenda.get(index).getPreco();
                  temp1 = temp1 + listlivro.get(index).getPreco();
                  listencomenda.get(index).setPreco(temp1);
                }

        }

    }

    }




