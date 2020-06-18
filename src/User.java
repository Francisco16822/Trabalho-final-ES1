import java.util.ArrayList;
import java.util.List;

public class User {

    private String Username = "";
    private String Password = "";
    List<User> listUser = new ArrayList<User>();


    public User () {}

    public User(String Username, String Password) {
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

    public int CreateUser(String Username, String Password){


        for (int index =0; index < listUser.size(); index ++){

            if(listUser.get(index).getUsername() == Username){

                System.out.println("Usuário Repetido");
                return 1;

            }

        }

        User usertest = new User();
        usertest.setUsername(Username);
        usertest.setPassword(Password);

        System.out.println("Username:"+ Username + "with SUCESS");

        listUser.add(usertest);
        return 0;
    }


    int loginuser(String username,String password){

        for (int index = 0; index < listUser.size(); index ++){
            if(username.matches(listUser.get(index).getUsername()) && password.matches(listUser.get(index).getPassword())){
                System.out.println("Login With Success");
                return 1;
            }
            System.out.println("Login Error....");
        }
        return 0;
    }



    public void listallUser(){

        for (int index =0; index < listUser.size(); index ++){

            System.out.println(listUser.get(index).getUsername());
            System.out.println(listUser.get(index).getPassword());

        }


    }



}
