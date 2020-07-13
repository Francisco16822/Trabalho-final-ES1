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





}
