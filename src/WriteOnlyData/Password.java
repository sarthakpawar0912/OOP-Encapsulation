package WriteOnlyData;

public class Password {
    private String pass;

    public void setPass(String p) {
         pass=p;
        System.out.println(
                "Password set Successfully"
        );
    }

    public static void main(String[] args) {
        Password p= new Password();
        p.setPass("mysecret123345455");
    }
}
