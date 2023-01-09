import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        String[] products = {"Tshirts","Jeans","Tops"};
        Seller s1 = new Seller(1,"SriVinayaka","Borivali Mumbai","Clothing",products);
        System.out.println(Arrays.toString(s1.products));

        Product p1 = new Product(1,"Women's Blue Jeans Pant","Clothing","SriVinayaka",1200.00,0.05,1140.00);
        Customer c1 = new Customer(1,"Meghana","M","Jayanagar 1st block Bengaluru","9900112210");

        Order o1 = new Order(1,1140.00,1,1,"online","Paid");

        System.out.println("Order details : "+o1.orderId+ " "+ o1.amount+ " " + o1.paymentType+ " "+o1.paymentStatus);

    }
}
