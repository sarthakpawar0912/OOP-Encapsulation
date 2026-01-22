package StudentAdmissionSystem;

public class Admission {
    private int marks;
    public void setmatrks(int m){
        if(m>=0 && m<=100){
            marks=m;
        }
    }

    public void check(){
        if(marks>=70){
            System.out.println("Admission granted");
        }else {
            System.out.println("Admission Rejected");
        }
    }

    public static void main(String[] args) {
        Admission a=new Admission();
        a.setmatrks(88);
        a.check();
    }
}
