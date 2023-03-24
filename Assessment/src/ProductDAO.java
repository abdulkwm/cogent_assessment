import java.util.Scanner;

public class ProductDAO {
    Scanner sc = new Scanner(System.in);
    public void createRecord(Product product[],int i) {
        Product product1 = new Product();
        product[i] = product1;
        System.out.println("enter product id");
        product[i].setProductId(sc.nextInt());
        System.out.println("enter the product title");
        product[i].setProductName(sc.next());
        System.out.println("enter product price");
        product[i].setPrice(sc.nextFloat());
    }
    public void readRecord(Product [] product) {
        for (Product p: product){
            if (p == null)
                continue;
            else
                System.out.println("product id is: " + p.getProductId());
                System.out.println("product name is: " + p.getProductName());
                System.out.println("product price is: " + p.getPrice());
        }
    }
    public void updateRecord(Product[] product, int id) {
        for (int i = 0; i < product.length; i++){
            if (product[i] == null)
                continue;
            else if (product[i].getProductId() == id) {
                System.out.println("update the name to: ");
                product[i].setProductName(sc.next());
                System.out.println("update the price to: ");
                product[i].setPrice(sc.nextFloat());
                System.out.println("product is updated");
            }
        }
    }
    public void deleteRecord(Product[] product, int id) {
        for (int i = 0; i < product.length; i++){
            if (product[i].getProductId() == id) {
                product[i] = null;
                System.out.println("product is deleted");
            }
        }
    }
}
