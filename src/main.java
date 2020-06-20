import java.util.Scanner;



public class main {

    public static void main(String[] args) throws InterruptedException {
/*
        user test = new user();
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

        Repositorio coco = new Repositorio();

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

        */
        EnvioEncomenda teste = new EnvioEncomenda().CreateEnvioEncomenda(1,2,3);
        coco.adicionarEnvioEncomenda(teste);
        coco.listarEnvioEncomendaRepo();

/*

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
        enco.additensOrder(2,testlivro);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(2,testlivro2);
        enco.additensOrder(3,testlivro);
        enco.additensOrder(3,testlivro2);
        enco.additensOrder(3,testlivro2);
        enco.additensOrder(3,testlivro2);
        enco.additensOrder(3,testlivro2);
        enco.additensOrder(3,testlivro2);
        enco.additensOrder(3,testlivro2);
        enco.additensOrder(4,testlivro2);
        enco.additensOrder(4,testlivro2);
        enco.additensOrder(1,testlivro2);
        enco.additensOrder(1,testlivro2);



*/






        }
}

