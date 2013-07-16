

package menu;


public class User {
    
    private int id = 0;
    private String login = "";
    private String password = "";
    
    public User(String login, String password, int id){
        this.login = login;
        this.password = password;
        this.id = id;
    }
    public User(){
        
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
