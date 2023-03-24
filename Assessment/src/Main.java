import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] product = null;
        ProductDAO productDAO = new ProductDAO();
        int choice = 0;
        do {
            System.out.println("*********Menu**********");
            System.out.println("1-add product");
            System.out.println("2-print product");
            System.out.println("3-update product");
            System.out.println("4-delete product");
            System.out.println("5-exit");
            System.out.println("please enter your choice");
            choice = sc.nextInt();
            int id = 0;
            switch (choice){
                case 1:
                    // TODO: 3/24/23
//                    System.out.println("please add 10 products");
                    System.out.println("how many product you want to add: ");
                    int num = sc.nextInt();
                    product = new Product[num];
                    for (int i = 0; i < product.length; i++) {
                        productDAO.createRecord(product, i);
                    }
                    break;
                case 2:
                    productDAO.readRecord(product);
                    break;
                case 3:
                    System.out.println("what is the product id you want to update");
                    id = sc.nextInt();
                    productDAO.updateRecord(product, id);
                    break;
                case 4:
                    System.out.println("what is the product id you want to delete");
                    id = sc.nextInt();
                    productDAO.deleteRecord(product, id);
                    break;
                case 5:
                    System.exit(0);
            }
        }while (choice != 5);
    }
}