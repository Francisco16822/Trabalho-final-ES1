import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    private static ArrayList<User> listUser = new ArrayList();
    private static ArrayList<Livro> listlivro = new ArrayList<>();
    private static ArrayList<Voucher> listVoucher = new ArrayList<>();
    private static ArrayList<Encomenda> listencomenda = new ArrayList<>();
    private static ArrayList<Funcionario> listFuncionarios = new ArrayList<>();
    private static ArrayList<Transportadora> listTransportadora = new ArrayList<>();
    private static ArrayList<Feedback> listFeedback = new ArrayList<>();
    private static ArrayList<EnvioEncomenda> listEnvioEncomenda = new ArrayList<>();

    public Repositorio(){}

    public void adicionarUser(User user){this.listUser.add(user);}
    public void adicionarlivro(Livro livro){this.listlivro.add(livro);}
    public void adicionarVoucher(Voucher voucher){this.listVoucher.add(voucher);}
    public void adicionarencomenda(Encomenda encomenda){this.listencomenda.add(encomenda);}
    public void adicionarFuncionario(Funcionario funcionario){this.listFuncionarios.add(funcionario);}
    public void adicionarTransportadora(Transportadora transportadora){this.listTransportadora.add(transportadora);}
    public void adicionarFeedback(Feedback feedback){this.listFeedback.add(feedback);}
    public void adicionarEnvioEncomenda(EnvioEncomenda envioEncomenda){this.listEnvioEncomenda.add(envioEncomenda);}



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


    public void listarFuncionario() {

        for (int index = 0; index < listFuncionarios.size(); index++) {
            System.out.println("********************************************************");
            System.out.println("Id Funcionario: "+listFuncionarios.get(index).getId());
            System.out.println("Nome Funcionario: "+listFuncionarios.get(index).getNome());
            System.out.println("********************************************************");

        }
    }

    public void listarUserrepo() {

        for (int index = 0; index < listUser.size(); index++) {
            System.out.println("********************************************************");
            System.out.println("USERNAME: "+listUser.get(index).getUsername());
            System.out.println("Pass: "+listUser.get(index).getPassword());
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





}



