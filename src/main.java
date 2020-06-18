import java.util.Scanner;



public class main {

    public static void main(String[] args) throws InterruptedException {

        User test = new User();
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int choice = 0;
        String usernameScan="";
        String passwordScan="";
        String[] e = {};
        test.CreateUser("tiago","12345");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");

        User user = new User();

        test.loginuser("tiago","12345");



        test.listallUser();


        Livro livrotest = new Livro();
        Encomenda enc = new Encomenda();
        Voucher vou = new Voucher();


        livrotest.addLivro("lusiadas",10,10);
        livrotest.addLivro("maias",10,5);
        livrotest.addLivro("autobdc",15,7);
        livrotest.listallLivros();


        enc.createOrder(1,"Joao","Viseu");
        enc.createOrder(2,"Macaco","Aveiro");
        enc.createOrder(3,"Urso","Guarda");
        enc.additensOrder(1,livrotest,"maias");
        enc.additensOrder(1,livrotest,"lusiadas");
        enc.additensOrder(1,livrotest,"maias");
        enc.additensOrder(2,livrotest,"maias");
        enc.additensOrder(2,livrotest,"maias");
        enc.emailnotificacaoencomendax(1);
        //enc.listallOrder();
        vou.addvoucher("promoçao natal", 30);
        vou.addvoucher("promoçao primavera", 10);
        vou.listallVouchers();








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

