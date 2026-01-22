package LoginSystem;

public class Login {
    private String username="admin";
    private String password="1234";

    public  boolean authenticate(String u,String p){
        return username.equals(u) && password.equals(p);
    }

    public static void main(String[] args) {
        Login l=new Login();
        System.out.println(l.authenticate("admin","1234"));

    }
}
