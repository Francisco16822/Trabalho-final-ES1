import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String Username = "";
    private String Password = "";
    List<Funcionario> listFuncionario = new ArrayList<Funcionario>();


    public Funcionario () {}

    public Funcionario(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Funcionario CreateFuncionario(String Username, String Password){


        for (int index =0; index < listFuncionario.size(); index ++){

            if(listFuncionario.get(index).getUsername() == Username){

                System.out.println("Usuário Repetido");
                return null;

            }
        }
        Funcionario Funcionariotest = new Funcionario();
        Funcionariotest.setUsername(Username);
        Funcionariotest.setPassword(Password);
        System.out.println("Username:"+ Username + "with SUCESS");
        listFuncionario.add(Funcionariotest);
        return Funcionariotest;
    }







    public void listallUser(){

        for (int index =0; index < listFuncionario.size(); index ++){

            System.out.println(listFuncionario.get(index).getUsername());
            System.out.println(listFuncionario.get(index).getPassword());

        }


    }



}
