package ReadOnlyData;

public class Aadhaar {
    private String  number="1234-5678-9012";

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Aadhaar aadhaar=new Aadhaar();
        System.out.println("Aadhar Number: "+aadhaar.getNumber());
    }
}
