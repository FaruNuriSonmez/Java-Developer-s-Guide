public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Asus";
        product.price = 255;

        manager.add(product);

        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
    }
}
