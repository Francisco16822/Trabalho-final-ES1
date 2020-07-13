import java.util.Scanner;



public class main {

    public static void main(String[] args) throws InterruptedException {
/*
        User test = new User();
        scanner scan = new scanner(system.in);
        scanner scan2 = new scanner(system.in);
        int choice = 0;
        string usernamescan="";
        string passwordscan="";
        string[] e = {};
        test.createuser("tiago","12345");
        test.createuser("joao","13232131");
        test.createuser("joao","13232131");
        test.createuser("joao","13232131");
        test.createuser("joao","13232131");
        test.createuser("joao","13232131");
        test.createuser("joao","13232131");

        user user = new user();

        test.loginuser("tiago","12345");



        test.listalluser();


        livro livrotest = new livro();
        encomenda enc = new encomenda();
        voucher vou = new voucher();


        livrotest.addlivro("lusiadas",10,10);
        livrotest.addlivro("maias",10,5);
        livrotest.addlivro("autobdc",15,7);
        livrotest.addlivro("autobdc",15,7);
        livrotest.addlivro("autobdc",15,7);
        livrotest.listalllivros();


        enc.createorder(1,"joao","viseu");
        enc.createorder(2,"macaco","aveiro");
        enc.createorder(3,"urso","guarda");
        enc.additensorder(1,livrotest,"maias");
        enc.additensorder(1,livrotest,"lusiadas");
        enc.additensorder(1,livrotest,"maias");
        enc.additensorder(2,livrotest,"maias");
        enc.additensorder(2,livrotest,"maias");
        enc.emailnotificacaoencomendax(1);
        enc.emailnotificacaoencomendax(2);
        enc.emailnotificacaoencomendax(3);
        //enc.listallorder();
        vou.addvoucher("promoçao natal", 30);
        vou.addvoucher("promoçao primavera", 10);
        vou.listallvouchers();*/



/*
        Livro eieie = new Livro(5,"tiago",1,3);
        Voucher vouvou = new Voucher().addvoucher("Pintocosta",100);
        Encomenda enc = new Encomenda().createOrder(1,"tiago","viseu");
        User usertest = new User().CreateUser("Valoodian","1234");

        coco.adicionarencomenda(enc);
        coco.adicionarlivro(eieie);
        coco.adicionarVoucher(vouvou);
        coco.adicionarUser(usertest);

        coco.listarlivrorepo();
        coco.listarVoucherrepo();
        coco.listarEncomendarepo();
        coco.listarUserrepo();


        Repositorio coco = new Repositorio();
        EnvioEncomenda teste = new EnvioEncomenda().CreateEnvioEncomenda(1,2,3);
        coco.adicionarEnvioEncomenda(teste);
        coco.listarEnvioEncomendaRepo();



        Livro testlivro =new Livro();
        testlivro.setNome("maias");
        testlivro.setQtdStk(10);
        testlivro.setPreco(5);

        Livro testlivro2 =new Livro();
        testlivro2.setNome("lusiadas");
        testlivro2.setQtdStk(10);
        testlivro2.setPreco(10);
        Encomenda enco = new Encomenda();
        enco.createOrder(1,"Joao","Viseu");
        enco.createOrder(2,"Macaco","Aveiro");
        enco.createOrder(3,"Urso","Guarda");
        enco.createOrder(4,"Paralelepipedo","Algarve");
        enco.additensOrder(2,testlivro,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(2,testlivro2,"Joao");
        enco.additensOrder(3,testlivro,"Joao");
        enco.additensOrder(3,testlivro2,"Joao");
        enco.additensOrder(3,testlivro2,"Joao");
        enco.additensOrder(3,testlivro2,"Joao");
        enco.additensOrder(3,testlivro2,"Joao");
        enco.additensOrder(3,testlivro2,"JoaoJoao");
        enco.additensOrder(3,testlivro2,"Joao");
        enco.additensOrder(4,testlivro2,"Joao");
        enco.additensOrder(4,testlivro2,"Joao");
        enco.additensOrder(1,testlivro2,"Joao");
        enco.additensOrder(1,testlivro2,"Joao");
        enco.listallOrder();
        testlivro.listallLivros();
*/

        Repositorio repositorio = new Repositorio();Funcionario user1 = new Funcionario("Tiago", "1234");
        Funcionario user2 = new Funcionario("Tiago", "123434");
        Funcionario user3 = new Funcionario("Tiago", "12345");
        repositorio.adicionarFuncionario(user1);
        repositorio.adicionarFuncionario(user2);
        repositorio.adicionarFuncionario(user3);
        repositorio.listarFuncionario();
        repositorio.loginFuncionario("Tiago","12");
        repositorio.loginFuncionario("Tiago","12345");
        Encomenda enco = new Encomenda(1, "12/05/2010", "Joao", "Viseu", 1,10);

        Livro livro = new Livro(1,"Lusiadas",2,20);
        repositorio.adicionarlivro(livro);
        repositorio.adicionarencomenda(enco);
        //repositorio.additensOrder(1,livro);
        repositorio.emailnotificacaoencomendax(1);
        //repositorio.updateestadoencomenda(1,2);
        repositorio.emailnotificacaoencomendax(1);
        Feedback feed1 = new Feedback(1,1,10);
        repositorio.adicionarFeedback(feed1);
        EntregaEncomenda entrega1 = new EntregaEncomenda(1,1,1,1);
        repositorio.adicionarEntregaEncomenda(entrega1);
        repositorio.listarEntregaEncomendaRepo();
        repositorio.listarencomendasporenviar();


        Voucher voucher1 = new Voucher(1,19,"Promoçãonatal");

        repositorio.adicionarvoucheraencomenda(1,voucher1);

        repositorio.adicionarlivroaencomenda(1,"Lusiadas",1);
        repositorio.adicionarlivroaencomenda(1,"Lusiadas",1);
        repositorio.listarencomendas();
        repositorio.emailnotificacaoencomendax(1);


        repositorio.listarlivrorepo();
        repositorio.retirarstocklivros("Lusiadas",2);
        repositorio.listarlivrorepo();

        EnvioEncomenda envio1 = new EnvioEncomenda(1,1,1,1);
        repositorio.adicionarEnvioEncomenda(envio1);

        repositorio.listarEnvioEncomendaRepo();

        repositorio.listarencomendasporenviar();
        repositorio.listarEncomendarepo();


    }
}

