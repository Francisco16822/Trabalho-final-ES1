

public class main {

    public static void main(String[] args ) throws InterruptedException {

        User test = new User();

        test.CreateUser("tiago","12345");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");
        test.CreateUser("joao","13232131");


        test.listallUser();


        Livro livrotest = new Livro();

        livrotest.addLivro("lusiadas",10);
        livrotest.listallLivros();



        Livro testlivro =new Livro();
        testlivro.setNome("adb");
        testlivro.setQtdStk(10);

        Livro testlivro2 =new Livro();
        testlivro2.setNome("lusiadas");
        testlivro2.setQtdStk(10);


        Encomenda enco = new Encomenda();
        enco.createOrder(1);
        enco.createOrder(2);
        enco.createOrder(3);
        enco.createOrder(4);
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

        enco.listallOrder();




    }
}
