public class Main {

    public static void main(String[] args) {
        Product product = new Product();

        product.set_name("Asus");
        product.set_description("ROG 5");
        product.set_price(2500);
        product.set_stockAmount(3);

        ProductManager productManager = new ProductManager();

        //productManager.Add(product.name, product.description, product.stockAmount, product.price);

        productManager.Add(product);

    }
}
