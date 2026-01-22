package ProductManagement;

public class Product {
    private String name;
    private int price;

    public void setProduct(String n,int p){
        name=n;
        price=p;
    }

    public void show(){
        System.out.println(name+ " ₹ "+price);
    }

    public static void main(String[] args) {
        Product p=new Product();
        p.setProduct("Mobile",15000);
        p.show();
    }
}
